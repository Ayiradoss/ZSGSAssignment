/*1. Write a Java program

  a. to create a new array list, add some colours (string) and print out the collection.
  b. to iterate through all elements in an array list.
  c. to insert an element into the array list at the first position.
  d. to retrieve an element (at a specified index) from a given array list.
  e. to update specific array element by given element.
  f. to remove the third element from an array list.
  g. to search an element in an array list.
  h. to sort a given array list.
  i. to copy one array list into another.
  j. to shuffle elements in an array list.

*/

//1. Write a Java program to read the contents of a text file and display it on the console.

class ReadFile
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("Sample.txt");
			if(file.createNewFile())
			{
				System.out.println("file Created Successfully : " + file.getName());
			}
			else
			{
				System.out.println("File Altready Exists ");
			}
			
			FileWriter fw = new FileWriter(file);
			fw.write("Hello!, My Name is Karthik");
			System.out.println("Writing Content Successfully ");
			fw.flush();
			
			Scanner read = new Scanner(file);
			while(read.hasNextLine())
			{
				System.out.println(read.nextLine());
			}
			
			fw.close();
			read.close(); 
		}
		catch(IOException e)
		{
			System.out.print("")
		}
	}
}

/*1. Write a Java program to demonstrate multithreading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 
    milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.*/

class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
	    {
		    System.out.println(Thread.currentThread().getName() + " - " + i);
		    try{
				Thread.sleep(500);
			}
			catch(InterruptedException _){
			    
			}
     	}
	}
}
class MyThreadMain
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
 	}
}

/*2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay 
    of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both 
    threads.
--->The console should reflect the concurrent execution of both tasks.*/

class TaskRunner implements Runnable
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{		
	    	System.out.println(i + " - " + Thread.currentThread().getName());
		    try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
		}	
	}
}
class Main
{
	public static void main(String[] args)
	{
		TaskRunner r1 = new TaskRunner();
		Thread t1 = new Thread(r1);
		TaskRunner r2 = new TaskRunner();
		Thread t2 = new Thread(r2);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}
}

/*4. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 
     1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).*/
	 
class PrintNumber
{
	private int number = 1;
    private int max = 20;
    public synchronized void oddNumber()
	{
	    while(number <= max)
		{
			while(number % 2 == 0)
			{
				try{
			        wait();
				}
				catch(InterruptedException e){
				}
			}
	        if(number <= max)
		    {
			    System.out.println("Odd Thread " + number);
				number++;
				notify();
		    }
		}
	}
	public synchronized void evenNumber()
	{
		while(number <= max)
		{
			while(number % 2 != 0)
			{
				try{
					wait();
				}
				catch(InterruptedException e){
				}
			}
			if(number <= max)
			{
				System.out.println("Even Number " + number);
				number++;
				notify();
			}
		}
	}
}
class OddEvenThread
{
	public static void main(String[] args)
	{
		PrintNumber p = new PrintNumber();
		
		Thread odd = new Thread(() -> p.oddNumber());
		Thread even = new Thread(() -> p.evenNumber());
		
		odd.start();
		even.start();
	}
}

/*‌4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 
     1000 times. Use synchronization to avoid race conditions and display the final value.*/
	 
class Counter
{
	private int count = 0;
	public synchronized void increment()
	{
		count++;
	}
	public int getCount()
	{
		return count;
	}
}
class ThreadCounter
{
	public static void main(String[] args)
	{
		Counter c = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 1000; i++)
			{
				c.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 1000; i++)
			{
				c.increment();
			}
		});
		
		Thread t3 = new Thread(()->{
			for(int i = 0; i < 1000; i++)
			{
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		try{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e){
		}
		
		System.out.println("Final Counter Value : " + c.getCount());
	}
}

/*‌5. Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.*/

class Buffer 
{
    private LinkedList<Integer> list = new LinkedList<>();
    private int LIMIT = 5;

    public synchronized void produce(int value) throws InterruptedException 
	{
        while (list.size() == LIMIT)
		{
            wait();
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException 
	{
        while (list.isEmpty()) 
		{
            wait();
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify();
    }
}
class ProducerConsumer 
{
    public static void main(String[] args) 
	{
        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            int value = 1;
            try{
                for(int i=0;i<5;i++)
				{
                    b.produce(value++);
                    Thread.sleep(500);
                }
            } 
			catch (InterruptedException e) {
            }
        });

        Thread consumer = new Thread(() -> {
            try{
                 for(int i=0;i<5;i++) 
				{
                    b.consume();
                    Thread.sleep(800);
                }
            } 
			catch(InterruptedException e){
            }
        });

        producer.start();
        consumer.start();
    }
}

/*Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where create thread 
to check the PIN number, another thread to perform the cash withdrawal, another one to check the balance 
amount and print the receipt.*/

class ATM 
{
    private int balance = 5000;
    private String correctPin = "1234";
    private boolean pinVerified = false;
    private boolean cashWithdrawn = false;

    public synchronized void checkPin(String pin) 
	{
        if (pin.equals(correctPin)) 
		{
            System.out.println("PIN verified successfully.");
            pinVerified = true;
        } 
		else 
		{
            System.out.println("Invalid PIN. Exiting...");
            System.exit(0);
        }
    }

    public synchronized void withdrawCash(int amount) 
	{
        if (!pinVerified) 
		{
            System.out.println("PIN not verified. Cannot withdraw.");
            return;
        }
        if (amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            cashWithdrawn = true;
        } 
		else 
		{
            System.out.println("Insufficient balance.");
        }
    }

    public synchronized void checkBalance() 
	{
        if (!pinVerified) 
		{
            System.out.println("PIN not verified. Cannot check balance.");
            return;
        }
        System.out.println("Remaining Balance: " + balance);
    }

    public synchronized void printReceipt() 
	{
        if (!cashWithdrawn) 
		{
            System.out.println("No transaction to print.");
            return;
        }
        System.out.println("Receipt: Transaction Successful. Thank you!");
    }
}
class ATMThreads 
{
    public static void main(String[] args) 
	{
        ATM atm = new ATM();

        Thread pinThread = new Thread(() -> atm.checkPin("1234"));
        Thread withdrawThread = new Thread(() -> atm.withdrawCash(2000));
        Thread balanceThread = new Thread(() -> atm.checkBalance());
        Thread receiptThread = new Thread(() -> atm.printReceipt());

        try 
		{
            pinThread.start(); pinThread.join();
            withdrawThread.start(); withdrawThread.join();
            balanceThread.start(); balanceThread.join();
            receiptThread.start(); receiptThread.join();
        } 
		catch(InterruptedException e){
        }
    }
}
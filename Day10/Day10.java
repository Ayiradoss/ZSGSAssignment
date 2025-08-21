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
j. to shuffle elements in an array list. */
import java.util.*;
import java.util.Iterator;
class Qus1{
    public static void main(String args[]){
        ArrayList<String> li = new ArrayList<>();
        li.add("Red");
        li.add("Yellow");
        li.add("White");
        li.add("Black");
        System.out.print("a)Color List: "+li);

        System.out.println("\nb) Iterate all elements in the list: ");
        for(String color : li){
            System.out.println(color);
        }

        li.add(0,"White");
        System.out.println("\nc.Insert Element into : "+li);

        String element2 = li.get(2);
        System.out.println("\nd.Element at index 2: "+ element2);

        li.set(3,"Purple");
        System.out.println("\ne.After change index3 is: "+ li);

        li.remove(2);
        System.out.println("\nf.After remove 2nd element: "+li);

        String searchEle = "pink";
        if(li.contains(searchEle)){
            System.out.println(searchEle+" Found in list");
        }
        else{
            System.out.println(searchEle+ " Not found in list");
        }

        Collections.sort(li);
        System.out.println("\nh.After sorting list: "+li);

        ArrayList<String> copyli = new ArrayList<>(li);
        System.out.println("\ni.Copied list is: "+copyli);

        Collections.shuffle(li);
        System.out.println("\nj.Shuffled list is: "+ li);
    }
}

/*2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list. */

class Qus2{
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Dog");
    list.add("Cat");
    list.add("Cow");
    list.add("Goat");
    System.out.println("\na.Animal list is: "+list);   

    System.out.println("\nb.Iterating all elements in list: ");
    for(String animal : list){
        System.out.println(animal);
    }

    System.out.println("\nc.Iterating from 2elements: ");
    for(int i=2; i<list.size(); i++){
        System.out.println(list.get(i));
    }

    System.out.println("\nd.Iterating in reverse order:");
    for (int i = list.size() - 1; i >= 0; i--) {
        System.out.println(list.get(i));
    }

        list.add(2, "Fox");
        System.out.println("\ne.After inserting 'Fox' at index 2: " + list);

        list.addFirst("Lion");
        list.addLast("Tiger");
        System.out.println("\nf.After inserting 'lion' at first and 'Tiger' at last: " +list);

        list.offerFirst("Leapord");
        System.out.println("\ng.After inserting 'Leapord' at front: " + list);

        list.offerLast("Beare");
        System.out.println("\nh.After inserting 'Beare' at end: " + list);

        LinkedList<String> moreanimals = new LinkedList<>();
        moreanimals.add("Deer");
        moreanimals.add("Hyna");
        list.addAll(3, moreanimals);
        System.out.println("\ni.After inserting extra animals at index 3: " + list);

        list.add("Hippo"); 
        System.out.println("\n j.First occurrence of 'Hippo': " + list.indexOf("Hippo"));
        System.out.println(" Last occurrence of 'Hippo': " + list.lastIndexOf("Hippo"));
}
}

/*3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set. */
class Qus3{
    public static void main(String[] args) {
        LinkedHashSet<String> set= new LinkedHashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Orenge");
        System.out.println("a.Initial hashset is"+ set);

        for(String color: set){
            System.out.println(color);
        }
        
        System.out.println("\nc.Number of elements in hashset: "+set.size());

        HashSet<String> tempSet = new HashSet<>(set); 
        set.clear();
        System.out.println("\nd.After emptying, HashSet: " + set);

        System.out.println("\ne.Check is the set is empty? "+set.isEmpty());

        HashSet<String> copyset = new HashSet<>(tempSet);
        System.out.println("\nf.Copied list is: " + copyset);

        String[] array = copyset.toArray(new String[0]);
        System.out.println("\ng.HashSet to Array: ");
        for (String color : array){
            System.out.println(color);
        }

        TreeSet<String> treeSet = new TreeSet<>(copyset);
        System.out.println("\nh.HashSet to TreeSet: " + treeSet);

        ArrayList<String> arrayList = new ArrayList<>(copyset);
        System.out.println("\ni.HashSet to ArrayList: " + arrayList);

        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Red");
        anotherSet.add("Green");
        anotherSet.add("Blue");

        System.out.println("\nj.Comparing copyset with anotherSet:");
        for (String color : copyset) {
            System.out.println(color + " present in anotherSet? " + anotherSet.contains(color));
        }
    }
}

/*4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers, 
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set. */

class Qus4{
    public static void main(String args[]){
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println("\na.TreeSet: " +colors);

        System.out.println("\nb.Iterating TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }

        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.add("Pink");
        moreColors.addAll(colors);
        System.out.println("\nc.Another TreeSet after adding all: " + moreColors);

        NavigableSet<String> reverseColors = colors.descendingSet();
        System.out.println("\nd.Reverse order view: " + reverseColors);

        System.out.println("\ne.First element: " + colors.first());
        System.out.println(" Last element: " + colors.last());

        /*TreeSet<String> clonedSet = new TreeSet<>(colors);
        System.out.println("\nf.Cloned TreeSet: " + clonedSet);*/

        System.out.println("\ng.Number of elements in TreeSet: "+ colors.size());

        TreeSet<String> compareSet = new TreeSet<>();
        compareSet.add("Red");
        compareSet.add("Green");
        compareSet.add("Blue");
        System.out.println("\nh. Comparing TreeSets:");
        for (String c : colors) {
            System.out.println(c + " present in compareSet? " + compareSet.contains(c));
        }

        TreeSet<Integer> numset = new TreeSet<>();
        numset.add(1);
        numset.add(3);
        numset.add(5);
        numset.add(7);
        numset.add(9);
        numset.add(11);
        System.out.println("\nNumber TreeSet is: "+numset);

        System.out.println("\ni. Numbers less than 7: " + numset.headSet(7));

        System.out.println("\nj. Element >= 6: " + numset.ceiling(6));

        System.out.println("\nk. Element <= 6: " + numset.floor(6));

        System.out.println("\nl. Element > 6: " + numset.higher(6));

        System.out.println("\nm. Element < 6: " + numset.lower(6));

        System.out.println("\nn. Removed first element: " + numset.pollFirst());
        System.out.println("  TreeSet after removal: " + numset);

        System.out.println("\no. Removed last element: " + numset.pollLast());
        System.out.println("  TreeSet after removal: " + numset);

        numset.remove(5);
        System.out.println("\np) After removing element '5': " + numset);

    }
}

/*5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue. */

class Qus5{
    public static void main(String args[]){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Blue");
        pq.add("Yellow");
        pq.add("Black");
        System.out.println("1) PriorityQueue: " + pq);

        System.out.println("\n2) Iterating PriorityQueue:");
        for (String color : pq) {
            System.out.println(color);
        }

        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.addAll(pq);
        System.out.println("\n3) Second PriorityQueue after adding all: " + pq2);

        pq.offer("Pink");
        System.out.println("\n4) After inserting 'Pink': " + pq);

        pq.clear();
        System.out.println("\n5) After clearing PriorityQueue: " + pq);

        System.out.println("\n6) Number of elements in pq: " + pq.size());
        System.out.println("   Number of elements in pq2: " + pq2.size());

        System.out.println("\n7) Comparing pq2 with another PriorityQueue:");
        PriorityQueue<String> pq3 = new PriorityQueue<>();
        pq3.add("Red");
        pq3.add("Green");
        pq3.add("Blue");
        for (String color : pq2) {
            System.out.println(color + " present in pq3? " + pq3.contains(color));
        }

        System.out.println("\n8) First element of pq2: " + pq2.peek());

        System.out.println("\n9) Removed first element from pq2: " + pq2.poll());
        System.out.println("   PriorityQueue after removal: " + pq2);

        Object[] arr = pq2.toArray();
        System.out.println("\n10) PriorityQueue to Array:");
        for (Object element : arr) {
            System.out.println(element);
        }
    }
}

/*6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.*/

class Qus6{
    public static void main(String args[]){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Yellow");
        map.put(5, "Black");
        System.out.println("1) TreeMap: " + map);

        TreeMap<Integer, String> copyMap = new TreeMap<>(map);
        System.out.println("\n2) Copied TreeMap: " + copyMap);

        System.out.println("\n3) Key 3 exists? " + map.containsKey(3));

        System.out.println("\n4) Value 'Green' exists? " + map.containsValue("Green"));

        System.out.println("\n5) All Keys: " + map.keySet());

        map.clear();
        System.out.println("\n6) After clearing TreeMap: " + map);

        map.put(10, "Pink");
        map.put(8, "White");
        map.put(15, "Orange");
        map.put(12, "Purple");
        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);
        System.out.println("\n7) Keys sorted in reverse order: " + sortedMap);

        System.out.println("\n8) Greatest Entry: " + sortedMap.lastEntry());
        System.out.println("   Least Entry: " + sortedMap.firstEntry());

        System.out.println("\n9) First Key: " + sortedMap.firstKey());
        System.out.println("   Last Key: " + sortedMap.lastKey());

        System.out.println("\n10) Reverse Order Keys: " + sortedMap.descendingKeySet());
    }
}

/*7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map. */


class Qus7 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");
        System.out.println("1) HashMap: " + map);

        System.out.println("\n2) Size: " + map.size());

        HashMap<Integer, String> copyMap = new HashMap<>();
        copyMap.putAll(map);
        System.out.println("\n3) Copied Map: " + copyMap);

        map.clear();
        System.out.println("\n4) After clearing: " + map);

        System.out.println("\n5) Is Empty? " + map.isEmpty());

        /*map.put(10, "Orange");
        map.put(20, "Papaya");
        map.put(30, "Grapes");
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) map.clone();
        System.out.println("\n6) Shallow Copy: " + shallowCopy); */

        System.out.println("\n7) Contains Key 20? " + map.containsKey(20));

        System.out.println("\n8) Contains Value 'Grapes'? " + map.containsValue("Grapes"));

        System.out.println("\n9) Set View: " + map.entrySet());

        System.out.println("\n10) Value for Key 10: " + map.get(10));
    }
}

/*8. Develop a Java program to manage a list of bank accounts using ArrayList.

--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).

*/

class Account
{
	private int accountNumber;
	private String holderName;
	private Double balance;                   //AutoBoxing
	
	Account(int accountNumber, String holderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void applyInterestRate(Double interest)
	{
		double newBalance = balance + (balance * interest / 100); //UnBoxing
		balance = newBalance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
	
	public Double getBalance()
	{
		return balance;
	}
}

class Qus8
{
	public static void main(String[] args)
	{
		Double interest = 5.0; //Manual Boxing
		
		ArrayList<Account> al = new ArrayList<>();
		
	    al.add(new Account(23253, "Dass", 1500.00));
		al.add(new Account(26433, "Karthik", 1000.00));
		al.add(new Account(25363, "Ram", 1800.00));
		
		for(Account a : al)
		{
		    System.out.println("Account Number : " + a.getAccountNumber());
		    System.out.println("Account Holder Name : " + a.getHolderName());
		    System.out.println("Account Balance : " + a.getBalance());

			a.applyInterestRate(interest);
			
			double updateBalance = a.getBalance(); 
			
			System.out.println("Balance after 5% interest : " + updateBalance + "\n");
		}
	}
}

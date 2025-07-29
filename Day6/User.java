package travel.user;
import travel.booking.Ticket;
public class User {
    private int userID;
    private String name;

    public User(int userID, String name){
        this.userID= userID;
        this.name = name;
    }
    public void bookTicket(int ticketID, String destination, double fare){
        Ticket tic = new Ticket(ticketID, destination, fare);
        System.out.println("Ticked booked successfully");
        System.out.println("Name : "+name);
        System.out.println("User ID : "+userID);
        System.out.println("TicketID : "+tic.getTicketID());
        System.out.println("Destination : "+tic.getDestination());
        System.out.println("Fare amount : "+tic.getFare());
    }
    public static void main(String[] args) {
        User us = new User(23, "Ayiradass");
        us.bookTicket(100, "Tirunelveli", 1500.00);
    }
}

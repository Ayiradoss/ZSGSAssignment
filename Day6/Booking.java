package travel.booking;
public class Ticket {
 private int ticketID;
 private String destination;
 private double fare;

public Ticket(int ticketID, String destination, double fare){
    this.ticketID= ticketID;
    this.destination= destination;
    this.fare = fare;
}
    public int getTicketID(){
        return ticketID;
    }
    public String getDestination(){
        return destination;
    }
    public double getFare(){
        return fare;
    }
}


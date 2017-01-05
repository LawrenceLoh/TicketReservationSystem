/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.reservation.system;


/**
 *
 * @author User
 */
public class BusTicket extends Ticket {

    public BusTicket(Seat seat, Customer customer, String departureLocation, 
            String destination, String depatureTime, String arrivalTime) {
        super.price = "$30";
        super.seat = seat;
        super.customer = customer;
        super.departureLocation = departureLocation;
        super.destination = destination;
        super.depatureTime = depatureTime;
        super.arrivalTime = arrivalTime;
    }

    @Override
    protected String generateID() {
        return "R";
    }

    @Override
    public void printDetails() {
        System.out.println("Roadway TicketID:"+generateID()+"Price: "+price + ". Departure Location: "+departureLocation+". Destination:"+destination);
    }

}

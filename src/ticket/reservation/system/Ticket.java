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
public abstract class Ticket {
    protected String id;
    protected Seat seat;
    protected String price;
    protected Customer customer;
    protected String departureLocation;
    protected String destination;
    protected String depatureTime;
    protected String arrivalTime;
    
    protected abstract String generateID();
    
    public abstract void printDetails();
}

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
public abstract class AbstractFactory {
    abstract Vehicle getVehicle(String vehicleType, String vehicleID);
    abstract Seat getSeat(String seatType);
    abstract Ticket getTicket(String ticketType, Seat seat, Customer customer, String depatureLocation, 
            String destination, String depatureTime, String arrivalTime);
}

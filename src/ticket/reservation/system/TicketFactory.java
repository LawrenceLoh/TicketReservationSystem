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
public class TicketFactory extends AbstractFactory{
    //use getTicket method to get object of type ticket 
   public Ticket getTicket(String ticketType, Seat seat, Customer customer, String depatureLocation, 
            String destination, String depatureTime, String arrivalTime){
      if(ticketType == null){
         return null;
      }
      
      if(ticketType.equalsIgnoreCase(STRING_CONSTANT.BUS_TICKET)){
         return new BusTicket(seat, customer, depatureLocation, destination, depatureTime, arrivalTime);
      } else if(ticketType.equalsIgnoreCase(STRING_CONSTANT.PLANE_TICKET)){
         return new PlaneTicket(seat, customer, depatureLocation, destination, depatureTime, arrivalTime);  
      }
      
      return null;
   }

    @Override
    Vehicle getVehicle(String vehicleType) {
        return null;
    }

    @Override
    Seat getSeat(String seatType) {
        return null;
    }
}

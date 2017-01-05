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
public class SeatFactory extends AbstractFactory{
    //use getSeat method to get object of type seat 
   @Override
   public Seat getSeat(String seatType){
      if(seatType == null){
         return null;
      }		
      
      if(seatType.equalsIgnoreCase(STRING_CONSTANT.BUS_SEAT)){
         return new BusSeat();
      } else if(seatType.equalsIgnoreCase(STRING_CONSTANT.PLANE_SEAT)){
         return new PlaneSeat();  
      }
      
      return null;
   }

    @Override
    Vehicle getVehicle(String vehicleType, String vehicleID) {
        return null;
    }

    @Override
    Ticket getTicket(String ticketType, Seat seat, Customer customer, String depatureLocation, String destination, String depatureTime, String arrivalTime) {
        return null;
    }
}

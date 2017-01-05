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
public class VehicleFactory extends AbstractFactory{
    //use getVehicle method to get object of type vehicle 
   public Vehicle getVehicle(String vehicleType, String vehicleID){
      if(vehicleType == null){
         return null;
      }		
      
      if(vehicleType.equalsIgnoreCase(STRING_CONSTANT.BUS)){
         return new Bus(vehicleID);
      } else if(vehicleType.equalsIgnoreCase(STRING_CONSTANT.PLANE)){
         return new Plane(vehicleID);  
      }
      
      return null;
   }

    @Override
    Seat getSeat(String seatType) {
        return null;
    }

    @Override
    Ticket getTicket(String ticketType, Seat seat, Customer customer, String depatureLocation, String destination, String depatureTime, String arrivalTime) {
        return null;
    }
}

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
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
   
      if(factoryType.equalsIgnoreCase("VEHICLE_FACTORY")){
         return new VehicleFactory();
      }else if(factoryType.equalsIgnoreCase("SEAT_FACTORY")){
         return new SeatFactory();
      }else if (factoryType.equalsIgnoreCase("TICKET_FACTORY")){
         return new TicketFactory();
      }
      
      return null;
   }
}

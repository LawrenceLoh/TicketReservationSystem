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
public class Admin{
    private String email;
    private String password;
    private String name;
    
    //create an object of SingleObject
   private static Admin admin = new Admin();
   
   private Admin(){}
   
   public static Admin getInstance() {
        System.out.println("Admin");
        return admin;
   }
   
   public void viewBookedTicket(){
       System.out.println("viewBookedTicket");
   }
   
   public void viewTicketHistory(){
       System.out.println("viewTicketHistory");
   }
   
   public void editRoadwaysSchedule(){
       System.out.println("editRoadwaysSchedule");
   }
   
   public void editAirwaysSchedule(){
       System.out.println("editAirwaysSchedule");
   }
   
   public void viewUserDetails(){
       System.out.println("viewUserDetails");
   }
   
   private void editDepatureLocation(){
       
   }
   
   private void editDestination(){
       
   }
   
   private void editBus(){
       
   }
   
   private void editPlane(){
       
   }
}

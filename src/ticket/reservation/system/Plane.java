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
public class Plane extends Vehicle{
    
    public Plane(String id){
        super.id = "PID"+id;
        super.seats = new Seat[120];
        super.departureLocation = "Location Foo";
        super.destination = "Location Bar";
    }
    
    @Override
    public String getID() {
        return super.id;
    }

    @Override
    public int getNumberOfSeats() {
        return 120;
    }

    @Override
    public Seat[] getAvailableSeats() {
        return super.seats;
    }
    
    @Override
    public void setDepartureLocation(String location) {
        System.out.println("Set Plane:"+id+" departure location to "+location);
    }
    
    @Override
    public void setDestination(String location) {
        System.out.println("Set Plane:"+id+" destination to "+location);
    }
}

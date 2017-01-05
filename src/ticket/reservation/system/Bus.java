/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.reservation.system;

import java.util.List;

/**
 *
 * @author User
 */
public class Bus extends Vehicle{

    public Bus(String id){
        super.id = "BID"+id;
        super.seats = new Seat[50];
        super.departureLocation = "Location X";
        super.destination = "Location Y";
    }
    
    @Override
    public String getID() {
        return super.id;
    }

    @Override
    public int getNumberOfSeats() {
        return 50;
    }

    @Override
    public Seat[] getAvailableSeats() {
        return super.seats;
    }

    @Override
    public void setDepartureLocation(String location) {
        System.out.println("Set Bus:"+id+" departure location to "+location);
    }
    
    @Override
    public void setDestination(String location) {
        System.out.println("Set Bus:"+id+" destination to "+location);
    }
    
    
}

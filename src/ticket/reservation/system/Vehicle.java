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
public abstract class Vehicle {
    protected String id;
    protected Seat[] seats;
    protected String departureLocation;
    protected String destination;
    
    public abstract String getID();
    public abstract int getNumberOfSeats();
    public abstract Seat[] getAvailableSeats();
    public abstract void setDepartureLocation(String location);
    public abstract void setDestination(String location);
}

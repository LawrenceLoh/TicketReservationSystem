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
    
    public abstract String getID(String number);
    public abstract int getNumberOfSeats();
    public abstract Seat[] getAvailableSeats();
}

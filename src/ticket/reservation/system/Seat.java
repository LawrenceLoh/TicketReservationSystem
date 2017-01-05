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
public abstract class Seat {
    protected String id;
    protected boolean availability;
    
    public abstract String getID();
    public abstract boolean getAvailability();
    
    public void setAvailability(boolean availability){
        this.availability = availability;
    };
}

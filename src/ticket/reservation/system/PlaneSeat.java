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
public class PlaneSeat extends Seat{

    public PlaneSeat() {
        super.id = "PS";
        super.availability = true;
    }
    
    @Override
    public String getID() {
        return super.id;
    }

    @Override
    public boolean getAvailability() {
        return super.availability;
    }

    @Override
    public void setAvailability(boolean availability) {
        super.setAvailability(availability);
        if (availability){
            System.out.println("Set plane seat to available.");
        } else {
            System.out.println("Set plane seat to not available");
        }
    }
    
}

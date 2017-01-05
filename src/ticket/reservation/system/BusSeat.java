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
public class BusSeat extends Seat{

    @Override
    public String getID(String number) {
        return number;
    }

    @Override
    public boolean getAvailability() {
        return true;
    }
    
}

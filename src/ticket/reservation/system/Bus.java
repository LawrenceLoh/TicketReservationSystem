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

    @Override
    public String getID(String number) {
        return "B"+number;
    }

    @Override
    public int getNumberOfSeats() {
        return 50;
    }

    @Override
    public Seat[] getAvailableSeats() {
        return new Seat[50];
    }
    
    
}

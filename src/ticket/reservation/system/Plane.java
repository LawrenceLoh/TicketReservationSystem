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
    @Override
    public String getID(String number) {
        return "P"+number;
    }

    @Override
    public int getNumberOfSeats() {
        return 120;
    }

    @Override
    public Seat[] getAvailableSeats() {
        return new Seat[120];
    }
}

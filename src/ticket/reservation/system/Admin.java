/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.reservation.system;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Admin {

    private String email;
    private String password;
    private String name;

    //create an object of SingleObject
    private static Admin admin = new Admin();

    private Admin() {
    }

    public static Admin getInstance() {
        System.out.println("Admin");
        return admin;
    }

    public void viewBookedTicket() {
        System.out.println("Diplaying user booked ticket....");
        System.out.println("-------User Booked Ticket-------");
        System.exit(0);
    }

    public void viewTicketHistory() {
        System.out.println("Diplaying monthy ticket sales....");
        System.out.println("-------Ticket Sales-------");
        System.exit(0);
    }

    public void editRoadwaysSchedule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit roadways schedule....");
        System.out.println("Please enter Bus ID:");
        String busID = scanner.nextLine();

        AbstractFactory vehicleFactory = FactoryProducer.getFactory(STRING_CONSTANT.VEHICLE_FACTORY);
        Vehicle bus = vehicleFactory.getVehicle(STRING_CONSTANT.BUS, busID);

        System.out.println("1. Edit departure location.");
        System.out.println("2. Edit destination");
        System.out.println("3. Edit bus.");
        System.out.println("Please select 1,2,3");

        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    bus.setDepartureLocation("New departure location.");
                    break;
                case 2:
                    bus.setDestination("New destination.");
                    break;
                case 3:
                    System.out.println("Editing bus....");
                    System.out.println("Complete editing.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 1,2,3.");
                    editRoadwaysSchedule();
                    break;
            }
            System.exit(0);
        }
    }

    public void editAirwaysSchedule() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit airways schedule....");
        System.out.println("Please enter Airplane ID:");
        String planeID = scanner.nextLine();

        AbstractFactory vehicleFactory = FactoryProducer.getFactory(STRING_CONSTANT.VEHICLE_FACTORY);
        Vehicle plane = vehicleFactory.getVehicle(STRING_CONSTANT.PLANE, planeID);

        System.out.println("1. Edit departure location.");
        System.out.println("2. Edit destination");
        System.out.println("3. Edit plane.");
        System.out.println("Please select 1,2,3");

        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    plane.setDepartureLocation("New departure location.");
                    break;
                case 2:
                    plane.setDestination("New destination.");
                    break;
                case 3:
                    System.out.println("Editing plane....");
                    System.out.println("Complete editing.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 1,2,3.");
                    editAirwaysSchedule();
                    break;
            }
            System.exit(0);
        }
    }

    public void viewUserDetails() {
        System.out.println("View user details.....");
        System.out.println("Display all user details.....");
        System.out.println("Complete.");
        System.exit(0);
    }
}

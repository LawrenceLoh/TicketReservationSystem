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
public class Customer {

    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;

    //create an object of SingleObject
    private static Customer customer = new Customer();

    private Customer() {

    }

    public static Customer getInstance() {
        return customer;
    }

    public void searchTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search Ticket.....");
        System.out.println("Please choose facility: (R) Roadways or (A) Airways: (R/A)");
        String selection = scanner.nextLine();
        if (selection.equalsIgnoreCase("A") || selection.equalsIgnoreCase("R")) {
            String seatString = selection.equalsIgnoreCase("R") ? STRING_CONSTANT.BUS_SEAT : STRING_CONSTANT.PLANE_SEAT;
            String ticketString = selection.equalsIgnoreCase("R") ? STRING_CONSTANT.BUS_TICKET : STRING_CONSTANT.PLANE_TICKET;
            String vehicleString = selection.equalsIgnoreCase("R") ? STRING_CONSTANT.BUS : STRING_CONSTANT.PLANE;
            
            System.out.println("One way (O) or return(R)?");
            scanner.nextLine();
            
            System.out.println("How many seats do you want?");
            scanner.nextLine();
            
            System.out.println("Searching based on availability.....");
            System.out.println("Please enter departure location");
            String depatureLocation = scanner.nextLine();

            System.out.println("Please enter destination");
            String destination = scanner.nextLine();

            System.out.println("Please enter depatureTime");
            String depatureTime = scanner.nextLine();

            System.out.println("Please enter arrivalTime");
            String arrivalTime = scanner.nextLine();

            AbstractFactory seatFactory = FactoryProducer.getFactory(STRING_CONSTANT.SEAT_FACTORY);
            Seat seat = seatFactory.getSeat(seatString);

            AbstractFactory ticketFactory = FactoryProducer.getFactory(STRING_CONSTANT.TICKET_FACTORY);
            Ticket ticket = ticketFactory.getTicket(ticketString, seat,
                    customer, depatureLocation, destination, depatureTime, arrivalTime);

            bookTicket(ticket);

        } else {
            System.out.println("Invalid input...");
            System.exit(0);
        }
    }

    public void cancelTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cancel ticket.....");
        System.out.println("Please enter ticket ID:");
        if (scanner.hasNext()) {
            String ticketID = scanner.nextLine();
            String ticketType = ticketID.substring(0, 1);
            if (ticketType.equalsIgnoreCase("A") || ticketType.equalsIgnoreCase("R")) {
                String seatString = ticketType.equalsIgnoreCase("R") ? STRING_CONSTANT.BUS_SEAT : STRING_CONSTANT.PLANE_SEAT;
                String cancelString = ticketType.equalsIgnoreCase("R") ? "Cancelling roadway ticket.":"Cancelling airway ticket";
                System.out.println(cancelString);
                System.out.println("Ticket cancelled.");
                AbstractFactory seatFactory = FactoryProducer.getFactory(STRING_CONSTANT.SEAT_FACTORY);
                Seat seat = seatFactory.getSeat(seatString);
                seat.setAvailability(true);
            } else {
                System.out.println("Invalid ticketID");
                System.out.println("Thank you.");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid input...");
            System.exit(0);
        }
    }

    public void viewBookedTicket() {
        System.out.println("Diplaying booked ticket....");
        System.out.println("-------Booked ticket-------");
        System.out.println("Thank you.");
        System.exit(0);
    }

    public void viewTicketHistory() {
        System.out.println("Diplaying ticket history....");
        System.out.println("-------Ticket History-------");
        System.out.println("Thank you.");
        System.exit(0);
    }

    private void bookTicket(Ticket ticket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reserve the ticket? (Y/N)");
        if (scanner.hasNext()) {
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                makePayment();
                ticket.getSeat().setAvailability(false);
                System.out.println("Ticket reserved.");
                ticket.printDetails();
            } else {
                System.out.println("Thanks for searching. Bye");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }
    }

    private void makePayment() {
        System.out.println("Enterring credit card....");
        System.out.println("Transaction processed....");
    }
}

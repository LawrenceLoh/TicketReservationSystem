/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.reservation.system;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author User
 */
public class TicketReservationSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static String username;
    private static String password;
    private final static String CUSTOMER = "CUSTOMER";
    private final static String ADMIN = "ADMIN";
    private static Customer customer;
    private static Admin admin;

    public static void main(String[] args) {
        boolean isCustomer = login().equals(CUSTOMER);
        displayMenu(isCustomer);
        selectAction(isCustomer);
    }

    private static void register() {
        System.out.println("Registering.....");
        System.out.println("Registered successfully");
    }

    private static String login() {
        boolean isLogin = false;
        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            if (username.equals("customer@gmail.com") && password.equals("password")) {
                System.out.println("Customer, welcome to Ticket Reservation System!");
                customer = Customer.getInstance();
                isLogin = true;
                return CUSTOMER;
            } else if (username.equals("admin@gmail.com") && password.equals("password")) {
                System.out.println("Admin, welcome to Ticket Reservation System!");
                admin = Admin.getInstance();
                isLogin = true;
                return ADMIN;
            }
            System.out.println("Invalid username or password");
        } while (!isLogin);
        return null;
    }

    private static void displayMenu(boolean isCustomer) {
        if (isCustomer) {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                                 Customer Menu");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                                 1. Search ticket");
            System.out.println("                                 2. Cancel ticket");
            System.out.println("                                 3. View booked ticket");
            System.out.println("                                 4. View ticket history");
            System.out.println("                                 5. Exit");
            System.out.println("-----------------------------------------------------------------------------------\n");
        } else {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                                 Administrator Menu");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                                 1. View booked ticket");
            System.out.println("                                 2. View ticket history");
            System.out.println("                                 3. Edit roadways schedule");
            System.out.println("                                 4. Edit airways schedule");
            System.out.println("                                 5. View user details");
            System.out.println("                                 6. Exit");
            System.out.println("-----------------------------------------------------------------------------------\n");
        }
    }

    private static void selectAction(boolean isCustomer) {
        System.out.println("Please enter number of an action:");
        if (scanner.hasNextInt()) {
            int action = scanner.nextInt();

            if (isCustomer) {
                switch (action) {
                    case 1:
                        customer.searchTicket();
                        break;
                    case 2:
                        customer.cancelTicket();
                        break;
                    case 3:
                        customer.viewBookedTicket();
                        break;
                    case 4:
                        customer.viewTicketHistory();
                        break;
                    case 5:
                        System.out.println("Good bye...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please input action number 1-5");
                        selectAction(isCustomer);
                        break;
                }
            } else {
                switch (action) {
                    case 1:
                        admin.viewBookedTicket();
                        break;
                    case 2:
                        admin.viewTicketHistory();
                        break;
                    case 3:
                        admin.editRoadwaysSchedule();
                        break;
                    case 4:
                        admin.editAirwaysSchedule();
                        break;
                    case 5:
                        admin.viewUserDetails();
                        break;
                    case 6:
                        System.out.println("Good bye...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please input action number 1-6");
                        selectAction(isCustomer);
                        break;
                }
            }
        } else {
            System.out.println("You have entered an invalid input, please try again.");
            selectAction(isCustomer);
        }
    }

}

package main;

import java.util.Scanner;

public class CRSMain {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Car Rental System");
        int choice;
        
        do {
            System.out.println("\n\n========= Main Menu =========");
            System.out.println("1. Add Car");
            System.out.println("2. List Available Cars");
            System.out.println("3. Add Customer");
            System.out.println("4. List Customers");
            System.out.println("5. Create Lease");
            System.out.println("6. Cancel/Close Lease");
            System.out.println("7. List All Leases");
            System.out.println("8. List Active Leases");
            System.out.println("9. Record Payment");
            System.out.println("10. Total Revenue");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                    	// addCar();
                    	break;
                    case 2:
                    	// listAvailableCars();
                    	break;
                    case 3:
                    	// addCustomer();
                    	break;
                    case 4:
                    	// listCustomers();
                    	break;
                    case 5:
                    	// createLease();
                    	break;
                    case 6:
                    	// cancelLease();
                    	break;
                    case 7:
                    	// listLeases();
                    	break;
                    case 8:
                    	// listActiveLeases();
                        break;
                    case 9:
                        // recordPayment();
                        break;
                    case 10:
                        // totalRevenue();
                        break;
                    case 11:
                        break;
                    default:
                    	System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 11);
        
        sc.close();
        System.out.println("Exiting the Car Rental System...");
    }
    
    // J514 - Rishab H
}

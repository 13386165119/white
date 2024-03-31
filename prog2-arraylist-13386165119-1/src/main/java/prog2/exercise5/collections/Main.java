package prog2.exercise5.collections;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderProcessing orderProcessing = new OrderProcessing(null, null, null, 0, 0, null, null);
        int choice;
        String userId=null;

        do {
            

            System.out.println("Welcome to the Turn-A-New-Leaf Bookstore");
            System.out.println("Type 1 to place new order.");
            System.out.println("Type 2 to search for a user's order.");
            System.out.println("Type 3 to remove a user's order.");
            System.out.println("Type 4 to display all of the orders");
            System.out.println("Type 5 to quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    userId=orderProcessing.addOrder();
                    break;
                case 2:
                    orderProcessing.searchUserOrders(userId);
                    break;
                case 3:
                    orderProcessing.removeUserOrders(userId);
                    break;
                case 4:
                    orderProcessing.displayAllUserOrders();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (choice != 5);
        scanner.close();
        }
    }

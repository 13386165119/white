import java.util.InputMismatchException;
import java.util.Scanner;

import prog2.spring2024.exercise2.BookStore;
import prog2.spring2024.exercise2.BookStore.BookDetails;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Welcome to the Book Store!");

        while (true) { 
            System.out.println("\nPlease choose an action:");
            System.out.println("1. Search for a book");
            System.out.println("2. Order a book");
            System.out.println("3. Exit");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                  
                        System.out.println("Enter the book ID: ");
                        String bookID = scanner.nextLine();
                        BookDetails book = new BookStore().searchBook(bookID); // Create an instance of BookStore to call searchBook

                        if (book != null) {
                            System.out.println("Book found!");
                            System.out.println(book);
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 2:
                      
                        System.out.println("Enter the book ID: ");
                        bookID = scanner.nextLine();
                        book = new BookStore().searchBook(bookID);

                        if (book != null) {
                            System.out.println("Book found!");
                            System.out.println("Would you like to rent or purchase the book?");
                            System.out.println("1. Rent");
                            System.out.println("2. Purchase");

                            try {
                                int orderChoice = scanner.nextInt();
                                scanner.nextLine(); 

                                switch (orderChoice) {
                                    case 1:
                                    
                                        System.out.println("The rental cost is: " + BookStore.bookRent);
                                        System.out.println("Please confirm your order (y/n): ");
                                        String confirmation = scanner.nextLine().toLowerCase(); 

                                        if (confirmation.equals("y")) {
                                            System.out.println("Your order has been placed!");
                                          
                                        } else {
                                            System.out.println("Order cancelled.");
                                        }
                                        break;
                                    case 2:
                                      
                                        System.out.println("The purchase price is: " + book.getBookPrice());
                                        System.out.println("Please confirm your order (y/n): ");
                                        confirmation = scanner.nextLine().toLowerCase();

                                        if (confirmation.equals("y")) {
                                            System.out.println("Your order has been placed!");
                                           
                                        } else {
                                            System.out.println("Order cancelled.");
                                        }
                                        break;
                                    default:
                                        System.out.println("Invalid choice.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.nextLine(); 
                            }
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 3:
                     
                        System.out.println("Thank you for using the Book Store!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }
}
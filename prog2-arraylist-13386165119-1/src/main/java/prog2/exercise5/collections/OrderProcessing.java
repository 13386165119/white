package prog2.exercise5.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderProcessing {
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private double bookPrice;
    private double transactionAmount;
    private String orderType;
    private String bookOrdered;
    private ArrayList<OrderDetails> orders = new ArrayList<>();

    HashMap<User, OrderDetails> userOrders = new HashMap<>();

    public OrderProcessing() {
    };

    public OrderProcessing(String bookName, String bookAuthor, String bookPublisher, double bookPrice,
            double transactionAmount, String orderType, String bookOrdered) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookPrice = bookPrice;
        this.transactionAmount = transactionAmount;
        this.orderType = orderType;
        this.bookOrdered = bookOrdered;
    }

    public String generateUserID(String firstName, String lastName) {
        String prefix = "TANLUS";
        String fullName = (firstName + lastName).toUpperCase();
        String userID = prefix + fullName.substring(0, 5);
        return userID;
    }

    public String generateOrderID(String userID) {
        String prefix = "TANLOD";
        String orderID = prefix + LocalDate.now() + userID.substring(6, 9).toUpperCase();
        return orderID;
    }

    public String getBookIDFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available books:");
        System.out.print("Enter the book ID you want to order: ");
        String bookID = scanner.nextLine();
        return bookID;

    }

    private static Books isBookIdValid(String bookID) {
        for(Books book: Books.values()){
            if(bookID.equals(book.getBookID())){
              return book;
            }
        }
        return null;

       
    }

    public String addOrder() {
        String choose = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String userEmail = scanner.nextLine();

        String userID = generateUserID(firstName, lastName);
        String orderID = generateOrderID(userID);

        OrderDetails orderDetails = new OrderDetails(orderID, LocalDate.now());

        User user = new User(firstName,lastName,userEmail,userID);
        do {
            String bookID = getBookIDFromUser();
            Books book=isBookIdValid(bookID);
            if (book!=null) {
                System.out.println("The book is available. Would you like to order it for purchase or rent?");
                System.out.println("1. Purchase");
                System.out.println("2. Rent");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        this.orderType = "Purchase";
                        break;
                    case 2:
                        this.orderType = "Rent";
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                StringBuilder _bookOrdered = new StringBuilder();
                _bookOrdered.append("Book ID: ").append(bookID).append("\n");
                _bookOrdered.append("Book Name: ").append(bookName).append("\n");
                _bookOrdered.append("Book Author: ").append(bookAuthor).append("\n");
                _bookOrdered.append("Book Publisher: ").append(bookPublisher).append("\n");
                _bookOrdered.append("Book Price: ").append(bookPrice).append("\n");
                this.bookOrdered = _bookOrdered.toString();
                orderDetails.setOrderedBook(this.bookOrdered);
                orderDetails.setOrderType(this.orderType);

                orders.add(orderDetails);
                userOrders.put(user, orderDetails);
            }
            System.out.print("Do you want to order more books?");
            choose = scanner.nextLine();
        } while (choose.equals("yes"));
        return userID;
    }

    public OrderDetails searchUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                String output=this.userOrders.values().toString();
                System.out.print(output);
                return userOrders.get(user);
            }
        }
        return null;
    }

    public void removeUserOrders(String userID) {
        for (User user : userOrders.keySet()) {
            if (user.getUserID().equals(userID)) {
                userOrders.remove(user);
                System.out.println("User orders removed successfully.");
                return;
            }
        }
        System.out.println("Error: User ID not found in the system.");
    }

    public void displayAllUserOrders() {
        for (Map.Entry<User, OrderDetails> entry : userOrders.entrySet()) {
            System.out.println("User ID: " + entry.getKey());
            System.out.println("Order Details: " + entry.getValue());
            System.out.println();
        }
        if (userOrders.isEmpty()) {
            System.out.println("No user orders found.");
        }
    }

}

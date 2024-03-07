package prog2.spring2024.exercise2;

import java.time.LocalDate;

import prog2.spring2024.exercise2.BookStore.BookDetails;

/**
 * Hello world!
 *
 */
public class BookStore {
    
    
        public enum BookDetails{
            THE_FIRM("B001", "The Firm", "John Grisham", 480, "Thriller", 4.2, 1991, "Doubleday", 25.0),
            THE_CLIENT("B002", "The Client", "John Grisham", 448, "Thriller", 4.3, 1993, "Doubleday", 24.0),
            THE_PELICAN_BRIEF("B003", "The Pelican Brief", "John Grisham", 472, "Thriller", 4.1, 1992, "Doubleday", 26.0),
            THE_RAINMAKER("B004", "The Rainmaker", "John Grisham", 496, "Thriller", 4.4, 1995, "Doubleday", 27.0),
            THE_RUNAWAY_JURY("B005", "The Runaway Jury", "John Grisham", 448, "Thriller", 4.2, 1996, "Doubleday", 28.0);
           
            static final double bookRent = 5.0;
            private final String bookID;
            private final String bookName;
            private final String bookAuthor;
            private final int bookPages;
            private final String bookGenre;
            private final double bookRating;
            private final int bookPublishedYear;
            private final String bookPublisher;
            private final double bookPrice;
            private String firstName;
            private String lastName;
            private String emailAddress;
            private String orderedBook;
            private LocalDate orderDate;
            private String orderID;
            private double transactionAmount;
            private String userID;
            private String orderType;
    
            BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookRating, int bookPublishedYear, String bookPublisher, double bookPrice){
                this.bookID = bookID;
                this.bookName = bookName;
                this.bookAuthor = bookAuthor;
                this.bookPages = bookPages;
                this.bookGenre = bookGenre;
                this.bookRating = bookRating;
                this.bookPublishedYear = bookPublishedYear;
                this.bookPublisher = bookPublisher;
                this.bookPrice = bookPrice;
            }
            public String getBookID() {
                return bookID;
            }
        
            public String getBookName() {
                return bookName;
            }
        
            public String getBookAuthor() {
                return bookAuthor;
            }
        
            public int getBookPages() {
                return bookPages;
            }
        
            public String getBookGenre() {
                return bookGenre;
            }
        
            public double getBookRating() {
                return bookRating;
            }
        
            public int getBookPublishedYear() {
                return bookPublishedYear;
            }
        
            public String getBookPublisher() {
                return bookPublisher;
            }
        
            public double getBookPrice() {
                return bookPrice;
            }

            BookDetails(String firstName,String lastName,String emailAddress){
                this.firstName = firstName;
                this.lastName = lastName;
                this.emailAddress = emailAddress;
                this.bookID = "";
                this.bookName = "";
                this.bookAuthor = "";
                this.bookPages = 0;
                this.bookGenre = "";
                this.bookRating = 0;
                this.bookPublishedYear = 0;
                this.bookPublisher = "";
                this.bookPrice = 0;
            }
        
            public String getOrderedBook() {
                return orderedBook;
            }
        
            public void setOrderedBook(String orderedBook) {
                this.orderedBook = orderedBook;
            }
        
            public LocalDate getOrderDate() {
                return orderDate;
            }
        
            public void setOrderDate(LocalDate orderDate) {
                this.orderDate = orderDate;
            }
        
            public String getOrderID() {
                return orderID;
            }
        
            public void setOrderID(String orderID) {
                this.orderID = orderID;
            }
        
            public double getTransactionAmount() {
                return transactionAmount;
            }
        
            public void setTransactionAmount(double transactionAmount) {
                this.transactionAmount = transactionAmount;
            }
        
            public String getFirstName() {
                return firstName;
            }
        
            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }
        
            public String getLastName() {
                return lastName;
            }
        
            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        
            public String getEmailAddress() {
                return emailAddress;
            }
        
            public void setEmailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
            }
        
            public String getUserID() {
                return userID;
            }
        
            public void setUserID(String userID) {
                this.userID = userID;
            }
        
            public String getOrderType() {
                return orderType;
            }
        
            public void setOrderType(String orderType) {
                this.orderType = orderType;
            }
        }

        public static String bookRent;

        public BookDetails searchBook(String bookID) {
            throw new UnsupportedOperationException("Unimplemented method 'searchBook'");
        }

          
            }
        
        
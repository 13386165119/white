package prog2.exercise5.collections;

public enum Books {
    BOOK01(
        "001",
        "Carri",
        "Stephen King",
        272,
        "Horror",
        3.98,
        1974,
        "Wings",
        14),
BOOK02(
        "002",
        "The Firm",
        "Robin Waterfield/John Grisham",
        448,
        "Thriller",
        4.01,
        1991,
        "Addison Wesley",
        25),
BOOK03(
        "003",
        "Slaughterhouse-Five",
        "Kurt vonnegut Jr",
        275,
        "Sci-Fi",
        4.1,
        1969,
        "Dial Press",
        18),
BOOK04(
        "004",
        "The Great Gatsby",
        "F.Scott Fitzgerald",
        188,
        "Classic",
        3.91,
        1925,
        "Scribner",
        8),
BOOK05(
        "005",
        "American Gods",
        "Neil Gaiman",
        635,
        "Fantasy",
        4.11,
        2001,
        "Harper Collins",
        4.11);

public static final double bookRent = 5.0;
private final String bookID;
private final String bookName;
private final String bookAuthor;
private final int bookPages;
private final String bookGenre;
private final double bookRating;
private final int bookPublishedYear;
private final String bookPublisher;
private final double bookPrice;
int i;

Books(
        String bookID,
        String bookName,
        String bookAuthor,
        int bookPages,
        String bookGenre,
        double bookRating,
        int bookPublishedYear,
        String bookPublisher,
        double bookPrice) {
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
}
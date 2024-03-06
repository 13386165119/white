import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event ID: ");
        String eventID = scanner.nextLine();

        System.out.println("Enter event name: ");
        String eventName = scanner.nextLine();

        System.out.println("Enter event venue: ");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter event date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate eventDate = LocalDate.parse(dateStr);

    }}

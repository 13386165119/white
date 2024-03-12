import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Attendee> attendees = new ArrayList<>();
        System.out.println("Enter event ID: ");
        String eventID = scanner.nextLine();

        System.out.println("Enter event name: ");
        String eventName = scanner.nextLine();

        System.out.println("Enter event venue: ");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter event date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate eventDate = LocalDate.parse(dateStr);
        while (true) {
            System.out.println("Enter attendee name (or 'q' to quit): ");
            String attendeeName = scanner.nextLine();

            if (attendeeName.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Enter attendee email: ");
            String attendeeEmail = scanner.nextLine();
            attendees.add(new Attendee(attendeeName, attendeeEmail));
        }
        System.out.println("\nEvent Details:");
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Venue: " + eventVenue);
        System.out.println("Event Date: " + eventDate);
        if (attendees.isEmpty()) {
            System.out.println("No attendees registered yet.");
        } else {
            System.out.println("\nAttendees:");
            for (Attendee attendee : attendees) {
                System.out.println(attendee);
            }
        }
    }
}
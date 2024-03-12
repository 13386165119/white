import java.time.LocalDate;
import java.util.ArrayList;
import com.example.eventmanagement.Attendee;
public class Event { 
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID,String eventName,String eventVenue,LocalDate eventDate,ArrayList<String> eventAttendees){
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = eventAttendees;
    }
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }
    public void organizeEvent() {
        Scanner scanner = new Scanner(System.in);
    
        int choice;
        do {
            System.out.println("\nEvent Management System");
            System.out.println("1. Add Attendee");
            System.out.println("2. Remove Attendee");
            System.out.println("3. Update Attendee");
            System.out.println("4. Find Attendee");
            System.out.println("5. Display Total Attendees");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
    
            choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("Enter attendee name: ");
                    String attendeeName = scanner.nextLine();
                    eventAttendees.add(attendeeName);
                    System.out.println(attendeeName + " added successfully!");
                    break;
                case 2:
                    System.out.println("Enter attendee name to remove: ");
                    attendeeName = scanner.nextLine();
                    if (eventAttendees.remove(attendeeName)) {
                        System.out.println(attendeeName + " removed successfully!");
                    } else {
                        System.out.println(attendeeName + " not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter attendee name to update: ");
                    attendeeName = scanner.nextLine();
                    int index = eventAttendees.indexOf(attendeeName);
                    if (index != -1) {
                        System.out.println("Enter new attendee name: ");
                        String newAttendeeName = scanner.nextLine();
                        eventAttendees.set(index, newAttendeeName);
                        System.out.println(attendeeName + " updated successfully to " + newAttendeeName);
                    } else {
                        System.out.println(attendeeName + " not found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter attendee name to find: ");
                    attendeeName = scanner.nextLine();
                    if (eventAttendees.contains(attendeeName)) {
                        System.out.println(attendeeName + " found!");
                    } else {
                        System.out.println(attendeeName + " not found!");
                    }
                    break;
                case 5:
                    System.out.println("Total attendees: " + eventAttendees.size());
                    break;
                case 6:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }public String toString() {
        return "Event ID: " + eventID + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Venue: " + eventVenue + "\n" +
                "Event Date: " + eventDate + "\n" +
                "Total Attendees: " + eventAttendees.size();
    }
}

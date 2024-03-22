public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent.toString());

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E002", "Music Festival", "London", "Peng Tian", 50, 3, 1000);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent.toString());
    }
}
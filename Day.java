import java.util.ArrayList;

public class Day {

  public String name;

  public ArrayList<String> meetings;

  public Day(String name) {
    this.name = name;
    this.meetings = new ArrayList<String>();
  }

  public void addMeeting(String newMeeting) {
    this.meetings.add(newMeeting);
  }
}

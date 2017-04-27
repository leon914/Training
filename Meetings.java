public class Meetings {

  public static void main(String[] args){

  Day monday = new Day("Monday");
  monday.addMeeting("2am Meeting");
  monday.addMeeting("3am Meeting");
  monday.addMeeting("5am Meeting");

  Day tuesday = new Day("Tuesday");
  tuesday.addMeeting("2am Meeting");
  tuesday.addMeeting("3am Meeting");
  tuesday.addMeeting("5am Meeting");

  Day wednesday = new Day("Wednesday");
  wednesday.addMeeting("2am Meeting");
  wednesday.addMeeting("3am Meeting");
  wednesday.addMeeting("5am Meeting");

  Day thursday = new Day("Thursday");
  thursday.addMeeting("2am Meeting");
  thursday.addMeeting("3am Meeting");
  thursday.addMeeting("5am Meeting");

  Day friday = new Day("Friday");
  friday.addMeeting("2am Meeting");
  friday.addMeeting("3am Meeting");
  friday.addMeeting("5am Meeting");

  Day[] week = { monday, tuesday, wednesday, thursday, friday };

  for (Day day : week) {
    System.out.println(day.name);
    for (String meeting : day.meetings) {
      System.out.println(meeting);
    }
  }



  }
}

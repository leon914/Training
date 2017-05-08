public class World {

  public static void main(String[] args) {

  God buddah = God.getInstance();

  System.out.println(Person.useCalculatorToAddParams(2, 3));

  Person thomas = new Person("Thomas");

  Person andy = new Person("Andy");

  System.out.println(thomas.getName() + " runs towards " + andy.getName() + " and hacks off his leg with a machete");

  thomas.setLegs(1);

  System.out.println(thomas.getName() + " Has only " + thomas.getLegs() + " Leg");

  buddah.uhhSomeCrazyNextLevelStuff();


  }
}

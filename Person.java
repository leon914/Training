public class Person {

  private String name = ""; //Variables

  //wasnt sure to make the variables private or what as limbs and facial features arent private

  private int eyes = 2;
  private final int mouth = 1;
  private int arms = 2;
  private int legs = 2;
  private boolean alive = true;


  //i did here though (private)

  private String emotion = "";

  // i have no idea to relate a static variable to a Person

  private static boolean buddhistOneSoul = true;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() > 0) {
      this.name = name;
    } else {
      System.out.println("You didnt give a value");
    }
  }

  public int getEyes() {
    return this.eyes;
  }

  public void setEyes(int amountOfEyes) {
    if (this.eyes >= amountOfEyes) {
      if (amountOfEyes == 1 && this.eyes == 1 || amountOfEyes == 0) {
        System.out.println(this.name + " can currently not see much due to his lack of eyes....");
        this.eyes = 0;
    } else if (amountOfEyes == 1 && this.eyes == 2){
      System.out.println(this.name + " Lost an Eye...");
      this.eyes = 1;
    }
    } else {
      System.out.println("I dont know what your trying to do but people cant have more than 2 eyes or less than 0");
    }
  }

  public int getMouth() {
    return this.mouth;
  }

  public int getArms() {
    return this.arms;
  }
  public void setArms(int amountOfArms) {
    if (this.arms >= amountOfArms) {
      if (amountOfArms == 1 && this.arms == 1 || amountOfArms == 0) {
        System.out.println(this.name + " can currently not do much due to his lack in arms....");
        this.arms = 0;
    } else if (amountOfArms == 1 && this.arms == 2){
      System.out.println(this.name + " Lost an arm...");
      this.arms = 1;
    }
    } else {
      System.out.println("I dont know what your trying to do but people cant have more than 2 arms or less than 0");
    }
  }

  public int getLegs() {
    return this.legs;
  }
  public void setLegs(int amountOfLegs) {
    if (this.legs >= amountOfLegs) {
      if (amountOfLegs == 1 && this.legs == 1 || amountOfLegs == 0) {
        System.out.println(this.name + " is sadly now the actual immovable object...");
        this.legs = 0;
    } else if (amountOfLegs == 1 && this.legs == 2){
      System.out.println(this.name + " Lost a leg...");
      this.legs = 1;
    }
    } else {
      System.out.println("I dont know what your trying to do but people cant have more than 2 legs or less than 0");
    }
  }

  public void personInfo() {
    System.out.println("Hello, my name is" + name + "I have " + eyes + " eyes, " + "\n" + mouth + " mouth, " + arms + " arms");
    if (alive = true) {
      System.out.println("and i am alive.");
    } else {
      System.out.println("and i am dead.");
    }
  }

  public void death() {
    this.alive = false;
  }

  public void nameChange(String newName) {
    this.name = newName;
  }

  public void feelingChange(String emotion) {
    this.emotion = emotion;
  }

  public static int useCalculatorToAddParams(int int1, int int2) {
    return int1 + int2;
  }


}

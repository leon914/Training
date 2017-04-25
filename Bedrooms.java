public class Bedrooms{

  public static void main(String[] args) {

  System.out.println("You have " + args[0] + " bedrooms in your house");

  int rooms = 0;

  try {
    rooms = Integer.valueOf(args[0]);
  } catch(Exception e) {
    System.out.println("The amount of bedrooms in your house needs to be a whole number");
  }

  if !(rooms < 0) {

      switch(rooms) {
              case 0: System.out.println("You are Homeless");
                      break;
              case 1: System.out.println("At least you have a bedroom, Lucky");
                      break;
              case 2: System.out.println("Damn boi what you got 2 rooms for? you got a kid or somethin");
                      break;
              case 3: System.out.println("Full blown family man");
                      break;
              default: System.out.println("How the hell do u have that many Bedrooms");
                      break;
                    }
                  }
                }
              }

public class Cake {

  public static void main(String[] args) {

    if (Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) > 0) {

    }

    System.out.println("The common Divisor between " + args[0] + " and " + args [1] + " is: " + greatestCommonDivisor(Integer.parseInt(args[0]),Integer.parseInt(args[1])));

    int gcd = greatestCommonDivisor(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

    System.out.println(fraction(Integer.parseInt(args[0]),Integer.parseInt(args[1]), gcd));

  }

  public static int greatestCommonDivisor(int value1, int value2) {
    int x = value1;
    int y = value2;
    int backup1 = 0;
    int backup2 = 0;
    do {
      if (y > x) {
        int z = x;
        x = y;
        y = z;
      }
      x = x - y;
      backup2 = backup1;
      backup1 = x;

    } while (x > 0);
  return backup2;
}

  public static String fraction(int enteredNumber1, int enteredNumber2, int gcd) {
    enteredNumber1 = enteredNumber1 / gcd;
    enteredNumber2 = enteredNumber2 / gcd;
    int answer = enteredNumber1 + enteredNumber2;
    String fraction1 = enteredNumber1 + "/" + answer;
    String fraction2 = enteredNumber2 + "/" + answer;
    return "So the 1st person will get " + fraction1 + " and the second person will get " + fraction2 + " of the cake";
  }




}

// multiples of 3 and 5 (3,5,6,9 etc.)
// all multiples of 3 and 5 added together
// a for loop with a counter to 1000
// get the counter and check if it is dividable by 3 or 5 and if you get a whole number
public class Multiples {

  public static void main(String[] args) {

    System.out.println(multiple(3,5));

  }

  public static int multiple(double number1, double number2) {
    int total = 0;
    for(int i = 0; i <= 1000; i++) {
      if (i % number1 == 0 || i % number2 == 0) {
        total += i;
      }
    }
    return total;
  }
}

public class Sumsubject {

  public static void main(String[] args) {
    int difference = second() - first();
    System.out.println("the difference between the sum of the squares of the first ten natural numbers and the square of the sum is " + second() + " - " + first() + " = " + difference);
    }

  public static int first() {
    int firsttotal = 0;
    for (int i = 0; i <= 100; i++){
      firsttotal += i * i;
    }
    return firsttotal;
  }

  public static int second() {
    int secondtotal = 0;
    for (int i = 0; i <= 100; i++) {
      secondtotal += i;
    }
  return secondtotal = secondtotal * secondtotal;
  }
}

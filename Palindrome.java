import java.util.*;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println(palindrome());
  }

  public static int palindrome() {
    int a = 0;
    int b = 0;
    int keeper = 0;
    int total = 0;
    int total2 = 0;
  do {

    a++;
    b++;
    total = a * b;

    String stringTotal = String.valueOf(total);
    String[] numbers = stringTotal.split("");
    stringTotal = "";

    for (int i = numbers.length - 1; i >= 0; i--) {
      stringTotal += String.valueOf(numbers[i]);
    }
    total2 = Integer.parseInt(stringTotal);
    if(total == total2) {
      keeper = total;
      System.out.println(keeper);
    }

  } while (a < 999 && b < 999) ;
  return keeper;
  }
}

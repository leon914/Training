import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Power {

  public static void main(String[] args) {

    double answer = power(Double.valueOf(args[0]),Double.valueOf(args[1]));

    NumberFormat formatter = new DecimalFormat("###,###.########");

    System.out.printf("the first argument to the power of the second argument makes: " + formatter.format(answer) + "\n");
}

  public static double power(double base, double index){
      double answer = 1;
      double indexPlaceHolder = index;
      index = Math.abs(index);

      for (int i = 0; i < index; i++) {
        answer *= base;
      }

      if (indexPlaceHolder < 0) {
          answer = 1 / answer;
      }

      return answer;
    }
  }

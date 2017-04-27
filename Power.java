import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Power {

  public static void main(String[] args) {

    String format = "#0.00";
    double answer = power(Double.valueOf(args[0]),Double.valueOf(args[1]));
    // double answerPlaceHolder = answer;
    // String.format("%.0f", answerPlaceHolder);

    // for (double i = 3; i < answerPlaceHolder.length; i++) {
    //   format += "0";
    // }

    // NumberFormat formatter = new DecimalFormat("#0.00000000000");

    // System.out.printf("the first argument to the power of the second argument makes: " + formatter.format(answer));
    System.out.println("the first argument to the power of the second argument makes: " + (Double.toString(answer)));
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

public class Power {

  public static void main(String[] args) {

    double power0 = 0;
    double power1 = 0;
    boolean isitminus = false;

    power0 = Double.valueOf(args[0]);
    power1 = Double.valueOf(args[1]);

    if (Double.valueOf(args[1]) < 0) {
    power1 = Math.abs(power1);
    System.out.println(power1);
    isitminus = true;
    }

    if (isitminus == true) {
      power0 = 1;
      for (int i = 0; i < power1 ; i++) {
        System.out.println("ha3");
        power0 = power0 / Double.valueOf(args[0]);
      }
      System.out.println("the first argument to the power of the second argument makes = " + power0);
    }

    if (isitminus == false) {
      for (int i = 1; i < power1 ; i++) {
      power0 = power0 * Double.valueOf(args[0]);
      // System.out.println(power0 + " * " + Integer.valueOf(args[0]) + " = " + power0);
    }

    System.out.println("the first argument to the power of the second argument makes = " + power0);

    }
  }
}

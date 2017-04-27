public class Power {

  public static void main(String[] args) {

    double e = power(Double.valueOf(args[0]),Math.abs(Double.valueOf(args[1])));;

    if (Double.valueOf(args[1]) < 0) {
      e = 1 / e;
    }
      System.out.println("the first argument to the power of the second argument makes = " + e);
    }

  public static double power(double x, double y){
    double e = 1;
    for (int i = 0; i < y; i++) {
      e *= x;
    }
    return e;
    }

}

public class Volume {

  public static void main (String[] args) {

    double volume1 = 0;
    double volume2 = 0;
    double volume3 = 0;

    int glasss = 4;

    // double volume[3];
    //
    // for (double arg : volume) {
    //   arg = args
    // }

    if (args.length == 2) {

      if (Double.valueOf(args[0]) == Double.valueOf(args[0])) {
        try {
          volume1 = Double.valueOf(args[0]);
        } catch(Exception e) {
          System.out.println("1st Argument isnt viable");
        }
      }

      if (Double.valueOf(args[1]) == Double.valueOf(args[1])) {
        try {
          volume2 = Double.valueOf(args[1]);
        } catch(Exception e) {
          System.out.println("2nd Argument isnt viable");
        }
      }

      if (Double.valueOf(args[2]) == Double.valueOf(args[2])){
        try {
          volume3 = Double.valueOf(args[2]);
        } catch(Exception e) {
          System.out.println("3rd Argument isnt viable");
        }
      }

      if (volume1 > 0 && volume2 > 0 && volume3 > 0) {
        System.out.println("The Volume of the Tank is " + ((volume1 * volume2) * volume3));
      } else {
        System.out.println("You need to enter 3 args for the program to be able to calculate the Volume.");
      }
    } else {
      System.out.println("More requirements needed");
    }



  }

}

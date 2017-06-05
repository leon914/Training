public class PythagoreanTriplet {

  public static void main(String[] args) {
  specialTriplet();
  }

  public static void specialTriplet(){
    do {
      int answer = 0;
      for (int a = 1; a < 1000; a++) {
        for (int b = a+1; b < 1000; b++) {
          for (int c = b+1; c < 1000; c++) {
            answer = a + b + c;
            int aSquared = a * a;
            int bSquared = b * b;
            int cSquared = c * c;
            if (answer == 1000 && aSquared + bSquared == cSquared) {
              System.out.println("a = " + a + ", b = " + b + " and c = " + c);
              int sideAnswer = a * b * c;
              System.out.println("abc = " + sideAnswer);
              break;
            }
          }
        }
      }
    } while (true);
  }

}

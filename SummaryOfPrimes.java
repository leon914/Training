public class SummaryOfPrimes {

  public static void main(String[] args) {
    System.out.println(primeSummary());
  }

  public static int primeSummary() {
    int primeAmount = 0;
  for (int i = 1; i < 2000000; i++) {
    int factors = 0;
      for (int e = 1; e <= i; e++) {
        if (i % e == 0) {
          factors++;
        }
      }
      if (factors < 3) {
        primeAmount += i;
        System.out.println(i);
      }
    }
    return primeAmount;
  }
}

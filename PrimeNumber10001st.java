public class PrimeNumber10001st {

  public static void main(String[] args) {
    Primealls();
  }

  public static void Primealls() {
    int primeAmount = 0;
  for (int i = 1; i == i; i++) {
    int factors = 0;
      for (int e = 1; e <= i; e++) {
        if (i % e == 0) {
          factors++;
        }
      }
      if (factors < 3) {
        primeAmount++;
      }
      if (primeAmount == 10001) {
        System.out.println(i);
        break;
      }
    }
  }
}

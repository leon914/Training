public class Fibonbitcho {

  public static void main(String[] args) {
    System.out.println("Answer:" + fibobisho());
  }

  public static int fibobisho() {
    int total = 0;
    int i = 0;
    do {
      if ((i & 1) == 0) {
        total = total + i;
      }
      System.out.println(total);
      i++;
    } while (total <= 4000000);
    return total;
  }
}

public class Basen{

  public static void main(String[] args){
    System.out.println(base(Integer.valueOf(args[0]), Integer.valueOf(args[1])));

  }

  public static int base(int base, int n){
    if (n > 0) {
      return base(base, n -1) * base;
    } else {
      return 1;
    }
  }
}

public class Recursion{



  public static void main(String[] args){
    System.out.println("If there are " + args[0] + " there will be " + rabbit1(Integer.valueOf(args[0])) + " Bunny Ears.");

  }

  public static int rabbit1(int amountOfBunnies){
    if (amountOfBunnies == 0) {
      return 0;
    } else {
    if((amountOfBunnies%2)==0){
      return rabbit1(amountOfBunnies -1) + 3;
    } else {
      return rabbit1(amountOfBunnies -1) + 2;
    }
    //rabbit1(amountOfBunnies - 1);
    }
  }
}

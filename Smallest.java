public class Smallest {

  public static void main(String[] args){
    System.out.println(smallestMultiples());
  }

  public static int smallestMultiples(){
    int smallestMultiple = 0;
    int i = 0;
    while(smallestMultiple <= 20) {
      smallestMultiple = 0;
      i++;
      int e = 0;
      while(smallestMultiple <= 20) {
        e++;
        if ((i % e) == 0 ) {
          smallestMultiple++;
        } else {
          break;
        }
      }
    }
    return i;
  }
}

public class Triangles{

  public static void main(String[] args){
    System.out.println("If there are " + Integer.valueOf(args[0]) + " of rows, there will be " + triangle(Integer.valueOf(args[0])) + " triangles");

  }

  public static int triangle(int amountOfRows){
    if (amountOfRows > 0) {
      return triangle(amountOfRows -1) + amountOfRows;
    } else {
      return 0;
    }
  }
}

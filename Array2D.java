public class Array2D {

  public static void main(String[] args) {


    int[][] numbers = new int[][] {
      // {3, 6, 9, 5},
      {5, 9, 2, 0},
      {2, 6, 1, 5},
      {0, 7, 3, 3}
    };

    Array2D arrayAdder = new Array2D();
    System.out.println(arrayAdder.addATwoDArrayTogether(numbers));

  }

  public int addATwoDArrayTogether(int[][] twoDimNumberArray) {
    int total = 0;
    for (int e = 0; e < twoDimNumberArray.length; e++) {
      for (int i = 0; i < twoDimNumberArray[e].length; i++) {
        total += twoDimNumberArray[e][i];
      }
    }
    return total;
  }
}

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class LargestProduct {

  public static void main(String[] args) {

    String line = parser();

    if (line != null) {

      int[] arrayFormatted = stringToArray(line);

      //System.out.println(line);

      System.out.println(calculate(arrayFormatted));



    }
  }

  private static String parser() {
    try {
      String line = null;
      File file = new File("numbers.txt");
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      StringBuffer stringBuffer = new StringBuffer();
      String temp;
      while ((temp = bufferedReader.readLine()) != null) {
        stringBuffer.append(temp);
      }
      fileReader.close();
      // System.out.println("Contents of file: ");
      // System.out.println(stringBuffer.toString());
      return stringBuffer.toString();
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static int[] stringToArray(String line) {
    //System.out.println(line);
    int amount = line.length();
    int[] array = new int[amount];
    for (int i = 0; i < amount; i++) {
        array[i] = Character.getNumericValue(line.charAt(i));
      //  System.out.println(array[i]);
    }
    return array;
  }

  private static int calculate(int[] arrayFormatted) {
    // for (int e : arrayFormatted) {
    //   System.out.println(arrayFormatted[e]);
    // }
    int big = 0;
    int small = 0;
    int amount = arrayFormatted.length;
    for (int i = 0; i < amount-13; i++) {
        // System.out.println(arrayFormatted[i]);
        int tempTotal = 1;
        for (int e = 0; e <= 13; e++) {
          tempTotal = tempTotal * arrayFormatted[i+e];
          }
        small = tempTotal;
        if (small > big) {
          big = small;
        }
    }
      return big;
    }
  }

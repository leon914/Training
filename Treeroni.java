import java.util.*;

public class Treeroni{

  public static void main(String[] args){

    TreeMap treeMap = new TreeMap();

    treeMap.put(1, "Blue");
    treeMap.put(2, "Red");
    treeMap.put(3, "Green");
    treeMap.put(4, "Black");
    treeMap.put(5, "Gold");
    treeMap.put(6, "Yellow");
    treeMap.put(7, "Purple");

    Loopy(treeMap);






  }

  public static void Loopy(Map<Integer, String> sampleTreeMap){
    for (Map.Entry<Integer, String> entry : sampleTreeMap.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println("Key:" + key + ", Value:" + value);
    }
  }


}

import java.util.*;

public class Mapperoni{

  public static void main(String[] args){

    Map<Integer, String> hashMap = new HashMap<Integer, String>();

    hashMap.put(30, "Harry");
    hashMap.put(46, "Wario");
    hashMap.put(23, "Eddie");
    hashMap.put(10, "Rick");
    hashMap.put(5, "Holly");
    hashMap.put(56, "Thomas");
    hashMap.put(49, "James");

    Loop(hashMap);






  }

  public static void Loop(Map<Integer, String> sampleHashMap){
    for (Map.Entry<Integer, String> entry : sampleHashMap.entrySet()) {
      Integer key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key);
    }
  }


}

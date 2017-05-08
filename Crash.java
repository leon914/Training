import java.util.ArrayList;
import java.util.List;

public class Crash {

  private String purpose = "toDie";

  public static void main(String[] args) {

    String[] names = {"Thomas", "Daniel", "Richard", "Claire"};

    List<String> issues = new ArrayList<>();

    Crash god = new Crash();

    for (;;) {
      // for (int i = 0; i < 3; i++) {
        issues.add("Problem");
        System.out.println(issues);
        // issues.add(new Problem((names[i] + e )));

      // }
    }
  }
}

//make a main object
//in a loop it makes variables

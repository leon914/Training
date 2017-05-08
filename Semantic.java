public class Semantic {

  //an example of semantic/run time error
  //another example of a runtime is if the program runs out of memory (i didnt want to break a computer)

  public static void main(String[] args) {

    String helloString = null;

  try {
    int thisWillThrowARunTimeError = helloString;
} catch(Exception e) {
  System.out.println(helloString.toString());
}

  }
}

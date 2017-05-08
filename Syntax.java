public class Syntax {

  //an example of syntax/compile time error

  public static void main(String[] args) {

  try {
  Sring helloString = args[0]; // this is typed wrong and wont compile "Sring"
  int thisWillThrowARunTimeError = args[0];
} catch(Exception e) {
  System.out.println(e);
}

  }
}

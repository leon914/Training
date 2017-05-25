import java.util.function.Function;
public class Greeter {

  public void greet(Greeting greeting) {
    greeting.perform();
  }

  public static void main(String[] args){
    Greeter sam = new Greeter();
    HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

    sam.greet(helloWorldGreeting);

    System.out.println(helloWorldGreeting.doubleNumberFunction.apply(3));
  }
}

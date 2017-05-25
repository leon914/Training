import java.util.function.Function;
public class HelloWorldGreeting implements Greeting{

  public void perform() {
    System.out.println("Hello World!");
    // or the lambda expression "aBlockOfCode = () -> System.out.println("Hello World!");"
  }
  Function<Integer, Integer> doubleNumberFunction = a -> a * 2;

}

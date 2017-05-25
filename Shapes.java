public class Shape{

  String name;
  String colour;
  double area;
  int numberOfSides;

  public static void main(String[] args) {
    Shapes circle1 = new Circle("circle1", "red", 4);

    System.out.println("The Circumference of the circle is: " + circle1.getCircumference());
  }

  public String getName(){
    return this.name;
  }
  public String getColour(){
    return this.colour;
  }
  public double getArea(){
    return this.area;
  }
  public int getNumberOfSides(){
    return this.numberOfSides;
  }
}

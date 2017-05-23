public abstract class Shape {

  protected String name;
  protected String colour;
  protected int numberOfSides;

  public static void main(String[] args) {
    Circle circle1 = new Circle("circle1", "red", 4);
    Square square1 = new Square("square1", "blue", 5, 7);

    System.out.println("The Circumference of the Circle is: " + circle1.getCircumference());
    System.out.println("The Area of the Circle is: " + circle1.getArea());
    System.out.println("The Area of the Square is: " + square1.getArea());
    System.out.println("This Square has " + square1.getNumberOfSides() + " sides");
    System.out.println("The Colour of the Square is: " + square1.getColour());
    System.out.println("The Height of the Square is: " + square1.getHeight());
    System.out.println("The Width of the Square is: " + square1.getWidth());
    System.out.println("The Name of the Circle is: " + square1.getName());
  }

  public String getName() {
    return this.name;
  }
  public String getColour() {
    return this.colour;
  }
  public abstract double getArea();

  public int getNumberOfSides() {
    return this.numberOfSides;
  }
}

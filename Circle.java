public class Circle extends Shape {

  private double radius;

  public Circle(String name, String colour, double radius) {
    this.name = name;
    this.colour = colour;
    this.radius = radius;
    this.numberOfSides = 1;
  }

  public double getRadius() {
    return this.radius;
  }
  public double getCircumference() {
    return Math.PI * radius;
  }
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

}

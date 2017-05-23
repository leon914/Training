public class Square extends Shape {

  private double width;
  private double height;

  public Square(String name, String colour, double width, double height) {
    this.name = name;
    this.colour = colour;
    this.width = width;
    this.height = height;
    this.numberOfSides = 4;
  }

  public double getWidth() {
    return this.width;
  }
  public double getHeight() {
    return this.height;
  }
  @Override
  public double getArea() {
    return width * height;
  }

}

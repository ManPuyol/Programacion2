public abstract class Figura {

  protected double x;
  protected double y;

  public Figura(double x, double y) {
    this.x = x;
    this.y = y;
  }

  abstract double perimetro();

  abstract double area();
}

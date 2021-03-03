public class Rectangulo extends Figura {

  private double base;
  private double altura;

  public Rectangulo(double x, double y, double base, double altura) {
    super(x, y);
    this.base = base;
    this.altura = altura;
  }

  public double perimetro() {
    return (2 * this.base) + (2 * this.altura);
  }
}

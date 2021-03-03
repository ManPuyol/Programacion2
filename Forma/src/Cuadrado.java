public class Cuadrado extends Rectangulo {

  private double lado;

  public Cuadrado(double x, double y, double lado) {
    super(x, y, lado, lado);
    this.lado = lado;
  }

  public double perimetro() {
    return 4 * lado;
  }
}

public class Cuadrado extends Rectangulo {

  private double lado;

  public Cuadrado(double x, double y, double lado) {
    super(x, y, lado, lado);
    this.lado = lado;
  }
  
 // NO es necesario Re - escribir este metodo porque ya existe en la clase Rectangulo
 // public double perimetro() {
 //   return 4 * lado;
 // }
}

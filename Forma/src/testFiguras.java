public class testFiguras {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Figura a, b, c;

    a = new Circulo(0, 0, 5);
    b = new Rectangulo(0, 0, 3, 2);
    c = new Cuadrado(0, 0, 5);

    System.out.println("Perimetro: " + a.perimetro());
    System.out.println("Area: " + a.area());
    System.out.println("Perimetro: " + b.perimetro());
    System.out.println("Area: " + b.area());
    System.out.println("Perimetro: " + c.perimetro());
    System.out.println("Area: " + c.area());
  }
}

package src;

public class SelectorPotencia {

  private int _potencia;
  private final int _maxPotencia = 900;

  public SelectorPotencia() {
    _potencia = 10;
  }

  public void fijarPotencia(int pot) {
    if ((pot >= 0) && (pot <= _maxPotencia) && ((pot % 100) == 0)) _potencia =
      pot; else System.err.println("Error: Potencia incorrecta");
  }

  public int potencia() {
    return (_potencia);
  }

  public int potMaxima() {
    return (_maxPotencia);
  }
}

package src;

public class SelectorGrill {

  private int _grill;
  private final int _maxGrill = 3;

  public SelectorGrill() {
   _grill = 0;
  }

  public void fijarGrill(int grill) {
    if ((grill >= 0) && (grill <= _maxGrill)) _grill =
      grill; else System.err.println("Error: Grill incorrecto");
  }

  public int Grill() {
    return  (_grill);
  }

  public int grillMaxima() {
    return (_maxGrill);
  }
}

package src;

public class SelectorTiempo {

  private int _tiempo;
  private final int _maxTiempo = 1800;

  public SelectorTiempo() {
    _tiempo = 0;
  }

  public void fijarTiempo(int time) {
    if (
      (time >= 0) && (time <= _maxTiempo) && (((time % 60) == 0) || time == 90)
    ) _tiempo = time; else System.err.println("Error: Tiempo incorrecto");
  }

  public int tiempo() {
    return (_tiempo);
  }

  public int tiempoMaximo() {
    return (_maxTiempo);
  }
}

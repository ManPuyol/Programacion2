/**
 * Menu de operaciones.
 *
 */
public class Menu {

  /**
   * Opciones del men�.
   */
  String opciones[];

  /**
   * N�mero total de opciones.
   */
  int nOpciones;

  /**
   * Primera opci�n libre.
   */
  int opcionLibre = 0;

  /**
   * Crea una men� de opciones con un n�mero de opciones.
   * @param nO N�mero de opciones.
   */
  public Menu(int nO) {
    this.nOpciones = nO;
    this.opciones = new String[nOpciones];
  }

  /**
   * A�ade una opci�n al men�.
   * @param op Opci�n del men�.
   */
  public void addOpcion(String op) {
    if (opcionLibre < nOpciones) opciones[opcionLibre] = op;
    opcionLibre++;
  }

  /**
   * Obtiene s�lo las opciones introducidas en el men�.
   * @return Opciones del men�.
   */
  public String[] getOpciones() {
    return this.opciones;
  }
}

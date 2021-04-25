import java.util.ArrayList;

/**
* Menu de operaciones.
*
*/
public class Menu {

 /**
 * Opciones del men�.
 */
 private ArrayList<String> opciones;

 /**
 * N�mero total de opciones.
 */
 int nOpciones;

 /**
 * Primera opci�n libre.
 */
 int opcionLibre;
 /**
 * Crea un men� de opciones con un n�mero de opciones.
 * @param nO N�mero de opciones.
 */
 public Menu(int nO) {
	 this.nOpciones = nO;
	 this.opciones = new ArrayList<String>();
 }

 /**
 * A�ade una opci�n al men�.
 * @param op Opci�n del men�.
 */
 public void addOpcion(String op) {
	 if (opcionLibre < nOpciones) opciones.add(op);
	    opcionLibre++;
 }

 /**
 * Obtiene s�lo las opciones introducidas en el men�.
 * @return Opciones del men�.
 */
 public ArrayList<String> getOpciones() {
	 return opciones;
 }
}
import java.util.ArrayList;

/**
* Menu de operaciones.
*
*/
public class Menu {

 /**
 * Opciones del menú.
 */
 private ArrayList<String> opciones;

 /**
 * Número total de opciones.
 */
 int nOpciones;

 /**
 * Primera opción libre.
 */
 int opcionLibre;
 /**
 * Crea un menú de opciones con un número de opciones.
 * @param nO Número de opciones.
 */
 public Menu(int nO) {
	 this.nOpciones = nO;
	 this.opciones = new ArrayList<String>();
 }

 /**
 * Añade una opción al menú.
 * @param op Opción del menú.
 */
 public void addOpcion(String op) {
	 if (opcionLibre < nOpciones) opciones.add(op);
	    opcionLibre++;
 }

 /**
 * Obtiene sólo las opciones introducidas en el menú.
 * @return Opciones del menú.
 */
 public ArrayList<String> getOpciones() {
	 return opciones;
 }
}
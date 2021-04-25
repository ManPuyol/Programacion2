import java.util.HashMap;

/**
 * Sistema de gesti�n de usuarios
 *
 */
public class SistemaGestionUsuarios {

  /**
   * N�mero m�ximo de usuarios.
   */
  private int nUsuarios;

  /**
   * Primera posici�n libre.
   */
  private int primerLibre;

  /**
   * Diccionario que contiene usuarios con su Men� asociado
   *
   */
  private HashMap<Usuario, Menu> sistemaAlmacen = new HashMap<Usuario, Menu>();

  /**
   * Crea un sistema de gesti�n de usuarios limitado en n�mero.
   * 
   * @param nU N�mero total de usuarios.
   */
  public SistemaGestionUsuarios(int nU) {
    this.nUsuarios = nU;
    this.primerLibre = 0;
  }

  /**
   * A�ade un usuario y el men� de opciones en el almac�n
   * 
   * @param u Usuario.
   * @param m Men� de opciones.
   */
  public void addUsuario(Usuario u, Menu m) {
    if (primerLibre < nUsuarios)
      sistemaAlmacen.put(u, m);
    primerLibre++;
  }

  /**
   * Autentifica un usuario, y devuelve su men� si todo va bien, en caso contrario
   * devuelve <i>null</i>.
   *
   * Recorre la lista de usuarios, buscando un usuario con el mismo login que* el
   * suministrado, si lo encuentra comprueba que los passwords coinciden,
   * devolviendo el men� que se encuentra en la misma posici�n.
   *
   * @param login    Login de la autentificaci�n.
   * @param password Contrase�a de la autentificaci�n.
   * @return Men� asociado al usuario o <i>null</i>.
   */
  public Menu autentificaUsuario(String login, String password) throws Exception {

    for (Usuario i : sistemaAlmacen.keySet()) {
      if (login == i.getLogin()) {
        if (password == i.getPassword()) {
        }
        return sistemaAlmacen.get(i);
      }

    }
    return null;
  }

}
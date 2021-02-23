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
  private int primerLibre = 0;

  /**
   * Usuarios del sistema.
   */
  private Usuario[] usuarios;

  /**
   * Men�s asociados a los usuarios.
   * El usuarios[i] tiene asociado el menus[i].
   */
  private Menu[] menus;

  /**
   * Crea un sistema de gesti�n de usuarios limitado en n�mero.
   * @param nU N�mero total de usuarios.
   */
  public SistemaGestionUsuarios(int nU) {
    this.nUsuarios = nU;
    this.usuarios = new Usuario[nUsuarios];
    this.menus = new Menu[nUsuarios];
  }

  /**
   * A�ade un usuario al sistema y le asocia un menu de opciones.
   * @param u Usuario.
   * @param m Men� de opciones.
   */
  public void addUsuario(Usuario u, Menu m) {
    if (primerLibre < nUsuarios) usuarios[primerLibre] = u;
    menus[primerLibre] = m;
    primerLibre++;
  }

  /**
   * Autentifica un usuario, y devuelve su men� si todo va bien, en caso
   * contrario devuelve <i>null</i>.
   *
   * Recorre la lista de usuarios, buscando un usuario con el mismo login que
   * el suministrado, si lo encuentra comprueba que los passwords coinciden,
   * devolviendo el men� que se encuentra en la misma posici�n.
   *
   * @param login  Login de la autentificaci�n.
   * @param password Contrase�a de la autentificaci�n.
   * @return Men� asociado al usuario o <i>null</i>.
   */
  public Menu autentificaUsuario(String login, String password) {
    boolean auth = false;
    int i;

    for (i = 0; i < usuarios.length; i++) {
      if (this.usuarios[i].getLogin() == login) {
        auth = true;
      }
    }

    if (auth == false) {
      return null;
    } else {
      return this.menus[i-1];
    }
  }
}

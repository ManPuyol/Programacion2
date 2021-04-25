/**
 * Usuario del Portal Web.
 *
 */
public class Usuario {

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Login/identificador del usuario.
     */
    private String login;

    /**
     * Contrase�a del usuario.
     */
    private String password;

    /**
     * Crea un usuario a partir de su nombre, login y password.
     * 
     * @param n Nombre del usuario.
     * @param l Login del usuario.
     * @param p Contrase�a del usuario.
     * @throws Exception
     */
    public Usuario(String n, String l, String p) throws Exception {
        this.nombre = n;
        this.login = l;
        this.password = p;

    }

    /**
     * Obtiene el login del usuario
     *
     * @return Login.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return Nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la contrase�a.
     * 
     * @return Contrase�a.
     * @throws Exception
     */
    public String getPassword() throws Exception {
        return this.password;
    }
}

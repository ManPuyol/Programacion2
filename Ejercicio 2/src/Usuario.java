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
     * Contraseņa del usuario.
     */
    private String password;

   /**
    * Crea un usuario a partir de su nombre, login y password.
    * @param n Nombre del usuario.
    * @param l Login del usuario.
    * @param p Contraseņa del usuario.
    */
    public Usuario (String n, String l, String p) {...}

   /**
    * Obtiene el login del usuario.
    * 
    * @return Login.
    */
    public String getLogin() {...}
    
   /**
    * Obtiene el nombre del usuario.
    * @return Nombre.
    */
    public String getNombre() {...}
    
   /**
    * Obtiene la contraseņa.
    * @return Contraseņa.
    */
    public String getPassword() {...}
}
import java.util.ArrayList;

public class LoginTest {

  /**
   * Valida un usuario en el sistema y muestra su menu de opciones.
   * SI las credenciales son incorrectas devolvera un mensage de error
   * @param activeMenu Menu.
   */
  public static void mostrarMenu(Menu activeMenu) {
    if (activeMenu == null) {
      System.out.println("Credenciales invalidas");
    } else {
      ArrayList<String> opcionesMenuActivo = new ArrayList<String>();
      opcionesMenuActivo = activeMenu.getOpciones();

      System.out.println("Menu del Usuario");

      for (int i = 0; i < opcionesMenuActivo.size(); i++) {
    	  System.out.println(opcionesMenuActivo.get(i));
      }
    }
  }

  public static void main(String[] args) throws Exception {
	  //
    String logg = "manolo1", pass = "password";
    SistemaGestionUsuarios sgu = new SistemaGestionUsuarios(5);

    Usuario n = new Usuario("Manolo", "manolo", "password");
    Menu m = new Menu(2);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo1", "manolo1", "password");
    m = new Menu(3);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    m.addOpcion("Opcion3");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo2", "manolo2", "password");
    m = new Menu(4);
    m.addOpcion("Opcion4");
    m.addOpcion("Opcion5");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo3", "manolo3", "password");
    m = new Menu(5);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo4", "manolo4", "password");
    m = new Menu(6);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion6");
    sgu.addUsuario(n, m);
    
    
  
    mostrarMenu(sgu.autentificaUsuario(logg, pass));
    mostrarMenu(sgu.autentificaUsuario("logg", "pass"));
    mostrarMenu(sgu.autentificaUsuario("loggo", "manolete"));
  }
}

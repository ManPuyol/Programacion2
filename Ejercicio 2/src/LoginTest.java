public class LoginTest {

  public static void main(String[] args) {
    String logg = "manolo1", pass = "password";
    SistemaGestionUsuarios sgu = new SistemaGestionUsuarios(5);
    Menu activeMenu;

    Usuario n = new Usuario("Manolo", "manolo", "password");
    Menu m = new Menu(2);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo1", "manolo1", "password");
    m = new Menu(3);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo2", "manolo2", "password");
    m = new Menu(4);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo3", "manolo3", "password");
    m = new Menu(5);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    n = new Usuario("Manolo4", "manolo4", "password");
    m = new Menu(6);
    m.addOpcion("Opcion1");
    m.addOpcion("Opcion2");
    sgu.addUsuario(n, m);

    // LOGIN
    // System.out.print("Login: ");

    // System.out.print("Pasword: ");

    activeMenu = sgu.autentificaUsuario(logg, pass);
    activeMenu = sgu.autentificaUsuario("logg", "pass");

    if (activeMenu == null) {
      System.out.println("Credenciales invalidas");
    } else {
      String opcionesMenuActivo[] = activeMenu.getOpciones();

      System.out.println("Menu del Usuario");
      for (var i = 0; i < opcionesMenuActivo.length; i++) {
        System.out.println(opcionesMenuActivo[i]);
      }
    }
  }
}

package src;

public class ProgramaMicro {

  private String _nombre;
  //private int _num_fases;
  private int _duracion;
  private int _potencia;

  //private int _consumo_agua;
  //private boolean _centrifugado;
  //private boolean _prelavado;

  public ProgramaMicro(String nom, int tiempo, int potencia) {
    _nombre = nom;
    //_num_fases = nfases;
    _duracion = tiempo;
    _potencia = potencia;
    //_consumo_agua = cons_agua;
    //_centrifugado = centr;
    //_prelavado = prel;
  }

  public void activar() {
    System.out.println("Calentando ...");
    System.out.println("...");
    System.out.println("Fin del programa " + _nombre);
  }

  public int potencia() {
    return (_potencia);
  }

  public String nombre() {
    return (_nombre);
  }

  public int duracion() {
    return (_duracion);
  }
}

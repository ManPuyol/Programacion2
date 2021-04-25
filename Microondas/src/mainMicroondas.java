package src;

public class mainMicroondas {

  public static void main(String[] args) {
    MxRoc mi_microondas;

    mi_microondas = new MxRoc1();
    System.out.println("MxRoc1");
    manipular(mi_microondas);

    mi_microondas = new MxRoc2();
    System.out.println("MxRoc2");
    manipular(mi_microondas);

    mi_microondas = new MxRoc3();
    System.out.println("MxRoc3");
    manipular(mi_microondas);
  }

  private static void manipular(MxRoc m) {
    m.infoPrograma();
    m.programar();
    m.infoPrograma();
    m.ponerEnMarcha();
  }
}

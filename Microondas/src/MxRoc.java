package src;

import java.io.*;

public class MxRoc {

  protected ProgramaMicro[] _pr_disponibles;
  private ProgramaMicro _pr_activo;
  protected SelectorGrill _selectorG;
  protected SelectorPotencia _selectorP;
  protected SelectorTiempo _selectorT;

  public MxRoc() {
    _pr_disponibles = null;
    _pr_activo = null;
    _selectorP = null;
    _selectorG = null;
    _selectorT = null;
  }

  public void ponerEnMarcha() {
    if (_pr_activo != null) _pr_activo.activar();
  }

  public void programar() {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String linea;
    int opcion = 0;
    int pot = 0;
    int grill = 0;
    int time = 0;

    System.out.println("Microondas MxRoc");
    System.out.println("Modo Programacion");
    System.out.println();
    System.out.println("0 - Apagado");
    for (int i = 0; i < _pr_disponibles.length; i++) {
      System.out.println(i + 1 + " - " + _pr_disponibles[i].nombre());
    }

    System.out.println();
    System.out.println("Seleccion: ");
    do {
      try {
        linea = in.readLine();
        opcion = Integer.parseInt(linea);
      } catch (Exception e) {
        System.err.println(e);
      }
    } while ((opcion < 0) || (opcion > _pr_disponibles.length));

    if (opcion == 0) {
      _pr_activo = null;
    } else {
      _pr_activo = _pr_disponibles[opcion - 1];
    }
    //Potencia
    if (
      _selectorP != null &&
      opcion != 2 &&
      opcion != 3 &&
      opcion != 4 &&
      opcion != 5
    ) {
      do {
        try {
          System.out.print("Potencia: ");
          linea = in.readLine();
          pot = Integer.parseInt(linea);
        } catch (Exception e) {
          System.err.println(e);
        }
      } while ((pot < 0) || (pot > _selectorP.potMaxima())||((pot % 100) != 0));

      _selectorP.fijarPotencia(pot);
    } else {
      _selectorP.fijarPotencia(_pr_activo.potencia());
    }
    //Grill
    if (
      _selectorG != null &&
      ((opcion == 5 || opcion == 6) || _pr_activo.nombre() == "Grill auto")
    ) {
      do {
        try {
          System.out.print("Grill: (0)(1)(2)(3) ");
          linea = in.readLine();
          grill = Integer.parseInt(linea);
        } catch (Exception e) {
          System.err.println(e);
        }
      } while ((grill < 0) || (grill > _selectorG.grillMaxima()));

      _selectorG.fijarGrill(grill);
    }
    //Tiempo
    if (
      _selectorT != null &&
      opcion != 2 && _pr_activo.nombre() != "Descongelar Auto"
    ) {
      do {
        try {
          System.out.print("Tiempo: ");
          linea = in.readLine();
          time = Integer.parseInt(linea);
        } catch (Exception e) {
          System.err.println(e);
        }
      } while ((time < 0) || (time > _selectorT.tiempoMaximo())||((time % 60) != 0));

      _selectorT.fijarTiempo(time);
    } else {
      _selectorT.fijarTiempo(_pr_activo.duracion());
    }
  }

  public void infoPrograma() {
    if (_pr_activo == null) {
      System.err.println("No hay programa");
    } else {
      System.out.println("Programa: " + _pr_activo.nombre() + ", ");
      System.out.print("Potencia: ");

      if (_selectorP != null) {
        System.out.print(_selectorP.potencia() +" W");
      } else {
        System.out.print("0 W");
      }
      System.out.print(", Grill: ");

      if (_selectorG != null) {
        System.out.print(_selectorG.Grill());
      } else {
        System.out.print("0");
      }
      System.out.print(", Tiempo: ");

      if (_selectorT != null) {
        System.out.print(_selectorT.tiempo()+" s");
      } else {
        System.out.print("0 s");
      }

      System.out.println();
    }
  }
}

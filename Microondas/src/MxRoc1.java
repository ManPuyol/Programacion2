package src;

public class MxRoc1 extends MxRoc {

  public MxRoc1() {
    super(); //LavadoraMX
    _selectorT = new SelectorTiempo();
    _selectorP = new SelectorPotencia();

    _pr_disponibles = new ProgramaMicro[3];

    _pr_disponibles[0] = new ProgramaMicro("Calentar", 0, 0);

    _pr_disponibles[1] = new ProgramaMicro("Calentar Leche", 90, 900);

    _pr_disponibles[2] =
      new ProgramaMicro("Descongelar Manual", 0, 100);
  }
}

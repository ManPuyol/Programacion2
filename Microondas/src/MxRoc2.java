package src;

public class MxRoc2 extends MxRoc1 {

  public MxRoc2() {
    super(); //LavadoraMX1
    _pr_disponibles = new ProgramaMicro[4];

    _pr_disponibles[0] = new ProgramaMicro("Calentar", 0, 0);

    _pr_disponibles[1] = new ProgramaMicro("Calentar Leche", 90, 900);

    _pr_disponibles[2] =
      new ProgramaMicro("Descongelar Manual", 0, 100);

    _pr_disponibles[3] = new ProgramaMicro("Grill auto", 0, 0);

    _selectorG = new SelectorGrill();
  }
}

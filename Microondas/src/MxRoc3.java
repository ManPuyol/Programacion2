package src;

public class MxRoc3 extends MxRoc2 {

  public MxRoc3() {
    super(); //LavadoraMX
    _pr_disponibles = new ProgramaMicro[6];

    _pr_disponibles[0] = new ProgramaMicro("Calentar", 0, 0);

    _pr_disponibles[1] = new ProgramaMicro("Calentar Leche", 90, 900);

    _pr_disponibles[2] =
      new ProgramaMicro("Descongelar Manual", 0, 100);

    _pr_disponibles[3] = new ProgramaMicro("Descongelar Auto", 180, 100);

    _pr_disponibles[4] = new ProgramaMicro("Grill auto", 0, 0);

    _pr_disponibles[5] =
      new ProgramaMicro("Grill + calentar", 0, 0);
  }
}

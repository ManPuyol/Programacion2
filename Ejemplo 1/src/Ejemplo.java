public class Ejemplo {

  public static void main(String[] args) {
    Asignatura as = new Asignatura("Programaci�n II", 5);

    Alumno a = new Alumno("Manolo", "P�rez", "56789890z", 5f);
    as.addAlumno(a);

    a = new Alumno("Mar�a", "Garc�a", "87415268t", 8f);
    as.addAlumno(a);

    a = new Alumno("Juan Jos�", "Torres", "96354712d", 6f);
    as.addAlumno(a);

    a = new Alumno("Laura", "Meseguer", "87415268t", 6f);
    as.addAlumno(a);

    a = new Alumno("Luc�a", "Serra", "77441166h", 4f);
    as.addAlumno(a);

    a = new Alumno("Antonio", "Peris", "96358425A", 5.5f);
    as.addAlumno(a);

    System.out.println("Nombre de la asignatura: " + as.getNombre());
    System.out.println("Nota Media:              " + as.notaMedia());
    a = as.getAlumMax();
    System.out.println(
      "El alumno/a " +
      a.getNombre() +
      " " +
      a.getApellidos() +
      " ha obtenido la m�xima nota: " +
      a.getNota()
    );
    a = as.getAlumMin();
    System.out.println(
      "El alumno/a " +
      a.getNombre() +
      " " +
      a.getApellidos() +
      " ha obtenido la m�nima nota: " +
      a.getNota()
    );
  }
}

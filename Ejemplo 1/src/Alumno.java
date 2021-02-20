class Alumno {

  private String nombre;
  private String apellidos;
  private String dni;
  private float nota;

  Alumno(String nomb, String ape, String dni, float nota) {
    /** Constructor */
    this.nombre = nomb;
    this.apellidos = ape;
    this.dni = dni;
    this.nota = nota;
  }

  public void setNota(float n) {
    /** Establece Nota */
    nota = n;
  }

  public float getNota() {
    /** Retorna Nota */
    return this.nota;
  }

  public String getNombre() {
    /** Retorna Nombre */
    return this.nombre;
  }

  public void setNombre(String nombre) {
    /** Establece Nombre */
    this.nombre = nombre;
  }

  public String getApellidos() {
    /** Retorna apellidos */
    return this.apellidos;
  }

  public void setApellidos(String apellidos) {
    /** Establece Apellidos */
    this.apellidos = apellidos;
  }

  public String getDni() {
    /** Retorna DNI*/
    return this.dni;
  }

  public void setDni(String dni) {
    /** Establece DNI */

    this.dni = dni;
  }
}

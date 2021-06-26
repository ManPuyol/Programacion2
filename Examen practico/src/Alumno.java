
public class Alumno {
			private String nombre;
			private String apellido1;
			private String apellido2;
			private String dni;
			
	//COMPLETA
	Alumno(String nomb, String ape1,String ape2, String dni){
	    /** Constructor */
	    this.nombre = nomb;
	    this.apellido1 = ape1;
	    this.apellido2 = ape2;
	    this.dni = dni;
	}
	   
	//COMPLETA CON LOS MÉTODOS IMPRESCINDIBLES
	  public String getNombre() {
	    /** Retorna Nombre */
	    return this.nombre;
	  }

	  public void setNombre(String nombre) {
	    /** Establece Nombre */
	    this.nombre = nombre;
	  }

	  public String getApellido1() {
	    /** Retorna apellidos */
	    return this.apellido1;
	  }

	  public void setApellido1(String apellido1) {
	    /** Establece Apellidos */
	    this.apellido1 = apellido1;
	  }
	  
	  public String getApellido2() {
		    /** Retorna apellidos */
		    return this.apellido2;
		  }

		  public void setApellido2(String apellido2) {
		    /** Establece Apellidos */
		    this.apellido2 = apellido2;
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

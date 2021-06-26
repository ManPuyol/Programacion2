

public class Asignatura {
	
	 private String nombre;
	 private String grado;
	 private String maxalum;

	   //COMPLETA
	   Asignatura(String nombre, String grado, String numalum){
		      this.nombre = nombre;
		      this.grado= grado;
		      this.maxalum = numalum;
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

		  public String getGrado() {
			    /** Retorna Nombre */
			    return this.grado;
			  }

			  public void setGrado(String grado) {
			    /** Establece grado */
			    this.grado = grado;
			  }

			  public String getMaxAlum() {
				    /** Retorna Nombre */
				    return this.maxalum;
				  }

				  public void setNumalum(String numalum) {
				    /** Establece Nombre */
				    this.maxalum = numalum;
				  }
				  
				  public String getAll() {
					    /** Retorna Nombre */
					    return this.nombre;
					  }
}

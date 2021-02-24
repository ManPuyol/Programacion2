public class Coche {
	
	private String marca;
	
	private String color;
	
	private String modelo;
	
	private int caballos;
	
	private int npuertas;
	
	private String matricula;
	
	public Coche(String marca, String color, String modelo,int caballos, int npuertas, String matricula) {
		
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.caballos = caballos;
		this.npuertas = npuertas;
		this.matricula = matricula;		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public int getNpuertas() {
		return npuertas;
	}

	public void setNpuertas(int npuertas) {
		this.npuertas = npuertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}

public class PruebaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche1, coche2;
		
		coche1 = new Coche("seat", "rojo","león", 120,5,"3467BGS");
		
		coche2 = new Coche("seat", "amarillo","toledo", 150,4,"6578DSR");
		
		System.out.println("El coche " + coche1.getMarca() + " "+ coche1.getModelo() + " es de color " +coche1.getColor());
		System.out.println("El coche " + coche2.getMarca() +" "+ coche2.getModelo() + " es de color " +coche2.getColor());
		
		coche1.setColor("rosa");
		coche1.setMatricula("8569MU");
		coche1.setMarca("Tesla");
		coche1.setModelo("S");
		
		coche2.setColor("azul");
		coche1.setMatricula("W698452");
		System.out.println("----------------------");
		System.out.println("El coche " + coche1.getMarca() + " "+ coche1.getModelo() + " es de color " +coche1.getColor());
		System.out.println("El coche " + coche2.getMarca() +" "+ coche2.getModelo() + " es de color " +coche2.getColor());

	}

}

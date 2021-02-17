import java.awt.Color;

class Silla {
	

	private String color;
	private String estilo;
	private int carga_maxima;

	private boolean esta_rota;
	private int carga_actual;
	
	public Silla(String c, String estilo, int carga_maxima) {
		this.color = c;
		this.estilo = estilo;
		this.carga_maxima = carga_maxima;
		this.carga_actual = 0;
		this.esta_rota = false;
	}
	
	public void sentar ( int nuevo_Peso ) {
		this.carga_actual = nuevo_Peso;
	}
	public void levantar () {
		this.carga_actual = 0;
	}
	public void dibujar ( ) {
		System.out.println("La silla tiene un estilo "+ this.estilo);
		System.out.println("Actualmente soporta una carga de "+ this.carga_actual + " kg.");
		System.out.println("Puede soportar una carga máxima de "+ this.carga_maxima + " kg.");
		
		if(this.esta_rota) {
			System.out.println("La silla está rota");
		}
		else {
			System.out.println("La silla NO está rota");
		}
		
		System.out.println(this.color);
		System.out.println("                                                                                \r\n"
				+ "                                                                                \r\n"
				+ "                                                                 ..,,.          \r\n"
				+ "                                      ,*******************************/.        \r\n"
				+ "                                     ,*********,************,*********/         \r\n"
				+ "                                    ,*********/***********************/         \r\n"
				+ "                                   .*********//************/*********//         \r\n"
				+ "                                   ,********///************/********///         \r\n"
				+ "                                  ,************************,*********/.         \r\n"
				+ "                                 .,*********/*************/**********/          \r\n"
				+ "                                 ,************************,*********//          \r\n"
				+ "                                .***********/**********************//(          \r\n"
				+ "                                ,*********//(************/*********//(          \r\n"
				+ "                               ,************/********/////*///////**//          \r\n"
				+ "                               ,***********/*************,*********///          \r\n"
				+ "                              ,*************************/,**********//          \r\n"
				+ "                             ,************/*************,***********(*          \r\n"
				+ "                            ,,***********/,************(****,*****///           \r\n"
				+ "                    .,,.,,,,,*********////***************,,,,****/*//           \r\n"
				+ "         .,,,,,,,,,,*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,******/////(/            \r\n"
				+ "      ,,,,********,*,,,,,,,,,*****,,,,**************///////(///(/*              \r\n"
				+ "       ..***/**********************************//(//////////*/                  \r\n"
				+ "                 @@.      .****///////*/*****//@@@@&%,     ,&@                  \r\n"
				+ "                &@&               %&%     %@@               #&&                 \r\n"
				+ "                &&.               %&%     #&&                %&&                \r\n"
				+ "               &@&                #&%     (&&                 %&&               \r\n"
				+ "               &@,                %&%     (&&                  &@,              \r\n"
				+ "              &@&                 #&%     *&&                  /&&              \r\n"
				+ "              &&,                 #&%     ,&&                   %&@             \r\n"
				+ "             &@&                  #&%     .&&                    %&&            \r\n"
				+ "             @&*                  %&%      &&                     &&#           \r\n"
				+ "            &&%                   #&#      &&.                    .&&           \r\n"
				+ "            &&/                   #&(      &&,                     #&&          \r\n"
				+ "           %&&                    /&*      &&*                      %&&         \r\n"
				+ "           &&*                    *&,      &&(                       &&/        \r\n"
				+ "          ,&%                     .&       &&#                        &&        \r\n"
				+ "          &%,                      &       &&(                         &&       \r\n"
				+ "          &%                               &&/                         .&%      \r\n"
				+ "         %%.                               &@*                          #&      \r\n"
				+ "         &%                                %@,                                  \r\n"
				+ "        ,%                                 %@,                                  \r\n"
				+ "                                           #&.                                  \r\n"
				+ "                                           /&.                                  \r\n"
				+ "                                                                              "
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");
	}


}


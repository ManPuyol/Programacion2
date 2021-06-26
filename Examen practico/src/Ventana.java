import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

class Ventana extends Frame{
	private Button b1, b2, b3, crearalumno, crearasignatura,mostraralumnos, mostrarasignaturas;
	private CardLayout cl;
	private Panel cardpanel;
	private TextField nombre, nombrea, grado, numalumnos, apellido1, apellido2, dni;
	private Label letreroalumno, letreroasignatura;
	private TextArea infor;
	

	
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();;
	
	    Ventana(){
	    	super("Examen Practico");
			//COMPLETAR: ESTABLECER LOS ATRIBUTOS
			
	    	b1= new Button("Crear Asignatura");
	    	b2 = new Button("Crear Alumno");
	    	b3= new Button("Mostrar Informacion");
	    	crearalumno = new Button("Crear Alumno");
	    	crearasignatura= new Button("Crear Asignatura");
	    	mostraralumnos= new Button("Mostrat Alumnos");
	    	mostrarasignaturas = new Button("Mostrat Asignaturas");
	    	
	    	nombre = new TextField("", 70);
	    	nombrea = new TextField("", 70);
	    	grado = new TextField("", 70);
	    	numalumnos = new TextField("", 10);
	    	apellido1 = new TextField("", 60);
	    	apellido2 = new TextField("", 60);
	    	dni = new TextField("", 70);
	    	
	    	letreroalumno = new Label("");
	    	letreroasignatura = new Label("");
	    	
	    	infor = new TextArea();
	    	
			//COMPLETAR: Panel que va a contener CUATRO paneles organizados como CardLayout
	    	
	    	cl = new CardLayout();	    	
	    	cardpanel = new Panel();	    	
	    	cardpanel.setLayout(cl);
			
			//COMPLETAR: PANEL ASIGNATURAS
			Panel panelasignaturas = new Panel();
			panelasignaturas.setLayout(new FlowLayout());
			panelasignaturas.add(new Label("Nombre"));
			panelasignaturas.add(nombrea);
			panelasignaturas.add(new Label("Grado"));
			panelasignaturas.add(grado);
			panelasignaturas.add(new Label("Numero de alumnos"));
			panelasignaturas.add(numalumnos);
			panelasignaturas.add(crearasignatura);
			panelasignaturas.add(letreroasignatura);

			//COMPLETAR: LÓGICA BOTÓN crearasignatura
			crearasignatura.addMouseListener(new MouseAdapter ( ){
				public void mousePressed(MouseEvent e ){
					
					if (!nombrea.getText().equals("") && !grado.getText().equals("") && !numalumnos.getText().equals("")) {
						letreroasignatura.setText("La asignatura"+ nombrea.getText()+ " del grado: " +grado.getText()+ " se ha agregado correctamente");
					
						Asignatura as = new Asignatura(nombrea.getText() , grado.getText(), numalumnos.getText()  );
						
						asignaturas.add(as);
						
						nombrea.setText("");
						grado.setText("");
						numalumnos.setText("");
					
					} else {
						letreroasignatura.setText("Error -- complete todos los campos");
					}

				}
			});
			
			//COMPLETAR: PANEL ALUMNOS
			Panel panelalumnos = new Panel();
			panelalumnos.setLayout(new FlowLayout());
			panelalumnos.add(new Label("Nombre"));
			panelalumnos.add(nombre);
			panelalumnos.add(new Label("Primer Apellido"));
			panelalumnos.add(apellido1);
			panelalumnos.add(new Label("Segundo Apellido"));
			panelalumnos.add(apellido2);
			panelalumnos.add(new Label("DNI"));
			panelalumnos.add(dni);
			panelalumnos.add(letreroalumno);
			panelalumnos.add(crearalumno);

			
			//COMPLETAR: LÓGICA BOTÓN crearalumno
			crearalumno.addMouseListener(new MouseAdapter ( ){
				public void mousePressed(MouseEvent e ){
					
					if (!nombre.getText().equals("") && !apellido1.getText().equals("")  && !apellido2.getText().equals("") && !dni.getText().equals("")) {
						letreroalumno.setText("El alumno"+ nombre.getText()+ " con DNI: " + dni.getText()+ " se ha agregado correctamente");
					
						Alumno al = new Alumno(nombre.getText() , apellido1.getText(), apellido2.getText(), dni.getText()   );
						
						alumnos.add(al);
						
						nombre.setText("");
						apellido1.setText("");
						apellido2.setText("");
						dni.setText("");
					
					} else {
						letreroalumno.setText("Error -- complete todos los campos");
					}

				}
			});
			
			//COMPLETAR: PANEL INFORMACIÓN
			Panel panelinformacion = new Panel();
			panelinformacion.add(infor);
			panelinformacion.add(mostraralumnos);
			panelinformacion.add(mostrarasignaturas);

			//COMPLETAR: LÓGICA BOTÓN mostraralumnos
			mostraralumnos.addMouseListener(new MouseAdapter ( ){
				
				public void mousePressed(MouseEvent e ){
					
					for(int i=0; i < alumnos.size(); i++ ) {
					
						String text = infor.getText();
						
						infor.setText(text +"\n"+ alumnos.get(i).getNombre()  );
						infor.setText(text +"\n"+ alumnos.get(i).getApellido1()  );
						infor.setText(text +"\n"+ alumnos.get(i).getApellido2()  );
						infor.setText(text +"\n"+ alumnos.get(i).getDni()  );
						infor.setText(text +"\n"+ "---------------------------"  );

						
					}
					
				}
			});		
			//COMPLETAR: LÓGICA BOTÓN mostrarasignaturas
			mostrarasignaturas.addMouseListener(new MouseAdapter ( ){
				
				public void mousePressed(MouseEvent e ){
					
					for(int i=0; i < asignaturas.size(); i++ ) {
						
						String text = infor.getText();
						
						infor.setText(text +"\n"+ asignaturas.get(i).getNombre()  );
						infor.setText(text +"\n"+ asignaturas.get(i).getGrado()  );
						infor.setText(text +"\n"+ asignaturas.get(i).getMaxAlum()  );
						infor.setText(text +"\n"+ "---------------------------"  );

						
					}

				}
				
			});	
			
			
			
			//Panel de inicio
			Panel inicioPanel = new Panel( ) ;
			inicioPanel.setBackground (new Color(.85f,.85f ,.85f));
			inicioPanel.add(new Label("Bienvenido al examen final de programación" )) ;
			
			//Añadimos los tres panelens asignandoles un nombre
			cardpanel.add(inicioPanel, "inicio");
			cardpanel.add(panelasignaturas, "asignaturas");
			cardpanel.add(panelalumnos, "alumnos");
			cardpanel.add(panelinformacion, "informacion");
			
			//COMPLETAR Panel de control desde donde se selecciona el subpanel a mostrar
			Panel controlpanel = new Panel();

			
			//COMPLETAR LÓGICA B1
			b1.addMouseListener(new MouseAdapter ( ){
				public void mousePressed(MouseEvent e ){
					cl.show(cardpanel , "asignaturas" ) ;
				}
			});
			
			//COMPLETAR LÓGICA B2
			b2.addMouseListener(new MouseAdapter ( ){
				public void mousePressed(MouseEvent e ){
					cl.show(cardpanel , "alumnos" ) ;
				}
			});
			
			//COMPLETAR LÓGICA B3
			b3.addMouseListener(new MouseAdapter ( ){
				public void mousePressed(MouseEvent e ){
					cl.show(cardpanel , "informacion" ) ;
				}
			});
			
			controlpanel.add(b1);
			controlpanel.add(b2);
			controlpanel.add(b3);
			//COMPLETAR LAYOUT DEL FRAME
			setLayout(new BorderLayout());
			add(controlpanel,BorderLayout.SOUTH);
			add(cardpanel,BorderLayout.CENTER);

	
			class TrataEventosCierre extends WindowAdapter{
			       public void windowClosing(WindowEvent e){
			           System.exit(0);
			        }
			   }
			
			this.addWindowListener(new TrataEventosCierre());

	}
}

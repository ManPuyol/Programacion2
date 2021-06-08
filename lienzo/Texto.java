import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Texto implements Figura{
	Color color;
	String text,font;
	int x1,y1,size;

	Texto(int x1,int y1,Color c, String s,String f,String sz){
		this.x1=x1;
		this.y1=y1;
		color = c;
		text = s;
		font = f;
		
		switch (sz) {
		  case "10":
		    size = 10;
		    break;
		  case "12":
			    size = 12;
			    break;
		  case "14":
			    size = 14;
			    break;
		  case "16":
			    size = 16;
			    break;
		  case "18":
			    size = 18;
			    break;
		  case "20":
			    size = 20;
			    break;
		  case "22":
			    size = 22;
			    break;
		  case "24":
			    size = 24;
			    break;
		  case "26":
			    size = 26;
			    break;
		}
	}
	public void pinta(Graphics g){
		g.setFont(new Font(font, Font.PLAIN, size));
		g.setColor(color);	

		System.out.println("ENTRA3");
		System.out.println(y1);
		System.out.println(x1);
		
		g.drawString(text,x1, y1);		
			
	}
	
}
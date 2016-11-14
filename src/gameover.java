
import java.awt.*;

public class gameover extends Canvas{


	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {    
	    Invaders.go=true;
	    g.setColor(Color.RED);
	    g.fillRect(0,0,640,480);
	    g.setColor(Color.black);
	    Font car1=new Font("Monospaced",Font.PLAIN,72);
	    g.setFont(car1);
	    g.drawString("GAME OVER",120,180);
    
    }  
}
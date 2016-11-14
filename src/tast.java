import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class tast implements KeyListener{

    public void  keyPressed(KeyEvent e){
	    char car;
	    car=e.getKeyChar();
	
	    if(car=='a' && Invaders.pos!=0 )
	    	Invaders.pos-=10;
	    
	    if(car=='d')
	    	if(Invaders.pos!=610)	
	     Invaders.pos+=10;	
	    if( car==' ' && Invaders.pro[Invaders.pi]==false) //lancia colpo se non è stato lanciato prima
	    	new colpo().start();
    }
    
    public void  keyReleased(KeyEvent e){}
    public void  keyTyped(KeyEvent e){}
     
}
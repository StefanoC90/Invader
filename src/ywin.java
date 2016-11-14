import java.awt.*;

public class ywin extends Canvas{

    public void paint(Graphics g) {    
    Invaders.go=true;
    g.setColor(Color.green);
    g.fillRect(0,0,640,480);
    g.setColor(Color.black);
    Font car1=new Font("Monospaced",Font.PLAIN,72);
    g.setFont(car1);
    g.drawString("YOU WIN",140,180);
    
    } 
}
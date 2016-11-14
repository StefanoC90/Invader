import java.awt.*;
import java.applet.*;


public class graf extends Applet{


//	Image img = getImage(int a);
    
    Image immagine;
    Image nem;
    Toolkit defToolKit = Toolkit.getDefaultToolkit();	

    
    public void paint(Graphics g) {
   	immagine = defToolKit.getImage("img/1.jpg");	
    nem = defToolKit.getImage("img/2.jpg");

//        g.drawImage(img, 0, 0, this);

    int i=0;
    int j=0;
    g.setColor(Color.BLACK);
    g.fillRect(0,0,640,480);
    g.setColor(Color.red);
    g.drawImage(immagine,Invaders.pos,400,this);


	for( ;i<20;i++)
    if(Invaders.pro[i]==true){ //ctreazione proiettile
    	g.setColor(Color.yellow);
    	g.fillRect(Invaders.cx[i]+12,Invaders.cy[i],6,20);
    }	
    
    g.setColor(Color.white);
    for(i=0;i<Invaders.ni;i++)
    	for(j=0;j<Invaders.nj;j++)
    	if(Invaders.nave[i][j]==true) //creazione navicelle esistenti
    		g.drawImage(nem,Invaders.temp1+(i*30)+63,Invaders.temp2+(j*30)+60,this);

    }   
}

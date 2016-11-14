import java.awt.*;

public class Invaders {

public static int temp1=0; //dislocamento in x delle navicelle nemiche
public static int temp2=-30; //dislocamento in y delle navicelle nemiche
public static int vtemp1=10; //velocità di cambiamento di dislocamento in x delle navicelle nemiche
public static int vtemp2=30; //velocità di cambiamento di dislocamento in y delle navicelle nemiche	
public static int car=0;
public static Frame f=new Frame("SPECE INVADERS");
public static int pos=0; 
public static graf t=new graf(); //creazione iterfaccia
public static int ni=9;
public static int nj=2;
public static int colpiti=0; //conta le navicelle colpite
public static int cn;
public static int cx[]= new int[20]; //posizione x del proiettile
public static int cy[]=new int[20]; //posizione y del proiettile
public static boolean pro[]=new boolean[20]; //stato proiettile
public static int pi=0; //contatore ptoiettili;
public static boolean rep=false;
public static long tempo; 
public static boolean nave[][]=new boolean[ni][nj]; //stato navette
public static boolean go=false; //variabile per il gameover 
public static gameover gam=new gameover(); //creazione interfaccia gameover
public static ywin win=new ywin(); //creazione interfaccia win



public static void main(String argv[]) {
	
    int i,j;
    for(i=0;i<20;i++)
    	pro[i]=false;
    
	for(i=0;i<ni;i++)
	    for(j=0;j<nj;j++)
		    nave[i][j]=true;
     f.setSize(640,480);
	 cn=ni*nj;
     f.add(t);
     f.setResizable(false);
     f.setLocation(400,300);	
     f.setVisible(true);
        
     new ThreadSleep().start();	
     f.addWindowListener(new GestoreFinestra());
     t.addKeyListener(new tast());
     t.addMouseListener(new mou());
	
    }
    
}
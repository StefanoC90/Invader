
public class colpo extends Thread { 


    public void run() {
    int i=Invaders.pi;
    if(Invaders.pi<19)
    Invaders.pi++;
    else
    Invaders.pi=0;
   	Invaders.cx[i]=Invaders.pos;
    Invaders.cy[i]=370;
    Invaders.pro[i]=true;

    int ro=0;
    for( ;(Invaders.cy[i]>-10)&&(ro==0);){
    //simula
    
    
    int d=(Invaders.cx[i]-60-Invaders.temp1)/30; //individua la colonna
    int g=(Invaders.cy[i]-Invaders.temp2-40)/30; //individua la riga
    if((g<Invaders.nj)&&(g>=0)&&(d>=0)&&(d<Invaders.ni))
    if(Invaders.nave[d][g]==true){
    ro=1;
    Invaders.nave[d][g]=false;
    Invaders.colpiti++;
    }
    

 
    try {
    	Thread.sleep(10); 
    	Invaders.cy[i]+=-2;	
    }
    catch (InterruptedException e) { return; }
    }
    Invaders.pro[i]=false;
   
   
    
    }
    
    }
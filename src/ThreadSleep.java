

public class ThreadSleep extends Thread { 
public void run() { 
boolean sx=true;
Invaders.tempo=System.currentTimeMillis();
for ( ;Invaders.go==false; ) {

	if(Invaders.rep==true){
    	Invaders.rep=false;
		Invaders.f.setVisible(true);
	}
	else{
    	Invaders.rep=true;	
		Invaders.f.setVisible(true);	
	}


	try {

		Thread.sleep(300); 
		
		if(Invaders.colpiti==Invaders.cn){
			Invaders.f.remove(Invaders.t);
    		Invaders.f.add(Invaders.win);
     		Invaders.f.setVisible(true);
    		break;
		}
		
		if(Invaders.temp2==(12-Invaders.nj)*30){ //attiva Gameover
			Invaders.f.remove(Invaders.t);
    		Invaders.f.add(Invaders.gam);
     		Invaders.f.setVisible(true);
    		break;
    	}
    	
    	if(Invaders.temp1==0){ //cambiamento dallo spostamento di destra a sinistra e scende di una linea  
    		Invaders.temp2+=Invaders.vtemp2; 
    		sx=true;
    	}
     
    	if(sx==true){ //spostamento a destra
   			Invaders.temp1+=Invaders.vtemp1;
    	}
    
    else{ //spostamento a sinistra
    
    	Invaders.temp1-=Invaders.vtemp1;
   	}
   	
    if(Invaders.temp1>(17-Invaders.ni)*30){ //cambiamento dallo spostamento di sinistra a destra e scende di una linea  
    	sx=false;    
    	Invaders.temp2+=Invaders.vtemp2;
    }
    
   	Invaders.t.repaint();
}
    

catch (InterruptedException e) { return; }


}
    Invaders.f.add(new gameover());

}}
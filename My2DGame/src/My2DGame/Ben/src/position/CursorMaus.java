package position;

import java.awt.*;


public class CursorMaus {
    public void start(){
   		int x, y;
   		while(true){
    	x = MouseInfo.getPointerInfo().getLocation().x;
    	y = MouseInfo.getPointerInfo().getLocation().y;
    	System.out.print("                     x:"+x+"  y:"+y+"\r");
   		} 
	}
}


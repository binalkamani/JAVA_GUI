import java.awt.Color;
import java.awt.Graphics;


public class Player {
	
	private int y;
	private int yVelocity = 0;
	
	private int width = 10;
	private int height = 50;
	
	
	public Player(){
		
	}
	
	public void update(){
	
		y = y + yVelocity;
	}

	public void paint(Graphics g){
		
		//g.setColor(Color.RED);
		
		//g.drawLine(150, 300, 250, 400);
		//g.drawLine(450, 300, 350, 400);
		
		//g.fillArc(75, 75, 30, 50, 0, 345);
	
		//g.fillRect(75, y, width, height);
	}
	
	public void setYVelocity(int speed){
		yVelocity = speed;
	}
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.Timer;

public class Ball implements ActionListener {

	private int x = 100;
	private int y = 200;
	private int num = 0;
	
	private int xVelocity = 0;
	private int yVelocity = 0;
	
	private int X1 = 0, Y1 = 0, X2 = 0, Y2 = 0;
	private int X3 = 0, Y3 = 0, X4 = 0, Y4 = 0;
	private int time = 1000;
	private int size = 30;
	int index;
	String[] array = new String[100];
	
//	Ball newball = new Ball();
	
	public Ball(){
		
		Timer tim = new Timer(time, this);
		
		tim.start();
	}


	String file_name = "C:/Users/binalkamani/Desktop/config.txt";
	
	public void getdata(){
		
		try{
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i, c, b;
			for (i=0; i < aryLines.length ; i++){
				//System.out.println(aryLines[i]);
				//for (b = aryLines[i].length(); b >0 ; b--){
				StringTokenizer st = new StringTokenizer(aryLines[i]);
		     	 //System.out.println("tokens count : " + st.countTokens());
		     	 c = st.countTokens();
		     	for(c=st.countTokens(); c > 0; c--){
		     		 
					array[index] = st.nextElement().toString();
					//System.out.println("arry = " + array[index]);
		     		 index++;
		     	
				}
			}
			
			System.out.println("Number of Balls : " + array[1]);
		   	System.out.println("Period of ball appearance(in sec) : " + array[2]);
		   	System.out.println("Initial X Position : " + array[3]);
		   	System.out.println("Initial Y Position : " + array[4]);
	     	System.out.println("First line coordinates X1, Y1, X2 , Y2 : " + array[6] + " , " + array[7] + " , " + array[8] + " , " + array[9]);
	     	System.out.println("Second line coordinates X1, Y1, X2 , Y2 : " + array[11] + " , " + array[12] + " , " + array[13] + " , " + array[14]);
	     	
	     	num = Integer.parseInt(array[1]);
	     	x = Integer.parseInt(array[3]);
	     	y = Integer.parseInt(array[4]);
	     	X1 = Integer.parseInt(array[6]);
	     	Y1 = Integer.parseInt(array[7]);
	     	X2 = Integer.parseInt(array[8]);
	     	Y2 = Integer.parseInt(array[9]);
	     	X3 = Integer.parseInt(array[11]);
	     	Y3 = Integer.parseInt(array[12]);
	     	X4 = Integer.parseInt(array[13]);
	     	Y4 = Integer.parseInt(array[14]);
	     	
			
		}
		
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public void update(){
		
		//get x velocity from input text file/ serial
		//get y velocity from input tex file/ serial	

		
		x = x + xVelocity;
		y = y + yVelocity;
		
		if(x < 0){
		
			xVelocity = 10;
		}
		else if (x + size > 500){
			
			xVelocity = -10;
		}
		
		if(y < 0){
			
			yVelocity = 10;
		}
		else if (y + size > 500){
			
			yVelocity = -10;
		}
	}
	
	public void paint(Graphics g){
		
//			for(int b = num; b > 0; b--){
			g.setColor(Color.GREEN);
			g.fillOval(x, y, size, size);
	//		}
			// add delay here
	
		//System.out.println("value of num : " + num);
		g.setColor(Color.RED);
		
		g.drawLine(X1, Y1, X2, Y2);
		g.drawLine(X3, Y3, X4, Y4);

		//g.drawLine(x1, y1, x2, y2);
	}

	public void setYVelocity(int i) {
		// TODO Auto-generated method stub
		//yVelocity = speed;
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//add_ball(g);
	}



	public void add_ball(Graphics g) {
		// TODO Auto-generated method stub
		//if(num>1){
			//newball.paint(g);
			//num--;
		//}
	}
}

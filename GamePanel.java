import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	Ball ball = new Ball();
	Player player = new Player();

	public GamePanel()
	{
		Timer tim = new Timer(50, this);
		
		tim.start();
		
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	private void update()
	{
		player.update();
		ball.update();
	}
	
	public void paintComponent(Graphics g){
		//g.setColor(Color.BLUE);
		
		g.fillRect(0, 0, 515, 550);	//rectangle bondary box
		player.paint(g);
		ball.paint(g);
		//ball.paint(g);
	}
	
	public void actionPerformed(ActionEvent e){
		update();
		repaint();
		
	}
	
	public void keyPressed(KeyEvent e){
		
		if(e.getKeyCode() == KeyEvent.VK_INSERT){
			ball.getdata();
		}
	}
	
	public void keyReleased(KeyEvent e){
		
	}
	
	public void keyTyped(KeyEvent e){
		
	}
}

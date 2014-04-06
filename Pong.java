import javax.swing.JFrame;
import javax.swing.JPanel;


public class Pong extends JFrame{

	public Pong(){
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new GamePanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Pong();
		
	}

}

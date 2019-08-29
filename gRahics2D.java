package deneme1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;





@SuppressWarnings("serial")
public class gRahics2D  extends JFrame implements ActionListener{
	public int Pyi = 40;
	public int Pxi = 50;
	public int Pys = 370;
	public int Pxs = 320;
	public int delay = 1;
	Timer timer;
	public int velYi =2;
	public int velXi =15;
	
	public int velYs = 2;
	public int velXs = 15;
	
	public gRahics2D() {
		gui();
	}
	
	public void gui() {
		setTitle("Deneme");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		setVisible(true);
		timer = new Timer(delay, this);
		timer.start();
		
		
	}

	 public void paint(Graphics g) {
		 //backGround
		 g.setColor(Color.darkGray);
		 g.fillRect(1, 1, 400, 400);
		 
		 //left object
		 g.setColor(Color.green);
   		g.fillRect(Pxi, Pyi, 20, 20);
   		
   		//right object
   		g.setColor(Color.yellow);
   		g.fillRect(Pxs, Pys, 20, 20);
   		
   		
   		g.dispose();
   		
     }
	
	public static void main(String[] args) {
				new gRahics2D();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		
		if(Pyi<=30 || Pyi>=370) {
			velYi = -velYi;
				if(Pyi==370) {
					Pxi +=velXi;
				}
		}
		if(Pys<=30 || Pys>=370) {
			velYs = -velYs;
			if(Pys==30) {
				Pxs -=velXs;
			}
		}
		Pyi +=velYi;
		Pys +=velYs;
		repaint();
	}


	
}



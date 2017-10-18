package scrap;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Drawings extends JFrame{
	private JFrame f = new JFrame("Graphics Assignment");
	Drawings() {
		f.add(new MyPanel());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(700, 700);
		f.setVisible(true);
	}
	    public static void main(String[] args) {
		new Drawings();
	}
}
  
class MyPanel extends JPanel {
	    public MyPanel() {
	    	setBorder(BorderFactory.createLineBorder(Color.black));
	    }
  
	    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		JLabel l = new JLabel("drawRect()"); l.setBounds(50, 110, 50, 50);
		this.add(l);
		g.drawOval(150, 50, 50, 50);
		g.drawLine(250, 100, 300, 50);
		//g.drawPolyline(xPoints, yPoints, nPoints);
		//g.drawPolygon(p);
		//g.fillRect();
		//g.clearRect(x, y, width, height);
		//g.draw3DRect(x, y, width, height, raised);
		//g.fill3DRect(x, y, width, height, raised);
		//g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
		//g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		//g.fillOval(x, y, width, height);
		//g.drawArc(x, y, width, height, startAngle, arcAngle);
		//g.fillArc(x, y, width, height, startAngle, arcAngle);
		//g.drawPolygon(p);
		//g.fillPolygon(p);
	    }
}

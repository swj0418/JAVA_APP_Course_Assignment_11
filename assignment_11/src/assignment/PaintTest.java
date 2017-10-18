package assignment;

import java.awt.*;
import javax.swing.*;

public class PaintTest {
	JPanel motherPanel = new JPanel();
	private JFrame f;
	JComponent c1 = new JComponent() {
		protected void paintComponent(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(0, 0, getWidth(), getHeight());
		};
	};
	
	PaintTest( ) {
		GridLayout gridlayout = new GridLayout();
		gridlayout.setColumns(5);
		gridlayout.setRows(4);
		motherPanel.setLayout(gridlayout);
		motherPanel.add(new MyPanel()); motherPanel.add(new MyPanel2()); motherPanel.add(new MyPanel3());
		motherPanel.add(new MyPanel4()); motherPanel.add(new MyPanel5()); motherPanel.add(new MyPanel6());
		motherPanel.add(new MyPanel7()); motherPanel.add(new MyPanel8()); motherPanel.add(new MyPanel9());
		motherPanel.add(new MyPanel10()); motherPanel.add(new MyPanel11()); motherPanel.add(new MyPanel12());
		motherPanel.add(new MyPanel13()); motherPanel.add(new MyPanel14()); motherPanel.add(new MyPanel15());
		motherPanel.add(c1);
		
		
		
	    f = new JFrame("Basic Graphic Program");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(motherPanel);
		f.setSize(900, 700);
		f.setResizable(false);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PaintTest();
	}
}
  
class MyPanel extends JPanel {
	JLabel l = new JLabel("DrawRect()");
	public MyPanel() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		add(l);
	}
}
class MyPanel2 extends JPanel {
	JLabel l = new JLabel("DrawLine()");
    public MyPanel2() {
    	setLayout(new FlowLayout());
    	this.setSize(100, 100);
    	setBorder(BorderFactory.createLineBorder(Color.black));
}
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.drawLine(100, 150, 150, 100);
    	add(l);
    	}
}
class MyPanel3 extends JPanel {
	JLabel l = new JLabel("Draw3DRect()");
	public MyPanel3() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.draw3DRect(50, 50, 100, 80, true);
		add(l);
	}
}
class MyPanel4 extends JPanel {
	JLabel l = new JLabel("DrawArc()");
	public MyPanel4() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawArc(50, 100, 100, 100, 0, 180);
		add(l);
	}
}
class MyPanel5 extends JPanel {
	JLabel l = new JLabel("DrawOval()");
	public MyPanel5() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50, 50, 100, 100);
		add(l);
	}
}
class MyPanel6 extends JPanel {
	JLabel l = new JLabel("DrawPolygon()");
	public MyPanel6() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();
		Polygon pp = new Polygon();
		p.addPoint(10,  160);
		p.addPoint(80, 30);
		p.addPoint(160, 160);
		p.addPoint(124, 100);
		p.addPoint(42, 100);
		g.drawPolygon(p);
		pp.addPoint(140, 40);
		pp.addPoint(180, 40);
		pp.addPoint(160, 40);
		pp.addPoint(160, 60);
		pp.addPoint(160, 20);
		pp.addPoint(160, 40);
		g.drawPolygon(pp);
		add(l);
	}
}
class MyPanel7 extends JPanel {
	JLabel l = new JLabel("DrawRoundRect()");
	public MyPanel7() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRoundRect(50, 50, 100, 100, 50, 100);
		add(l);
	}
}
class MyPanel8 extends JPanel {
	JLabel l = new JLabel("FillRect()");
	public MyPanel8() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(50, 50, 100, 100);
		add(l);
	}
}
class MyPanel9 extends JPanel {
	JLabel l = new JLabel("Fill3DRect()");
	public MyPanel9() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fill3DRect(50, 50, 100, 100, false);
		add(l);
	}
}
class MyPanel10 extends JPanel {
	JLabel l = new JLabel("fillArc()");
	public MyPanel10() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillArc(50, 50, 100, 100, 120, 180);
		add(l);
	}
}
class MyPanel11 extends JPanel {
	JLabel l = new JLabel("FillRoundRect()");
	public MyPanel11() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRoundRect(50, 50, 100, 70, 20, 20);
		add(l);
	}
}
class MyPanel12 extends JPanel {
	JLabel l = new JLabel("DrawOval()");
	public MyPanel12() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(50, 50, 100, 20);
		add(l);
	}
}
class MyPanel13 extends JPanel {
	JLabel l = new JLabel("ClearRect()");
	public MyPanel13() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(50, 50, 100, 20);
		add(l);
	}
}
class MyPanel14 extends JPanel {
	JLabel l = new JLabel("DrawPolyline()");
	public MyPanel14() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int i[] = {100, 80, 10, 190};
		int j[] = {80, 30, 20, 100};
		g.drawPolyline(i, j, 4);
		add(l);
	}
}
class MyPanel15 extends JPanel {
	JLabel l = new JLabel("fillpolygon()");
	public MyPanel15() {
		setLayout(new FlowLayout());
		this.setSize(100, 100);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();
		p.addPoint(20, 150);
		p.addPoint(85, 30);
		p.addPoint(160, 150);
		g.fillPolygon(p);
		add(l);
	}
}



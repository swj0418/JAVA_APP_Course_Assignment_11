package snowManFace;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel; 

class MyPanel extends JPanel {
       public void paintComponent(Graphics g) {
           	  super.paintComponent(g);
             g.setColor(Color.YELLOW);
             g.fillOval(20, 30, 200, 200);
             g.setColor(Color.BLACK);
             g.drawArc(60, 80, 50, 50, 180, -180);	// ¿ÞÂÊ ´«À» ±×¸°´Ù.
             g.drawArc(150, 80, 50, 50, 180, -180);	// ¿À¸¥ÂÊ ´«À» ±×¸°´Ù.
             g.drawArc(70, 130, 100, 70, 180, 180);	// ÀÔÀ» ±×¸°´Ù.

       }
}
public class SnowManFace extends JFrame {
       public SnowManFace() {
             setSize(280, 300);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setTitle("´«»ç¶÷ ¾ó±¼");
             setVisible(true);
             add(new MyPanel());
       }
 
       public static void main(String[] args) {
             SnowManFace s=new SnowManFace();
       }
}

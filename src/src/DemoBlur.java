package src;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DemoBlur extends JPanel {
	
	private BPanel bg = new BPanel("/1bg.jpg", 12);
	
  public DemoBlur() {
	  
	    JFrame frame1 = new JFrame("DemoBlur");
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	    frame1.setBounds(0, 0, 842, 480);
	    frame1.setVisible(true);
	    
	    bg.setBounds(0, 0, 842, 480);
		bg.setLayout(null);
		
		frame1.add(bg);
  }

  public static void main(String s[]) {
	  DemoBlur demoblur = new DemoBlur();
  }
}

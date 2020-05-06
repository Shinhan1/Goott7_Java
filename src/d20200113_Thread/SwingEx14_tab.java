package d20200113_Thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

// tap

public class SwingEx14_tab extends JFrame {
	
	
	public SwingEx14_tab() {
		super("tab test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 500, 500);
		
		JTabbedPane jtp = makeTab();
		
		add(jtp, "Center");
		
		setVisible(true);
	}
	
	
	public JTabbedPane makeTab() {
		JTabbedPane jtp = new JTabbedPane();
		
		jtp.addTab("C", new JLabel(new ImageIcon("src/images/c_img.jpg")));
		jtp.addTab("JAVA", new JLabel(new ImageIcon("src/images/java_img.jpg")));
		jtp.addTab("C++", new JLabel(new ImageIcon("src/images/cpp_img.jpg")));
		jtp.addTab("Graphic", new GraphicTab());
		
		return jtp;
	}

	public static void main(String[] args) {
		new SwingEx14_tab();
	}
	
}

class GraphicTab extends JPanel {
	
	public GraphicTab() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.YELLOW);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 100, 100);
		
		g.setColor(Color.BLACK);
		g.fillOval(10, 10, 100, 100);
	}
	
	
}

package d20200110_Swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SwingEx10_Slider2 extends JFrame implements ChangeListener{
	JLabel jlb;
	JSlider[] slider = new JSlider[3];
	
	public SwingEx10_Slider2() {
		// TODO Auto-generated constructor stub
		super("slider ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 300, 300, 500);
		setLayout(new FlowLayout());
	
		for(int i=0; i<slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
			slider[i].setPaintTicks(true);
			slider[i].setMinorTickSpacing(10);
			slider[i].setPaintLabels(true);
			slider[i].setMajorTickSpacing(50);
			slider[i].addChangeListener(this);
			add(slider[i]);
		}
		
		slider[0].setBackground(Color.RED);
		slider[1].setBackground(Color.GREEN);
		slider[2].setBackground(Color.BLUE);
		
		
		
		jlb = new JLabel("                                                 ");
		jlb.setOpaque(true);
		jlb.setBackground(Color.WHITE);
		add(jlb);
		
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx10_Slider2();
	}//main() end

	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		int r = slider[0].getValue();	//getValue를 통해 slider값?을 가져올 수 있음
		int g = slider[1].getValue();
		int b = slider[2].getValue();
			
		Color c = new Color(r, g, b);
	
		jlb.setBackground(c);
		
		//System.out.println(c.getRGB());
	}
	
	
	
}

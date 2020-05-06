package d20200110_Swing;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class SwingEx09_Slider extends JFrame{
	public SwingEx09_Slider() {
		// TODO Auto-generated constructor stub
		super("slider test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 300, 500, 500);
	
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 300, 150);
		slider.setPaintTicks(true);	//눈금 넣기 위해서 true로 살리고
		slider.setMinorTickSpacing(10);	//10단위로 눈금 표시
		
		slider.setPaintLabels(true);	//라벨 넣기 위해서 true로 살리고
		slider.setMajorTickSpacing(50);	//50단위로 라벨 나오게 설정
		
		
		add(slider);
		
		
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx09_Slider();
	}//main end
	
	
	
}

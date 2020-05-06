package d20200109_Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingEx04_Image extends JFrame {
	JLabel jl1, jl2, jl3;
	ImageIcon img1, img2;
	
	public SwingEx04_Image() {
		super("image test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(400, 300, 500, 700);
		setLayout(new FlowLayout());
		
		// 라벨 출력
		jl1 = new JLabel("라벨에 문자열 출력");
		add(jl1);
		
		// 이미지 아이콘 생성
		img1 = new ImageIcon("src/images/img2.jpg");
		
		jl2 = new JLabel(img1);
		
		
		add(jl2);
		
		img2 = new ImageIcon("src/images/btnNormal.jpg");
		
		jl3 = new JLabel("image2", img2, SwingConstants.CENTER);
		
		
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new SwingEx04_Image();
	}
	
	

}

package d20200113_Thread;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;

// toolbar

public class SwingEx15_toolbar extends JFrame {
	
	public SwingEx15_toolbar() {
		super("toolbar test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 500, 500);
		
		
		makeToolbar();		// 메소드 호출
		
		setVisible(true);
	}
	
	public void makeToolbar() {
		JToolBar jtb = new JToolBar("toolbar menu");		// 툴바 생성
		
		jtb.setFloatable(false);		// 툴바가 움직이는 것을 방지하기 위해 고정시킴
		
		JComboBox jcb = new JComboBox();
		jcb.addItem("JAVA");
		jcb.addItem("primitive");
		jcb.addItem("reference");
		jcb.addItem("OOP");
		
		
		jtb.add(jcb);
		jtb.addSeparator();				// 일정 간격만큼 띄움
		
		jtb.add(new JButton("lib"));	// lib 버튼 생성
		jtb.addSeparator();
		jtb.add(new JButton(new ImageIcon("src/images/open.jpg")));		// 이미지 버튼 생성
		jtb.addSeparator();
		jtb.add(new JButton(new ImageIcon("src/images/save.jpg")));
		jtb.addSeparator();
		
		this.add(jtb, "North");		// 툴바를 위에 생성
		
	}
	
	public static void main(String[] args) {
		new SwingEx15_toolbar();
	}

}

package d20200113_Thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

// Chooser 

public class SwingEx13_Chooser_컬러판 extends JFrame implements ActionListener {
	
	JLabel lb = new JLabel("즐거운 월요일");
	
	public SwingEx13_Chooser_컬러판() {
		super("ColorChooser test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 500, 500);
		
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Nanum Gothic", Font.BOLD, 50));
		lb.setOpaque(true);
		
		colorMenu();
		
		add(lb);
		
		setVisible(true);
	}
	
	private void colorMenu() {
		JMenuBar menuBar = new JMenuBar();				// 메뉴바 생성
		JMenu menu = new JMenu("선택");					// 메뉴 생성
		JMenuItem item = new JMenuItem("컬러판");			// 메뉴안에 있는 아이템들 생성
		
		item.addActionListener(this);				// 동작 실행
		
		menu.add(item);					// 컨테이너에 추가
		menuBar.add(menu);				// 컨테이너에 추가
		this.setJMenuBar(menuBar);		// 컨테이너에 추가
		
	}
	
	public static void main(String[] args) {
		new SwingEx13_Chooser_컬러판();
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Click~");
		System.out.println(e.getSource());
		
		JColorChooser chooser = new JColorChooser();
		
		String txt = e.getActionCommand();			// 텍스트를 인식해 오는 것
		
		// System.out.println(txt);					// text 인식해옴
		
		if(txt.equals("컬러판")) {
			Color color = chooser.showDialog(null, "컬러판", Color.WHITE);
			
			// lb.setBackground(color);
			 lb.setForeground(color);
		}
		
		
		
	}

}

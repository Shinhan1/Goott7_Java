package d20200109_Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEx03_JButton extends JFrame implements ActionListener{

	JPanel jp;
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	
	public SwingEx03_JButton() {
		super("jbutton test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 500, 500);
		setLayout(null);
		
		jp = new JPanel();
		jp.setSize(500, 300);
		jp.setBackground(Color.CYAN);	//panel색을 cyan으로 지정
		jp.setLayout(new FlowLayout());
				
		add(jp);
	
		jbtn1 = new JButton("normal");
		jbtn1.addActionListener(this);
		
		jp.add(jbtn1);
		
		//모양이 변화된 버튼(jbtn2)
		jbtn2 = new JButton("changedBtn");
		jbtn2.setOpaque(true);//불투명하게 만듬
		//jbtn2.setBackground(Color.YELLOW);
		jbtn2.setForeground(Color.YELLOW);
		jbtn2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		jbtn2.addActionListener(this);
		jp.add(jbtn2);	//컨테이너에 넣기
		
		//비활성화된 버튼(jbtn3)
		jbtn3 = new JButton("disabled");
		jbtn3.setEnabled(false);	//false 되면 비활성화 => 버튼 클릭이 안됨
		jbtn3.addActionListener(this);
		jp.add(jbtn3);	//컨테이너에 넣기
		
		//toggle 기능 수행(jbtn4)	//클릭하면  =>  접어진게 펴지는 느낌으로 나오고 / 펴진게 접어진 느낌으로 사라짐 (블라인드 느낌)
		jbtn4 = new JButton("toggle");
		jbtn4.addActionListener(this);
		jp.add(jbtn4); //컨테이너에 넣기
		
		
		
		
		setVisible(true);
		
		
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx03_JButton();
	}//main() end
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == jbtn1) {
			//버튼의 위치값, 크기를 출력
			System.out.println("x : " + jbtn1.getX() + "y : " + jbtn1.getY() + 
						"size : " + jbtn1.getSize().getWidth() + " , " + jbtn1.getSize().getHeight());
	
		}
		//changedBtn 클릭하면 콘솔창에 폰트정보와 글자색 정보를 출력해보세요
		else if(obj == jbtn2) {
			System.out.println("폰트정보 : " + jbtn2.getFont().getName() + " , " + "글자색정보 : " + jbtn2.getForeground());
		}
		//toggle
		else if(obj == jbtn4) {
			if(jbtn1.isVisible()) {
				jbtn3.setVisible(false);
				jbtn2.setVisible(false);
				jbtn1.setVisible(false);
			}else {
				jbtn1.setVisible(true);
				jbtn2.setVisible(true);
				jbtn3.setVisible(true);
			}
		}
		
	}

}

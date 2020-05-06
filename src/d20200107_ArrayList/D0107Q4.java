package d20200107_ArrayList;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class D0107Q4 extends Frame implements ActionListener{
	
	Button bt1, bt2, bt3;
	TextField tf1, tf2;
	ArrayList<String> al = new ArrayList<String>();			// 전역변수로 ArrayList al 객체 생성
	
	public D0107Q4() {	// 생성자 시작
		// TODO Auto-generated constructor stub
		super("Stack");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		setLayout(null);
		this.addWindowListener(new WindowAdapter() {		// 윈도우창 끄기
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
			
		});
		
		bt1 = new Button("Input");	// button 1, 2, 3 생성
		bt2 = new Button("Print");
		bt3 = new Button("Storage");	// 저장 공간 : Input을 눌렀을 때 값이 잘 저장이 되나 확인하기 위해 만든 버튼
		
		tf1 = new TextField();		// textfield 1,2 생성
		tf2 = new TextField();

		
		bt1.setBounds(20, 200, 100, 100);
		bt2.setBounds(145, 200, 100, 100);
		bt3.setBounds(270, 200, 100, 100);
		
		tf1.setBounds(50, 70, 200, 30);
		tf2.setBounds(50, 130, 200, 30);

		
		add(bt1); add(bt2); add(tf1); add(tf2); add(bt3);		// 버튼  생성

		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}	// 생성자 end
	
	public static void main(String[] args) {
		new D0107Q4();		// 실행
	}	// main end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();		// 오브젝트 객체 생성

		
		if(ob == bt1) {			// bt1 눌렀을 때
			System.out.println("Input~");
			al.add(tf1.getText());
			
			
		}else if (ob == bt2){	// bt2 눌렀을 때
			for(int i = 0; i < al.size(); i++) {	// al의 사이즈까지
				String str = (String)al.get(i);		// String으로 바꿈
				if(str.equals(tf2.getText())) {		// tf2에 쓴값과 같냐?
					System.out.println(tf2.getText()+"는 " + (i+1) + " 번 째에 있습니다.");	// 같으면 출력
				}
			}
			
		}else if (ob == bt3) {	// bt3 눌렀을때
			System.out.println(al);
		}	// 저장된 값 확인
		
		// 중복된 값도 보려고 ArrayList를 사용하였지만
		// 중복된 값을 없애려면 HashSet을 사용하면 된다
		
		
		
	}

}

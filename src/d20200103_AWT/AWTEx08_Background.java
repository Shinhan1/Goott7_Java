package d20200103_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * 	이벤트 처리
 * 	1. 이벤트 소스 결정
 * 	2. 이벤트 소스에 감지기 부착
 * 	3. 핸들러 객체 정의
 */

public class AWTEx08_Background extends Frame implements ActionListener{
	// 핸들러 객체를 따로 만들 필요 없이 현재 내 구현클래스에 오버라이드해서 사용하자
	// 다만, 이벤트가 많거나 로직이 복잡해지면 핸들러 객체를 따로 만들어서 사용하는 것을 권장\
	
	Button bt;
	
	public AWTEx08_Background() {		// 생성자
		super("Action Test2");
		setSize(400, 300);
		setLocation(600, 200);
		setVisible(true);
		
		bt = new Button("Click");
		add(bt, "South");					// 컨테이너에 버튼과 위치를 선언	
		
		// 감지기 부착
		bt.addActionListener(this);			// 자기자신을 알리는 것 this
		
		
	}
	
	public static void main(String[] args) {
		new AWTEx08_Background();			// 함수 실행
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	// 액션 함수
		// TODO Auto-generated method stub
		System.out.println("Wow");
		System.out.println("e : " + e.getSource());
		
		Object ob = e.getSource();			// 오브젝트로 getSource를받음
		
		if(ob == bt) {				// ob가 버튼 bt일 때
			setBackground(Color.CYAN);		// 배경색 CYAN 실행
		}
		
		
		
		
		
	}
	
}

package d20200103_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * 	이벤트 처리
 * 	1. 이벤트 소스 결정
 * 	2. 이벤트 감지기
 * 	3. 핸들러 동작
 */

public class AWTEx06_Event extends Frame{
	Button btY, btN;
	
	public AWTEx06_Event() {
		super("Event");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		// Frame을 상속 받으면 기본적으로 BorderLayout이 적용되고 있음
		// => 기본 배치 관리자가 있음
		
		// 기본 배치 관리자를 사용하지 않겠다
		setLayout(null);
		
		btY = new Button("Yes");
		btN = new Button("No");
		
		// 배치관리자가 없으면 모든 컴포넌트가 각각의 위치, 크기를 지정 가능
		btY.setSize(50, 20);
		btY.setLocation(30, 60);
		
		btN.setSize(50, 20);
		btN.setLocation(100, 60);
		
		add(btY);
		add(btN);
		
		// 자바 이벤트 감지기 : ad~~~~Listener
		Handler h1 = new Handler();
		btY.addActionListener(h1);
		
		
		
	}	// 생성자 end
	
	public static void main(String[] args) {
		new AWTEx06_Event();
	}
	
}

class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("왜 눌러~~~");
		
	}
	
}

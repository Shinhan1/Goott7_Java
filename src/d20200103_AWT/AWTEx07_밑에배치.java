package d20200103_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 버튼 한 개 만들고 South에 배치해보세요
public class AWTEx07_밑에배치 extends Frame{
	Button bt1;
	
	public AWTEx07_밑에배치() {
		super("south");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		bt1 = new Button("Click");

		add(bt1, bl.SOUTH);		// 컨테이너에 추가

		Handle h = new Handle();
		bt1.addActionListener(h);

	}
	
	public static void main(String[] args) {
		new AWTEx07_밑에배치();
	}

}

class Handle implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("South");
		System.exit(0);
		
		// 0 : 정상종료
		// 0 외의 다른 값은 비정상종료
	}
	
}




package d20200103_AWT;

import java.awt.*;

// Layout Manager : 배치 관리자
// 컨테이너에는 컴포넌트를 어떻게 배치해야할지 도와주는 배치관리자가 있음

public class AWTEx03 extends Frame{
	
	Button bt1, bt2, bt3, bt4, bt5;
	
	public AWTEx03() {
		super("LayoutManager");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		BorderLayout bl = new BorderLayout();
		// 레이아웃을 적용
		setLayout(bl);
		
		bt1 = new Button("EAST");
		bt2 = new Button("WEST");
		bt3 = new Button("SOUTH");
		bt4 = new Button("NORTH");
		bt5 = new Button("CENTER");
		
		// 컨테이너에 담고 아무런 크기, 위치 지정하지 않으면 중앙에 겹쳐짐 -> default가 BorderLayout
		add(bt1, bl.EAST);
		add(bt2, bl.WEST);
		add(bt3, bl.SOUTH);
		add(bt4, bl.NORTH);
		add(bt5, bl.CENTER);
		
		
	}
	
	public static void main(String[] args) {
		new AWTEx03();
	}

}

package d20200103_AWT;

import java.awt.*;


public class AWTEx05_GridLayout extends Frame{
	
	Button bt1, bt2, bt3, bt4, bt5, bt6;
	
	public AWTEx05_GridLayout() {
		super("GridLayout");
		
		setSize(600, 300);
		setLocation(600, 300);
		setVisible(true);
		
		GridLayout gl = new GridLayout(3, 2);			// 배열 (3,2)처럼 출력
		setLayout(gl);									
		
		bt1 = new Button("EAST");
		bt2 = new Button("WEST");
		bt3 = new Button("SOUTH");
		bt4 = new Button("NORTH");
		bt5 = new Button("CENTER");
		bt6 = new Button("CENTER2");
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
	}
	
	public static void main(String[] args) {
		new AWTEx05_GridLayout();
	}
	
}

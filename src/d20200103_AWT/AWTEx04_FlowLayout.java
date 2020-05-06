package d20200103_AWT;

import java.awt.*;

// FlowLayout : 물 흐르듯 레이아웃 생성

public class AWTEx04_FlowLayout extends Frame{
	
	Button bt1, bt2, bt3, bt4, bt5;
	
	public AWTEx04_FlowLayout() {
		super("FlowLayout");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		bt1 = new Button("EAST");
		bt2 = new Button("WEST");
		bt3 = new Button("SOUTH");
		bt4 = new Button("NORTH");
		bt5 = new Button("CENTER");
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		
		
	}
	
	public static void main(String[] args) {
		new AWTEx04_FlowLayout();
	}
	
}

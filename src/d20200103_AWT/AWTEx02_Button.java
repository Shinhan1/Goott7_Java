package d20200103_AWT;

import java.awt.*;

// container : 다른 component

public class AWTEx02_Button extends Frame{
	
	Button btn;
	
	public AWTEx02_Button(String title) {
		super(title);
		
		// setTitle(title);
		
		// 사이즈 : 400, 200
		setSize(400, 200);
		
		// 위치 : 597, 289
		setLocation(597, 289);
		
		btn = new Button("Click~");
		
		// 컨테이너에 컴포넌트를 담아야 쓸 수 있음
		add(btn);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		AWTEx02_Button ae2 = new AWTEx02_Button("버튼이 있는 윈도우");
		
		
	}

}

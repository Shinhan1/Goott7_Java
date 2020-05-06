package d20200109_Swing;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//key event
public class SwingEx02_KeyEvent extends JFrame{
	JPanel jp = new JPanel();
	JLabel[] msg;
	
	public SwingEx02_KeyEvent() {
		// TODO Auto-generated constructor stub
		super("key event test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//Frame의 x를 누르면 끄고 나가겠다.
		//setLayout(null);
		jp = new JPanel(); //컴포넌트는 사용하려면 컨테이너에 붙여야함
		setBounds(400, 300, 500, 500);
		setContentPane(jp);
		
		msg = new JLabel[3];
		
		msg[0] = new JLabel("keyCode 값");
		msg[1] = new JLabel("uniCode 값");
		msg[2] = new JLabel("keyBoard 값");
	
		/*
		for(int i=0; i<msg.length; i++) {
			msg[i].setSize(80, 40);
		}
		*/	//=> 모름~
		for(int i=0; i<msg.length; i++) {
			jp.add(msg[i]);
			
			
			msg[i].setOpaque(true);	//Opaque : 투명도?..	//두개가 겹쳐서 안보임 -> 메시지를 불투명하게 처리하면 background 컬러가 보임
			msg[i].setBackground(Color.PINK);
		
		}

		setVisible(true);
		
		Handler h =new Handler();
		jp.addKeyListener(h);
		
		jp.requestFocus();	//이벤트를 바로 인식하려면 focus가 가있어야 함
		
		
		
	}//생성자 end

	class Handler extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			System.out.println(e.getKeyCode());
			
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			msg[0].setText(Integer.toString(keyCode)); // int를 string으로 출력
			msg[1].setText(Character.toString(keyChar)); //char를 string으로 출력
			msg[2].setText(e.getKeyText(keyCode)); //키보드 문자열을 그대로 인식해옴
			
			
			
		
		
		}//keyPressend end
	}//Handler class end
	
	
	
	
	
	public static void main(String[] args) {
		new SwingEx02_KeyEvent();
	
	}//main() end
	
}//SwingEx02 class end

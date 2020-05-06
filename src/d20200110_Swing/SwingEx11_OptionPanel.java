package d20200110_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// option

public class SwingEx11_OptionPanel extends JFrame{
		
	
	public SwingEx11_OptionPanel() {
		super("optionPanel test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 500, 300);
		
		// JPanel 호출
		MyJpanel jp = new MyJpanel();
		add(jp);		
		
		setVisible(true);
		
	}	// 생성자 end
	public static void main(String[] args) {
		new SwingEx11_OptionPanel();
	}	// main end
	

}	// SwingEx11 class end

class MyJpanel extends JPanel {
	JButton inputBtn, confirmBtn, msgBtn;
	JTextField jtf;
	
	public MyJpanel() {
		// TODO Auto-generated constructor stub
		inputBtn = new JButton("Input Dialog");
		confirmBtn = new JButton("Confirm Dialog");
		msgBtn = new JButton("msg Dialog");
		
		jtf = new JTextField(10);
		
		add(inputBtn); add(confirmBtn); add(msgBtn); add(jtf);
		
		inputBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int result = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
//				System.out.println(result);
				
				if(result == 0) {
					jtf.setText("YES");
				}else if(result == 1) {
					jtf.setText("NO");
				}else if(result == 2) {
					jtf.setText("CANCLE");
				}
					
			}
		});	// confirBtn end
		
		msgBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "경고", "메세지창", JOptionPane.ERROR_MESSAGE);
					
				
			}
		});
		
		
		
		
		
	}
	
	
	
	
	
}

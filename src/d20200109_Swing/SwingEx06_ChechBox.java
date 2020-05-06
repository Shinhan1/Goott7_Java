package d20200109_Swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx06_ChechBox extends JFrame implements ItemListener{
	
	JLabel jlb1, jlb2;
	JCheckBox[] jcbs = new JCheckBox[3];
	String[] name = {"C", "JAVA", "C++"};
	
	
	int sum = 0;
	public SwingEx06_ChechBox() {
		super("checkbox test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 250, 500);
		setLayout(new FlowLayout());
		
		jlb1 = new JLabel("원하시는 과목을 선택하세요 (중복가능)");
		
		this.add(jlb1);
		
		for(int i = 0; i < jcbs.length; i++) {
			jcbs[i]	= new JCheckBox(name[i]);
			jcbs[i].setBorderPainted(true);
			jcbs[i].addItemListener(this);
			this.add(jcbs[i]);
			
		}
		
		jlb2 = new JLabel("수강료는 0원 입니다.");
		this.add(jlb2);
		
		
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new SwingEx06_ChechBox();
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getItem());
		int chk = 1;
		if(e.getStateChange() == ItemEvent.SELECTED) {
			chk = 1;
		}else
			chk = -1;
		
		if(e.getItem() == jcbs[0]) {
			sum += chk*50000;
		}else if(e.getItem() == jcbs[1]) {
			sum += chk*100000;
		}else if(e.getItem() == jcbs[2]) {
			sum += chk*50000;
		}
		
		jlb2.setText("수강료는 " + sum + "원 입니다."); 
		
	}
	
	

}

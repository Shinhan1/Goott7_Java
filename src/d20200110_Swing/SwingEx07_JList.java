package d20200110_Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

//list
//combobox
public class SwingEx07_JList extends JFrame{

	String[] str = {"서울", "인천", "대전", "대구", "울산", "부산", "광주", "제주"};
	JScrollPane jp;
	
	public SwingEx07_JList() {
		super("JList test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 300, 500, 500);
		setLayout(new FlowLayout());
		
		//list
		JList<String> list = new JList<String>(str);
		
		add(list);
		
		
		//스코롤이 있는 리스트
		JList<String> scrollList = new JList<String>(str);
		jp = new JScrollPane(scrollList, 
							jp.VERTICAL_SCROLLBAR_ALWAYS,
							jp.HORIZONTAL_SCROLLBAR_NEVER);
		add(jp);
		
		//콤보박스가 있는 리스트
		JComboBox<String> comBox = new JComboBox<String>(str);
		add(comBox);
		
		JComboBox<String> comBox2 = new JComboBox<String>();
		for(int i=0; i<str.length; i++) {
			comBox2.addItem(str[i]);
		}
		add(comBox2);
		
		setVisible(true);
		
		
		
		
		
		

	}//생성자 end
	
	
	public static void main(String[] args) {
		new SwingEx07_JList();
	}
	
	
}

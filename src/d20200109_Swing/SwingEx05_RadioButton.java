package d20200109_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

// radio button
public class SwingEx05_RadioButton extends JFrame implements ItemListener{
	
	Container cp;
	JRadioButton jrb1, jrb2, jrb3;
	JLabel jlb;
	JPanel jp;
	//ImageIcon imageIcon1, imageIcon2, imageIcon3, imgChecked;
	String[] str = {"C", "JAVA", "C++"};
	
	ImageIcon[] img = {
			new ImageIcon("src/images/c_img.jpg"),
			new ImageIcon("src/images/java_img.jpg"),
			new ImageIcon("src/images/cpp_img.jpg")
	};
	JRadioButton[] jrbs = new JRadioButton[3];
	
	public SwingEx05_RadioButton() {
		super("radio button test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
//		setLayout(new FlowLayout());
		cp = getContentPane();
		
//		imageIcon1 = new ImageIcon("src/images/java.jpg");
//		imgChecked = new ImageIcon("src/images/java_check.jpg");
		
		jp = new JPanel();
		jp.setBackground(Color.CYAN);		
		
		ButtonGroup group = new ButtonGroup();
		for(int i = 0; i < jrbs.length; i++) {
			jrbs[i] = new JRadioButton(str[i]);
			jrbs[i].setOpaque(false);
			group.add(jrbs[i]);
			jp.add(jrbs[i]);
			// 이벤트
			jrbs[i].addItemListener(this);
		}
		
		
		jlb = new JLabel("", JLabel.CENTER);
//		jlb.setHorizontalAlignment(SwingConstants.CENTER);
		
//		jrb1 = new JRadioButton("java", imageIcon1);
//		jrb1.setOpaque(false);
//		jrb1.setBorderPainted(true);	
//		jrb1.setSelectedIcon(imgChecked);
		
//		jp.add(jrb1);
				
		jrbs[1].setSelected(true);
		cp.add(jp, "North");
		cp.add(jlb, "Center");
		
		setBounds(400, 300, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx05_RadioButton();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(jrbs[0].isSelected()) {
			jlb.setIcon(img[0]);
		}else if(jrbs[1].isSelected()) {
			jlb.setIcon(img[1]);
		}else if(jrbs[2].isSelected()) {
			jlb.setIcon(img[2]);
		}
		System.out.println(jrbs[0]);
	}
	
}





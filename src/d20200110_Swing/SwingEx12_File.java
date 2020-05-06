package d20200110_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SwingEx12_File extends JFrame implements ActionListener {
	
	JLabel jlb = new JLabel();
	
	public SwingEx12_File() {
		super("fileDialog test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 400, 400);
		makeMenu();
		
		add(jlb);
		
		setVisible(true);
		
	}
	
	private void makeMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("파일");
		JMenuItem jmi = new JMenuItem("열기");
		
		jmi.addActionListener(this);
		
		jm.add(jmi);
		jmb.add(jm);
		setJMenuBar(jmb);	// 메뉴바는 setter를 통해서 붙여야 함!!
		
		
	}
	public static void main(String[] args) {
		new SwingEx12_File();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser choice = new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, jpg", "jpg");
		choice.setFileFilter(filter);
		
		int val = choice.showOpenDialog(null);
		if(val != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하세요", "waring", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String filePath = choice.getSelectedFile().getPath();
		
		jlb.setIcon(new ImageIcon(filePath));
		pack();		// 윈도우 창 크기를 컴포넌트 크기로 자동 맞춤
		
	}

}

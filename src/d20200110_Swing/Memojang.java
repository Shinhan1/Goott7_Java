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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Memojang extends JFrame implements ActionListener {
	
	JLabel jlb = new JLabel();
	
	public Memojang() {
		super("Memojang");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100, 300, 400, 400);
		makeMenu();
		add(jlb);
		
		JTextArea t = new JTextArea();
		add(t);
		
		setVisible(true);
		
	}
	
	private void makeMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("파일");
		JMenu jm1 = new JMenu("편집");
		JMenu jm2 = new JMenu("서식");
		JMenu jm3 = new JMenu("보기");
		JMenu jm4= new JMenu("도움말");
		
		
		JMenuItem jmi = new JMenuItem("새로 만들기");
		JMenuItem jmi1 = new JMenuItem("열기");
		JMenuItem jmi2 = new JMenuItem("저장");
		JMenuItem jmi3 = new JMenuItem("다른 이름으로 저장");
		JMenuItem jmi4 = new JMenuItem("페이지 설정");
		JMenuItem jmi5 = new JMenuItem("인쇄");
		JMenuItem jmi6 = new JMenuItem("끝내기");
		
		JMenuItem jmie1 = new JMenuItem("실행 취소");
		JMenuItem jmie2 = new JMenuItem("잘라내기");
		JMenuItem jmie3 = new JMenuItem("복사");
		JMenuItem jmie4 = new JMenuItem("붙여넣기");
		JMenuItem jmie5 = new JMenuItem("삭제");
		JMenuItem jmie6 = new JMenuItem("찾기");
		JMenuItem jmie7 = new JMenuItem("바꾸기");
		JMenuItem jmie8 = new JMenuItem("이동");
		JMenuItem jmie9 = new JMenuItem("모두 선택");
		JMenuItem jmie10 = new JMenuItem("시간/날짜");
		
		JMenuItem jmio1 = new JMenuItem("자동 줄 바꿈");
		JMenuItem jmio2 = new JMenuItem("글꼴");
		JMenuItem jmio3 = new JMenuItem("시간/날짜");
		
		JMenuItem jmiv = new JMenuItem("상태 표시줄");
		
		JMenuItem jmih1 = new JMenuItem("도움말 보기");
		JMenuItem jmih2 = new JMenuItem("메모장 정보");
		
		Handler h = new Handler();
		
		jmi1.addActionListener(this);
		jmi6.addActionListener(h);
		
		jm1.add(jmie1);
		jm1.add(jmie2);
		jm1.add(jmie3);
		jm1.add(jmie4);
		jm1.add(jmie5);
		jm1.add(jmie6);
		jm1.add(jmie7);
		jm1.add(jmie8);
		jm1.add(jmie9);
		jm1.add(jmie10);
		
		jm2.add(jmio1);
		jm2.add(jmio2);
		jm2.add(jmio3);
		
		jm3.add(jmiv);
		
		jm4.add(jmih1);
		jm4.add(jmih2);
		
		
		jm.add(jmi);
		jm.add(jmi1);
		jm.add(jmi2);
		jm.add(jmi3);
		jm.add(jmi4);
		jm.add(jmi5);
		jm.add(jmi6);
		
		jmb.add(jm);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		
		
		setJMenuBar(jmb);	// 메뉴바는 setter를 통해서 붙여야 함!!
		
		
	}
	public static void main(String[] args) {
		new Memojang();
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

	class Handler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			
		}
		
	}
}


package d20200116_IOandDB;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import d20200115_IO.IOEx03;

public class FileCopy extends JFrame implements ActionListener {
	
	JLabel[] jl = new JLabel[3];
	JTextField[] jf = new JTextField[2];
	JButton[] jb = new JButton[4];
	File savefile;
	JFileChooser cho = new JFileChooser();
	
	public FileCopy() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 300, 500, 400);
		setLayout(null);
		
		jl[0] = new JLabel("Source");
		jl[1] = new JLabel("Dest");
		jl[2] = new JLabel("FILE COPY");
		jl[2].setBounds(140, 30, 300, 50);
		jl[2].setFont(new Font("고딕", Font.BOLD, 40));
		
		jb[0] = new JButton("OPEN");
		jb[1] = new JButton("SAVE");
		jb[2] = new JButton("OK");
		jb[3] = new JButton("CANCEL");		
		
		for(int i = 0; i < jf.length; i++) {
			jf[i] = new JTextField();
			jl[i].setBounds(30, 50+((i+1)*60), 50, 50);
			jf[i].setBounds(100, 50+((i+1)*60), 230, 50);
			jb[i].setBounds(350, 50+((i+1)*60), 100, 50);
			
			add(jl[i]);
			add(jf[i]);
		}
		jb[2].setBounds(130, 250, 100, 50);
		jb[3].setBounds(270, 250, 100, 50);	
	
		for(int i = 0; i < jb.length; i++) {
			add(jb[i]);
			jb[i].addActionListener(this);
		}
		add(jl[2]);
			
		setVisible(true);
	}
	public static void main(String[] args) {
		new FileCopy();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		
		if(ob == jb[0]) {
			fileSearch();
			jf[0].setText("" + savefile);
			
		}else if (ob == jb[1]) {
			fileSearch();
			jf[1].setText("" + savefile);
		}else if (ob == jb[2]) {
			try {
				fileCopy();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (ob == jb[3]) {
			System.exit(0);
			
		}
		
	}
	public void fileSearch() {
		cho.setCurrentDirectory(new File("C:\\Users\\goott7-15\\IOTest"));
		
		int value = cho.showOpenDialog(null);
		if(value != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않으셨습니다.",
					"주의",JOptionPane.WARNING_MESSAGE);
			return;		
		}else {
			savefile = cho.getSelectedFile();
			
		}
		
	}	
	public void fileCopy() throws IOException {
		File f = new File(jf[0].getText());
		File f1 = new File(jf[1].getText());
		
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(f1);
		
		int v = 0;
		
		while((v=fr.read()) != -1) {
			System.out.println((char)v);
			fw.write(v);
		}
		// char stream은 내부적으로 buffer를 사용하고 있음
		fw.flush();
		fw.close();
		
	}
	
}

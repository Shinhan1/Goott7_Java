package d20200106_Graphic_Button;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Set;

import d20191223_Arr.ArrayLotto;

public class D0106Q2 extends Frame implements ActionListener{
	
	Button bt1;
	TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	
	public D0106Q2() {
		super("Lotto");
		setSize(400, 300);
		setLocation(600, 400);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf4 = new TextField();
		tf5 = new TextField();
		tf6 = new TextField();
		tf7 = new TextField();
		bt1 = new Button("Lotto~~!!");
		
		tf1.setBounds(30, 60, 40, 40);
		tf2.setBounds(90, 60, 40, 40);
		tf3.setBounds(150, 60, 40, 40);
		tf4.setBounds(210, 60, 40, 40);
		tf5.setBounds(270, 60, 40, 40);
		tf6.setBounds(330, 60, 40, 40);	
		tf7.setBounds(390, 60, 40, 40);
		bt1.setBounds(70, 150, 200, 50);
		
		// 컨테이너에 추가
		add(bt1);
		add(tf1); add(tf2); add(tf3); add(tf4); add(tf5); add(tf6); add(tf7);
		
		bt1.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new D0106Q2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Lotto lt = new Lotto();
		lt.print();
		
		tf1.setText(""+lt.data[0]);
		tf2.setText(""+lt.data[1]);
		tf3.setText(""+lt.data[2]);
		tf4.setText(""+lt.data[3]);
		tf5.setText(""+lt.data[4]);
		tf6.setText(""+lt.data[5]);
		
		
	}
	

}

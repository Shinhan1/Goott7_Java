package d20200117_DB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Copy1  extends JFrame implements ActionListener{
   
   JButton jbtn1, jbtn2, jbtn3, jbtn4;
   JLabel jlb1, jlb2;
   JTextField jtf1, jtf2;
   

   public Copy1() {
      super("dialog to test");
      setBounds(1100,300,500,400);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      
      jbtn1 = new JButton("open");
      jbtn2 = new JButton("cancle");
      jbtn3 = new JButton("ok");
      jbtn4 = new JButton("save");
      jbtn1.setBounds(200,200,70,50);
      jbtn2.setBounds(300,200,70,50);
      jbtn3.setBounds(360,30,70,50);
      jbtn4.setBounds(360,90,70,50);
      
      
      add(jbtn1); add(jbtn2); add(jbtn3); add(jbtn4);
      
      jlb1 = new JLabel("source");
      jlb2 = new JLabel("dest");
      jlb1.setBounds(50,30,90,40);
      jlb2.setBounds(50,90,90,40);
      
      add(jlb1);  add(jlb2);
      
      jtf1 = new JTextField();
      jtf2 = new JTextField();
      
      jtf1.setBounds(150,30,200,40);
      jtf2.setBounds(150,90,200,40);
      
      add(jtf1); add(jtf2);
      
      jbtn1.addActionListener(this);
      jbtn2.addActionListener(this);
      jbtn3.addActionListener(this);
      jbtn4.addActionListener(this);
      
      
      
      
      
      
      setVisible(true);
   }
   
   
   public static void main(String[] args) {
      new Copy1();
   }
   
   
   
   
   
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      
      if(obj==jbtn1) {
         File f = new File(jtf1.getText());
         File f2 = new File(jtf2.getText());
         
         FileReader fr;
         FileWriter fw;
         try {
            fr = new FileReader(f);
            fw = new FileWriter(f2);
            
            int v = 0;
            while((v=fr.read()) != -1) {
               fw.write(v);
            }
            fw.flush();
            fw.close();
            
            
         } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
         System.out.println("복사완룡.");
         
         
         
         
         
         
      }else if(obj==jbtn2) {
         //this.dispose();
         System.exit(0);
         
      }else if(obj==jbtn3) {
         JFileChooser jfc = new JFileChooser("C:\\");
         int result = jfc.showOpenDialog(this);    //현재 파일을 추적하기떄문에?  // 리턴형입니다.
         System.out.println(result);
         
         if(result==JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();  //객체정보를 파일형태로 준다. 파일로 받아야합니다.
            String path = f.getPath();   //문자이기떄문에 sTring
            //System.out.println(path);
            jbtn1.setText(path);
         }
         
      }else if(obj==jbtn4) {
         JFileChooser jfc = new JFileChooser("C:\\");
         int result = jfc.showOpenDialog(this);    //현재 파일을 추적하기떄문에?  // 리턴형입니다.
         System.out.println(result);
         
         if(result==JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();  //객체정보를 파일형태로 준다. 파일로 받아야합니다.
            String path = f.getPath();   //문자이기떄문에 sTring
            //System.out.println(path);
            jbtn2.setText(path);
         
      }
      
   }
   }
}
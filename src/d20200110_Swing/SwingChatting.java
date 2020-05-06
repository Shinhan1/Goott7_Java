package d20200110_Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


// a.k.a 심심이

/*
 *    title : 심심이 ver 0.01
 *  size : 600, 400
 *  x    : 종료 가능
 *  컴포넌트 : Swing
 *  기본기능 : text area, text field, key event,, action event, button, panel
 *  추가기능 : 스크롤 패널, text field 지우기
 * 
 */
public class SwingChatting extends JFrame implements ActionListener, KeyListener{
   
   String[] str = {
         "오늘은 드디어 금요일이야",
         "안녕하세요",
         "심심해~",
         "밥은 먹고 다니니?",
         "부모님은 잘 계시니?",
         "오늘 뭐 먹지?",
         "주말은 너무 금방 지나가",
         "날씨가 미쳤어",
         "인생은 3막이 고약하게 쓰여진 조금 괜찮은 연극이다",
         "힘내 할 수 있어",
         "미친 거 아냐?"
   };
   
   JTextArea jta;
   JTextField jtf;
   JButton jbtn;
   
   //컴포넌트를 부착할 패널
   JPanel jp;
   JScrollPane jsp;
   
   public SwingChatting() {
      super("심심 ver 0.01");
      setBounds(100, 100, 600, 400);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      jta = new JTextArea();               // frame - 부착
      
      jtf = new JTextField(40);            // panel - 부착
      jbtn = new JButton("Insert");         // panel - 부착
      
      
      jp = new JPanel();                  // textfield, button을 부착한 panel
      jsp = new JScrollPane(jta, 
    		  				jsp.VERTICAL_SCROLLBAR_AS_NEEDED, 
    		  				jsp.HORIZONTAL_SCROLLBAR_AS_NEEDED); //  , 수직스크롤바, 수평스크롤바
      //vertical : 수직의 , Horizontal : 수평의
    		  
    		  
      
      //Color : R(red), G(green), B(blue)
      //		0~2255
    		  
      Color c = new Color(110, 220, 243);
      
      jp.setBackground(c);
      jta.setBackground(Color.WHITE);

      // 컨테이터에 컴포넌트를 부착
      add(jta, "Center");
      
      // 패널을 부착 <- textfield와 button을 부착
      jp.add(jtf);
      jp.add(jbtn);
 
      this.add(jp, "South");
      
      
      jtf.addKeyListener(this);
      jbtn.addActionListener(this);
      
      setVisible(true);
      jtf.requestFocus();

   }      //생성자 end
   
   public static void main(String[] args) {
      new SwingChatting();
   }
   
   // 심심이가 말하기.
   private void makeWord() {
      Random rnd = new Random();
      
      int value = rnd.nextInt(str.length);
      
      jta.append("심심이 : " +str[value] + "\n" );
   }
   
   // 사용자 대화 처리
   private void appendData() {
      // TODO Auto-generated method stub
      String txt = jtf.getText();
      
      jta.append("사용자 : "+ txt + "\n");
      
      makeWord();
      
      jtf.setText(""); //글을 쓰고 들어가면 텍스트를 지워줌

   }
   
   
   @Override
   public void keyTyped(KeyEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void keyPressed(KeyEvent e) {
      // TODO Auto-generated method stub
      int key = e.getKeyCode();
      
      
      if(key==e.VK_ENTER) {
    	  appendData();
      }
      
      
   }

   @Override
   public void keyReleased(KeyEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      appendData();
   }

}
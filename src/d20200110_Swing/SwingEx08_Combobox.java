package d20200110_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * c_img, java_img, cpp_img
 * 
 * 
 * combobox - c => c_img 출력
 *          - JAVA => java_img 출력
 *          - C++ => cpp_img 출력
 * 
 */

public class SwingEx08_Combobox extends JFrame  implements ActionListener{
   
   String[] str = {"--------", "C", "JAVA", "C++"};
   
   JLabel jlb;
   
   JComboBox<String> jcb;
   
   ImageIcon[] img = {
         new ImageIcon(""),
         new ImageIcon("src/images/c_img.jpg"),
         new ImageIcon("src/images/java_img.jpg"),
         new ImageIcon("src/images/cpp_img.jpg")
   };
      
   public SwingEx08_Combobox() {
      super("comboBox ex");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setBounds(400, 300, 500, 500);
      setLayout(new FlowLayout());
      
      
      jcb = new JComboBox<String>(str);
      add(jcb);
      
      jlb = new JLabel();
      add(jlb);
      
      jcb.addActionListener(this);
      
      setVisible(true);
      
   }
   
   public static void main(String[] args) {
      new SwingEx08_Combobox();
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      //System.out.println("choosed");
      JComboBox jcbObj = (JComboBox)e.getSource();
      int idx = jcbObj.getSelectedIndex();
      
      jlb.setIcon(img[idx]);
      
   }
   
}

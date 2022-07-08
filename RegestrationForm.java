
package login;

/**
 *
 * @author Shafkat
 */
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.plaf.FontUIResource;
public class Login extends JFrame{
    private JPanel p1,p2;
    private JTextField tex1,tex2,tex3,tex4,tex5;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JPasswordField pas1,pas2;
    private JButton b1,b2;
    Login()
    {
        p1=new JPanel();
        p1.setBounds(0,0,500,80);
        p1.setLayout(null);
        p2=new JPanel();
        p2.setBounds(0,80,500,400);
        p1.setBackground(Color.blue);
        p2.setBackground(Color.black);
        p2.setLayout(null);
        add(p1);
        add(p2);
        tex1 = new JTextField("                        Regestration");
        tex1.setBackground(Color.black);
        tex1.setForeground (Color.red);
        tex1.setFont(new Font("Verdana", Font.PLAIN, 19));
        tex1.setBounds(0,0,500,90);
        tex2 = new JTextField();
        tex2.setBounds(101,0,300,20);
        p2.add(tex2);
        l1 = new JLabel("        USER NAME:");
        l1.setForeground (Color.red);
        l1.setBounds(0,0,100,20);
        p2.add(l1);
        tex3 = new JTextField();
        tex3.setBounds(101,40,300,20);
        p2.add(tex3);
        l2 = new JLabel("                   EMAIL:");
        l2.setForeground (Color.red);
        l2.setBounds(0,40,100,20);
        p2.add(l2);
        tex4 = new JTextField();
        tex4.setBounds(101,80,300,20);
        p2.add(tex4);
        l3 = new JLabel("                 MOBILE:");
        l3.setForeground (Color.red);
        l3.setBounds(0,80,100,20);
        p2.add(l3);
        pas1 = new JPasswordField();
        pas1.setBounds(101,120,300,20);
        p2.add(pas1);
        l4 = new JLabel("            Password:");
        l4.setForeground (Color.red);
        l4.setBounds(0,120,100,20);
        p2.add(l4);
        pas2 = new JPasswordField();
        pas2.setBounds(101,160,300,20);
        p2.add(pas2);
        l5 = new JLabel("  Veify Password:");
        l5.setForeground (Color.red);
        l5.setBounds(0,160,100,20);
        p2.add(l5);
        tex5 = new JTextField();
        tex5.setBounds(101,200,300,20);
        p2.add(tex5);
        l6 = new JLabel("                 Adress:");
        l6.setForeground (Color.red);
        l6.setBounds(0,200,100,20);
        p2.add(l6);
        b1 = new JButton("LOGIN");
        b1.setBounds(125,250,100,40);
        b1.setForeground (Color.red);
        b2 = new JButton("Regester");
        b2.setBounds(280,250,100,40);
        b2.setForeground (Color.red);
        p2.add(b2);
        p2.add(b1);
        tex1.setEditable(false);
        tex1.setBounds(0,0,500,110);
        p1.add(tex1);
        setSize(500,500);
        setLayout(null);
        
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             
        if(e.getSource()==b1)
        {
            log l = new log();
            l.setVisible(true);
            dispose();
        }
        }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
         new log();
         new Login();
    }
    
}
    

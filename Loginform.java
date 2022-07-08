package login;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.plaf.FontUIResource;
public class log extends JFrame{
    private JPanel p1,p2;
    private JTextField tex2213,tex2,tex3,tex4,tex5;
    private JLabel l1,l2,l3,l4,l5,l6;
    private JPasswordField pas1,pas2;
    private JButton b1,b2;
    log()
    {
       p1=new JPanel();
       p2=new JPanel();
       p1.setBounds(0,0,500,100);
       p1.setLayout(null);
       p2.setLayout(null);
       p2.setBounds(0,90,500,400);
       p2.setBackground(Color.black);
       add(p2);
       p1.setLayout(null);
       tex2213 = new JTextField("                             LOGIN");
       tex2213.setFont(new Font("Verdana", Font.PLAIN, 19));
       tex2213.setBounds(0,0,500,100);
       p1.setBackground(Color.black);
       tex2213.setBackground(Color.black);
       tex2213.setForeground (Color.red);
       l1 = new JLabel("               USER NAME:");
       l1.setForeground (Color.red);
       l1.setBounds(0,0,120,20);
       p2.add(l1);
       tex3 = new JTextField();
       tex3.setBounds(121,0,300,20);
       p2.add(tex3);
       l4 = new JLabel("                 Password:");
       l4.setForeground (Color.red);
       l4.setBounds(0,50,120,20);
       p2.add(l4);
       pas2 = new JPasswordField();
       pas2.setBounds(121,50,300,20);
       p2.add(pas2);
       b1 = new JButton("LOGIN");
       b1.setBounds(125,100,100,40);
       b1.setForeground (Color.red);
       b2 = new JButton("Regester");
       b2.setBounds(280,100,100,40);
       b2.setForeground (Color.red);
       p2.add(b2);
       p2.add(b1);
       tex2213.setEditable(false);
       p1.add(tex2213);
       add(p1);
       setSize(500,500);
       b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
             
        if(e.getSource()==b2)
        {
            Login l = new Login();
            l.setVisible(true);
            dispose();
        }
        }
        });
       setLayout(null);
       setVisible(true);
    }
     
}

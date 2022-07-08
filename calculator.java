package calculator;

/**
 *
 * @author Shafkat
 */
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import static java.lang.Math.pow;
public class Calculator extends JFrame implements ActionListener{
    private JPanel p1,p2;
    private JLabel l1;
    private JTextField text1,tex2;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
    private double flg=0,b=0,a=0;
    Calculator()
    {
        p1 = new JPanel();
        p1.setBounds(0,0,400,100);
        p2= new JPanel();
        p2.setBounds(0,100,400,300);
        add(p2);
        p2.setBackground(Color.black);
        p2.setLayout(null);
        p1.setLayout(null);
        b1 = new JButton("1");
        p2.add(b1);
        b1.setBounds(10,0,50,40);
        //b1.setBackground(Color.yellow);
   
        b2 = new JButton("2");
        p2.add(b2);
        b2.setBounds(70,0,50,40);
        b3 = new JButton("3");
        p2.add(b3);
        b3.setBounds(130,0,50,40);
        b4 = new JButton("4");
        p2.add(b4);
        b4.setBounds(10,50,50,40);
        b5 = new JButton("5");
        b6 = new JButton("6");
        p2.add(b6);
        b6.setBounds(130,50,50,40);
        p2.add(b5);
        b5.setBounds(70,50,50,40);
        b7 = new JButton("7");
        p2.add(b7);
        b7.setBounds(10,100,50,40);
        b8 = new JButton("8");
        p2.add(b8);
        b8.setBounds(70,100,50,40);
        b9 = new JButton("9");
        p2.add(b9);
        b9.setBounds(130,100,50,40);
        b10 = new JButton("0");
        p2.add(b10);
        b10.setBounds(10,150,50,40);
        b11 = new JButton(".");
        p2.add(b11);
        b11.setBounds(70,150,50,40);
        b12 = new JButton("=");
        b12.setBounds(130,150,110,40);
        p2.add(b12);
        b13 = new JButton("*");
        b13.setBounds(190,0,50,40);
        p2.add(b13);
        b14 = new JButton("/");
        b14.setBounds(190,50,50,40);
        p2.add(b14);
        b15 = new JButton("+");
        b15.setBounds(190,100,50,40);
        p2.add(b15);
        b16 = new JButton("C");
        b16.setBounds(250,0,50,40);
        p2.add(b16);
        b17 = new JButton("π");
        b17.setBounds(250,50,50,40);
        p2.add(b17);
        b18 = new JButton("-");
        b18.setBounds(250,100,50,40);
        p2.add(b18);
        b19 = new JButton("^");
        b19.setBounds(250,150,50,40);
        p2.add(b19);
        b20 = new JButton("SIN");
        b20.setBounds(310,0,70,40);
        p2.add(b20);
        b21 = new JButton("COS");
        b21.setBounds(310,50,70,40);
        p2.add(b21);
        b22 = new JButton("TAN");
        b22.setBounds(310,100,70,40);
        p2.add(b22);
        b23 = new JButton("LOG");
        b23.setBounds(310,150,70,40);
        p2.add(b23);
        //b8.setBounds(180,0,50,40);
        text1 = new JTextField();
        
        text1.setBounds(33,30,320,40);
        p1.setBackground(Color.black);
        p1.add(text1);
        add(p1);
       b1.addActionListener(this);
       b15.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       b10.addActionListener(this);
       b16.addActionListener(this);
       b12.addActionListener(this);
       b18.addActionListener(this);
       b14.addActionListener(this);
       b19.addActionListener(this);
        b17.addActionListener(this);
        b13.addActionListener(this);
        b20.addActionListener(this);
           b21.addActionListener(this);
           b22.addActionListener(this);
           b23.addActionListener(this);
           b11.addActionListener(this);
        b12.setBackground(Color.yellow);
        b13.setBackground(Color.yellow);
        b14.setBackground(Color.yellow);
        b15.setBackground(Color.yellow);
        b16.setBackground(Color.red);
        b17.setBackground(Color.yellow);
        b19.setBackground(Color.yellow);
        b21.setBackground(new java.awt.Color(0,0,139));
        b20.setBackground(new java.awt.Color(0,0,139));
        b22.setBackground(new java.awt.Color(0,0,139));
        b23.setBackground(new java.awt.Color(0,0,139));
        //b20.setBackground(Color.grey);
        //b21.setBackground(Color.white);
        b12.setFont(new Font("Arial", Font.PLAIN, 20));
        b13.setFont(new Font("Arial", Font.PLAIN, 20));
        b14.setFont(new Font("Arial", Font.PLAIN, 20));
        b15.setFont(new Font("Arial", Font.PLAIN, 20));
        b1.setFont(new Font("Arial", Font.PLAIN, 20));
        b2.setFont(new Font("Arial", Font.PLAIN, 20));
        b3.setFont(new Font("Arial", Font.PLAIN, 20));
        b4.setFont(new Font("Arial", Font.PLAIN, 20));
        b5.setFont(new Font("Arial", Font.PLAIN, 20));
        b6.setFont(new Font("Arial", Font.PLAIN, 20));
        b7.setFont(new Font("Arial", Font.PLAIN, 20));
        b8.setFont(new Font("Arial", Font.PLAIN, 20));
        b9.setFont(new Font("Arial", Font.PLAIN, 20));
        b10.setFont(new Font("Arial", Font.PLAIN, 20));
        b11.setFont(new Font("Arial", Font.PLAIN, 20));
        b16.setFont(new Font("Arial", Font.PLAIN, 20));
        b16.setForeground (Color.white);
        b16.setFont(new Font("Arial", Font.PLAIN, 20));
        b18.setBackground(Color.yellow);
        b18.setFont(new Font("Arial", Font.PLAIN, 20));
        b19.setFont(new Font("Arial", Font.PLAIN, 20));
        b20.setFont(new Font("Arial", Font.PLAIN, 17));
        b20.setForeground (Color.white);
        b21.setFont(new Font("Arial", Font.PLAIN, 17));
        b21.setForeground (Color.white);
        b22.setFont(new Font("Arial", Font.PLAIN, 17));
        b22.setForeground (Color.white);
        b23.setFont(new Font("Arial", Font.PLAIN, 17));
        b23.setForeground (Color.white);
        //b12.setForeground (Color.white);
        setSize(400,370);
        setLocationRelativeTo(null);
        Font font = new Font("Courier", Font.BOLD,14);
        text1.setFont(font);
        setLayout(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
        {
            String s1=text1.getText();
            text1.setText(s1+"1");
        }
        if(e.getSource()==b2)
        {
             String s1=text1.getText();
             text1.setText(s1+"2");
        }
        if(e.getSource()==b3)
        {
             String s1=text1.getText();
             text1.setText(s1+"3");
        }
        if(e.getSource()==b4)
        {
             String s1=text1.getText();
             text1.setText(s1+"4");
        }
        if(e.getSource()==b5)
        {
             String s1=text1.getText();
             text1.setText(s1+"5");
        }
        if(e.getSource()==b6)
        {
             String s1=text1.getText();
             text1.setText(s1+"6");
        }
        if(e.getSource()==b7)
        {
             String s1=text1.getText();
             text1.setText(s1+"7");
        }
        if(e.getSource()==b8)
        {
             String s1=text1.getText();
             text1.setText(s1+"8");
        }
        if(e.getSource()==b9)
        {
             String s1=text1.getText();
             text1.setText(s1+"9");
        }
        if(e.getSource()==b10)
        {
             String s1=text1.getText();
             text1.setText(s1+"0");
        }
         if(e.getSource()==b11)
        {
             String s1=text1.getText();
             text1.setText(s1+".");
        }
        if(e.getSource()==b16)
        {
             String s1=text1.getText();
             text1.setText("");
        }
        if(e.getSource()==b15)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=1;
            text1.setText("");
             }
        }
        if(e.getSource()==b18)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=2;
            text1.setText("");
             }
        }
        if(e.getSource()==b19)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=3;
            text1.setText("");
             }
        }
        if(e.getSource()==b14)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=4;
            text1.setText("");
             }
        }
        
        if(e.getSource()==b23)
        {
              if (text1.getText().equals("")) {
				text1.setText("");
              }
            else{
            String s1=text1.getText();
            a = Math.log(Double.parseDouble(text1.getText()));
				
				text1.setText(text1.getText() + a);
              }
        }
        if(e.getSource()==b14)
        {
              if (text1.getText().equals("")) {
				text1.setText("");
              }
            else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=5;
            text1.setText("");
              }
        }

        if(e.getSource()==b13)
        {
              if (text1.getText().equals("")) {
				text1.setText("");
              }
            else{
            String s1=text1.getText();
            a=Double.parseDouble(text1.getText());
            flg=6;
            text1.setText("");
              }
        }
        if(e.getSource()==b17)
        {
            
            String s1=text1.getText();
            text1.setText("3.1416");
            
        }
         if(e.getSource()==b20)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            a = Math.sin(Double.parseDouble(text1.getText()));
				text1.setText("");
				text1.setText(text1.getText() + a);
             }
        }
        if(e.getSource()==b21)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }
             else{
            a = Math.cos(Double.parseDouble(text1.getText()));
				text1.setText("");
				text1.setText(text1.getText() + a);}
        } 
        if(e.getSource()==b22)
        {
             if (text1.getText().equals("")) {
				text1.setText("");
              }else{
            a = Math.tan(Double.parseDouble(text1.getText()));
				text1.setText("");
				text1.setText(text1.getText() + a);
             }
        } 
        
        if(e.getSource()==b12)
        {
              if (text1.getText().equals("")) {
				text1.setText("");
              }
              else{
              if(flg==1)
              {            
                b = Double.parseDouble(text1.getText());
                double k = a + b;
                text1.setText(Double.toString(k));
              }
              else if(flg==2)
              {            
                b = Double.parseDouble(text1.getText());
                double k = a - b;
                text1.setText(Double.toString(k));
              }
              else if(flg==3)
              {
                b = Double.parseDouble(text1.getText());
                double k = pow(a,b);
                text1.setText(Double.toString(k));
              }
              else if(flg==4)
              {
                b = Double.parseDouble(text1.getText());
                double k = a/b;
                text1.setText(Double.toString(k));
              }
              else if(flg==5)
              {
                b = Double.parseDouble(text1.getText());
                double k = a/b;
                text1.setText(Double.toString(k));
              }
              else if(flg==6)
              {
                b = Double.parseDouble(text1.getText());
                double k = a*b;
                text1.setText(Double.toString(k));
              }
              else if(flg==7)
              {
                b = Double.parseDouble(text1.getText());
                double d= Math.sqrt(b);
                text1.setText(Double.toString(b));
              }
              }
        }
        
    }
    public static void main(String[] args) {
        new Calculator();
    }
    
}

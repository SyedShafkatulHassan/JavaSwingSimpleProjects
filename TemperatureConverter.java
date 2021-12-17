package temperature.converter;
/**
 *
 * @author Shafkat
 */
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class TemperatureConverter extends JFrame implements ActionListener{
    private JTextField text1,text2,text3;
    private JButton b1,b2,b3;
    private JLabel l1,l2,l3;
    TemperatureConverter()
    {
        l1= new JLabel("         Temperature Converter ");
        l1.setBounds(150,0,200,50);
        add(l1);
        text1=new JTextField();
        text1.setBounds(150,50,200,50);
        add(text1);
        l2=new JLabel("  celsius");
        l2.setBounds(100,50,100,50);
        add(l2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        text2=new JTextField();
        text2.setBounds(150,125,200,50);
        add(text2);
        l2=new JLabel("  Fahrenheit");
        l2.setBounds(81,125,100,50);
        add(l2);
        b1=new JButton("Coveet to celsius");
        b2=new JButton("Convert to Fahrenheit");
        b1.setBounds(150,200,200,50);
        b2.setBounds(150,275,200,50);
        add(b2);
        add(b1);
        text3=new JTextField();
        text3.setBounds(50,375,400,50);
        text3.setEditable(false);   
        add(text3);
        setSize(500,500);
        b1.addActionListener(this);
        b2.addActionListener(this); 
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TemperatureConverter();
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            //int a=Integer.parseInt(s1);
            if(text1.getText()!=("") && text2.getText().equals(""))
            {
                String s1=text1.getText();
                 float c = Float.parseFloat(s1);
                String result=String.valueOf(c);  
                text3.setText(result);
            }
            else if(text2.getText()!=("") && text1.getText().equals(""))
            {
                String s1=text2.getText();
                float d = Float.parseFloat(s1);
                float c=(5*(d-32)/9);
                String result=String.valueOf(c);  
                text3.setText(result);
            }
            else
            {
                  text3.setText("Sorry you have entered both celcius and Fahrenheit please enter one");
            }
        }else if(e.getSource()==b2){  
            if(text1.getText()!=("") && text2.getText().equals(""))
            {
                String s1=text1.getText();
                float d = Float.parseFloat(s1);
                float c=((9*d)/5)+32;
                String result=String.valueOf(c);  
                text3.setText(result);
            }
            else if(text2.getText()!=("") && text1.getText().equals(""))
            {
                String s1=text2.getText();
                float c = Float.parseFloat(s1);
                String result=String.valueOf(c);  
                text3.setText(result);
            }
            else
            {
                  text3.setText("Sorry you have entered both celcius and Fahrenheit please enter one");
            }
        }
    }
}

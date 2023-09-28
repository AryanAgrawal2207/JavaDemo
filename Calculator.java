import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener
{
    
    
Button b1,b2;
TextField tf1,tf2,tf3;
    Calculator()
    {
        Frame f = new Frame("Matta ADDS");
        f.setLayout(null);
      b1 = new Button("Add"); 
        b1.addActionListener(this);
        b2 = new Button("Reset");
        b2.addActionListener(this);
        Label l1=new Label("Enter No.1");
        Label l2=new Label("Enter No.2");
        tf1 = new TextField();
      tf2 = new TextField();
         tf3 = new TextField(); 
        f.add(tf1);
        f.add(tf2);
        f.add(tf3); 
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(l2);
        l1.setBounds(75,100,50,40);
        tf1.setBounds(140,100,50,40);
        l2.setBounds(75,175,50,40);
        tf2.setBounds(140,175,50,40);
        tf3.setBounds(110,250,50,40);
        b1.setBounds(75,325,50,40);
        b2.setBounds(140,325,50,40);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        
if(e.getSource()==b1)
        {
           
               String s1=tf1.getText();
                String s2=tf2.getText();
               int n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf3.setText(String.valueOf(n));
            
        }
        if(e.getSource()==b2)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText(""); 
        }
    
}

 public static void main(String[] args)
    {
        Calculator v = new Calculator();
    }
}    

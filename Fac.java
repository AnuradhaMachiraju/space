import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Fac implements ActionListener
{
  int n=5;
  JFrame f;
  JButton b;
  JTextField t1,t2;
  Fac()
  {
   f=new JFrame();
   t1=new JTextField();
   t1.setBounds(50,50,280,30);
   t1.setText("5");
   b=new JButton("compute");
   b.setBounds(180,170,50,40);
   f.add(b);
   f.setSize(900,800);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
   if(e.getSource()==b)
   {
    int fact=1;
    for(int i=0;i<n;i++)
    {
     fact=fact*n;
    }
    t2=new JTextField();
    t2.setText("120");
    t2.setBounds(60,60,20,40);
   }
  }
  public static void main(String args[])
  {
   new Fac();
  }
}
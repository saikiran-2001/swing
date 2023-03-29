import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
class taxCal extends JFrame implements ActionListener
{

			JTextField t1=new JTextField(10);
			JTextField t2=new JTextField(10);
			JTextField t3=new JTextField(10);
			JTextField t4=new JTextField(10);

			JLabel l1=new JLabel("Laptop cost");
			JLabel l2=new JLabel("CGST");
			JLabel l3=new JLabel("SGST");
			JLabel l4=new JLabel("Total");
			JButton b=new JButton("Submit");
	public void createWindow()
		{
			getContentPane().setBackground(Color.yellow);
			setTitle("Tax calculator");
			setSize(200,400);
			setLayout(new FlowLayout());
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(l3);
			add(t3);
			add(b);
			add(l4);
			add(t4);
	  		b.addActionListener(this);
			setLayout(new FlowLayout());		
			setVisible(true);
		}
			public static void main(String[] args)
				{
					taxCal obj=new taxCal();
					obj.createWindow();
				}
	public void actionPerformed(ActionEvent e)
		{
 			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int num3=Integer.parseInt(t3.getText());
   			int tax1=num1*num2/100;
			int tax2=num1*num3/100;
   			int total=num1+tax1+tax2;
  			t4.setText(String.valueOf(total));
		}
}

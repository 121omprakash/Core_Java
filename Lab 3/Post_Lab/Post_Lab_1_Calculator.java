import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Post_Lab_1_Calculator
{
	public static void main(String [] Main)
	{
		System.out.println("Calculator Executed");
		MyFrame f = new MyFrame();
	
	}
}




//User defined Myframe class
class MyFrame extends Frame implements ActionListener {
	Label l1, l2, l3,l4;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	MyFrame()
	{
		this.setTitle("Calculator");;
		this.setBackground(Color.darkGray);
		this.setSize(350,500);
		this.setVisible(true);
		this.setLayout(new FlowLayout());    
		
		l1 = new Label("Enter the first number: ");
		l2 = new Label("Entetr the second number: ");
		l3 = new Label("Result");
		l4 = new Label("Operator");
		//Textfield//
		t1 = new TextField();
        t1.setBounds(50, 50, 150, 20);  
        t2 = new TextField();
		t2.setBounds(49, 49, 150, 20);
		t3 = new TextField();
		t3.setBounds(48, 48, 150, 20);
		//Buttons://
		b1 = new Button("+");
		b1.setBounds(47, 47, 150, 20);
		b2 = new Button("-");
		b2.setBounds(46, 46, 150, 20);
		b3 = new Button("X");
		b3.setBounds(45, 45, 150, 20);
		b4 = new Button("%");
		b4.setBounds(44, 44, 150, 20);
		b5 = new Button("/");
		b5.setBounds(43, 43, 150, 20);
		
		this.add(l1);
		this.add(t1);
		
		this.add(l2);
		this.add(t2);
		this.add(l4);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		this.add(l3);
		this.add(t3);
		
		
		
		//ActionListner()
        b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		double a = Double.parseDouble(t1.getText());
		double b = Double.parseDouble(t2.getText());
		double res = 0;
		if(e.getSource()==b1)
		{
			res = a+b;
			t3.setBackground(Color.GREEN);
		}
		else if(e.getSource() == b2)
		{
			res = a-b;
			t3.setBackground(Color.GREEN);
		}
		else if(e.getSource() == b3)
		{
			res = a*b;
			t3.setBackground(Color.GREEN);
		}
		else if(e.getSource() == b4)
		{
			res = a%b;
			t3.setBackground(Color.GREEN);
		}
		else if(e.getSource() == b5)
		{
			if(b!=0)
			{
				res = a/b;
				t3.setBackground(Color.GREEN);
			}
			else
			{
				t3.setBackground(Color.RED);
				t3.setText("Cannot Divided by zero");
			}
			
		}
		t3.setText(String.valueOf(res));
	}
    

	
}

//e.getActionCommand() -> return the value of container(button) such as +,-  


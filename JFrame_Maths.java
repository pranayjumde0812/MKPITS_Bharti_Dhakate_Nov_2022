import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JFrame_Maths implements ActionListener
{
	JFrame f;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4;
	JPanel p1,p2,p3,p4;

	JFrame_Maths()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		f=new JFrame("Basic Calculator");
		Container c=f.getContentPane();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Font font= new Font("Courier", Font.BOLD, 18);

		l1=new JLabel("Enter 1st number :");
		l2=new JLabel("Enter 2nd number :");
		l3=new JLabel("Result :");
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b1=new JButton("ADD");
		b2=new JButton("SUB");
		b3=new JButton("DIV");
		b4=new JButton("MUL");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();

		p1.setLayout(new FlowLayout(FlowLayout.CENTER,50,1));
		p1.add(l1);
		p1.add(t1);

		p2.setLayout(new FlowLayout(FlowLayout.CENTER,50,1));
		p2.add(l2);
		p2.add(t2);

		p3.setLayout(new FlowLayout(FlowLayout.CENTER,150,1));
		p3.add(l3);
		p3.add(t3);

		p4.setLayout(new FlowLayout(FlowLayout.CENTER,50,1));
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		p4.add(b4);

		c.setLayout(new GridLayout(4,1));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		f.setSize(500,500);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new JFrame_Maths();
	}


	public void actionPerformed(ActionEvent e)
	{

		int x=0,y=0;
		String s1=t1.getText();
		String s2=t2.getText();

		try
		{
			 x=Integer.parseInt(s1);
			 y=Integer.parseInt(s2);
		}
		catch(NumberFormatException d){
			System.out.println("Invalid Input");
		}

		if(e.getSource()==b1)
		{
			int z=x+y;
			String t=Integer.toString(z);
			t3.setText(t);
		}

		if(e.getSource()==b2)
		{
			int z=x-y;
			String t=Integer.toString(z);
			t3.setText(t);
		}

		if(e.getSource()==b3)
		{
			int z=x/y;
			String t=Integer.toString(z);
			t3.setText(t);
		}

		if(e.getSource()==b4)
		{
			int z=x*y;
			String t=Integer.toString(z);
			t3.setText(t);
		}

	}
}





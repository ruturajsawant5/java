package ii.factres;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class factAndRes extends JFrame implements ActionListener{
	JTextField num , res;
	JLabel Lnum,Lres;
	JButton result;
	public factAndRes() {
		// TODO Auto-generated constructor stub
		Lnum = new JLabel("Enter Number : ");
		num = new JTextField(10);
		Lres = new JLabel("Factorial    : ");
		res = new JTextField(10);
		result =new  JButton("RESULT");
		add(Lnum);
		add(num);
		add(Lres);
		add(res);
		add(result);
		result.addActionListener(this);
		setTitle("FACTORIAL FINDER");
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factAndRes f = new factAndRes(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(num.getText());
		long factorial = 1;
		for(int i =number;i>0;i--) {
			factorial*=i;
		}
		res.setText(Long.toString(factorial));
	}

}

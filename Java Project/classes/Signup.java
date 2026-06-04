package  classes;
import java.lang.*;
import exception.*;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;



public class Signup extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel hLabel, passLabel, imgLabel ,l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JPasswordField passPF;
	JButton b1, exitBtn;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont,myFont1;
	Homepage hp;

	public Signup(Homepage hp)
	{
		super("RASM Hospital Login Page");
		this.setSize(700, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.hp=hp;
		
		myFont = new Font("Cambria", Font.PLAIN, 22);
		myFont1 = new Font("Cambria", Font.PLAIN, 16);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel("   RASM Hospital  ");
		hLabel.setBounds(200, 10, 200, 50);
		hLabel.setForeground(Color.BLUE);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		l1 = new JLabel("Name : ");
		l1.setBounds(150, 110, 100, 50);
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(280, 115, 100, 30);
		panel.add(t1);
		
		passLabel = new JLabel("Set Password : ");
		passLabel.setBounds(150, 160, 100, 30);
		passLabel.setForeground(Color.BLACK);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(280, 165, 100, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);

		l2 = new JLabel("Mail : ");
		l2.setBounds(150, 210, 100, 50);
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(280, 215, 100, 30);
		panel.add(t2);

		l3 = new JLabel("Adress : ");
		l3.setBounds(150, 260, 100, 50);
		l3.setForeground(Color.BLACK);
		panel.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(280, 265, 100, 30);
		panel.add(t3);

		l4= new JLabel("Phone Number : ");
		l4.setBounds(150, 310, 100, 50);
		l4.setForeground(Color.BLACK);
		panel.add(l4);
		
		t4 = new JTextField();
		t4.setBounds(280, 315, 100, 30);
		panel.add(t4);
		
		b1 = new JButton("Submit");
		b1.setBounds(280, 400, 80, 30);
		b1.setBackground(Color.GREEN);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		
		exitBtn = new JButton("X");
		exitBtn.setBounds(600, 10, 50, 25);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		

		
		
		img = new ImageIcon("signup.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 700, 650);
		panel.add(imgLabel);
		
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.GREEN);
			b1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(b1.getText().equals(command))
		{
			
			
				JOptionPane.showMessageDialog( null," Signup Successful ");
			
			
			
			
			hp.setVisible(true);
			this.setVisible(false);}
			
         

		else if(exitBtn.getText().equals(command))
		{  
			hp.setVisible(true);
			this.setVisible(false);}
		 
		
		else
		{
			
		}
	}
	
	
	
	
	
	
	
	
}
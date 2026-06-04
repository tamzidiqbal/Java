package  classes;
import java.lang.*;
import exception.*;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;



public class Homepage extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel hLabel, imgLabel,mailLabel;
	JButton loginBtn, exitBtn , signupBtn,contactBtn;
	JPanel panel;
	Color myColor;
	Font myFont,f1;

	public Homepage()
	{
		super("Home page");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont = new Font("Cambria", Font.PLAIN, 22);
		f1 = new Font("Cambria", Font.PLAIN, 15);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel(" WELCOME TO  RASM HOSPITAL  ");
		hLabel.setBounds(200, 5, 600, 300);
		hLabel.setForeground(Color.BLACK);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		mailLabel = new JLabel(" rasm002@gmail.com");
		mailLabel.setBounds(100, 320,400,80);
		mailLabel.setForeground(Color.YELLOW);
		mailLabel.setFont(f1);
		panel.add(mailLabel);
		
		
		
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(140, 250, 80, 30);
		loginBtn.setBackground(Color.CYAN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exitBtn = new JButton("X");
		exitBtn.setBounds(700, 40, 50, 25);
		exitBtn.setBackground(Color.RED);
		exitBtn.setForeground(Color.BLACK);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);


	    signupBtn = new JButton("Signup");
		signupBtn.setBounds(360, 250, 80, 30);
		signupBtn.setBackground(Color.BLUE);
		signupBtn.addMouseListener(this);
		signupBtn.addActionListener(this);
		panel.add( signupBtn);

		contactBtn = new JButton("Contact US");
		contactBtn.setBounds(600, 350, 150, 30);
		contactBtn.setBackground(Color.BLUE);
		contactBtn.addMouseListener(this);
		contactBtn.addActionListener(this);
		panel.add( contactBtn);
		
		
		
		img = new ImageIcon("Hospital.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 800, 450);
		panel.add(imgLabel);
		
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == signupBtn)
		{
			signupBtn.setBackground(Color.BLACK);
			signupBtn.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == signupBtn)
		{
			signupBtn.setBackground(Color.BLUE);
			signupBtn.setForeground(Color.WHITE);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		
		if(loginBtn.getText().equals(command))
		{
			Login login = new Login( this);
			login.setVisible(true);
			this.setVisible(false);
			
			}	

		else if(signupBtn.getText().equals(command))
		{
			Signup sg = new Signup ( this);
			sg.setVisible(true);
			this.setVisible(false);
			
			}			

		else if(exitBtn.getText().equals(command))
		{  int choice=JOptionPane.showConfirmDialog(null,"Do you Really want to Quit","EXIT",JOptionPane.YES_NO_OPTION);


	      if(choice==JOptionPane.YES_OPTION)

			{System.exit(0);}
		 else{}
		}

	
		 
		
		else
		{
			
		}
	}
	
	
	
	
	
	
	
	
}
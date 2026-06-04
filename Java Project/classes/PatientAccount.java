package classes;
import java.lang. *;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;


public class PatientAccount extends JFrame implements ActionListener, MouseListener {

	 
	ImageIcon img;
	JLabel hLabel,l1,l2,l3,l4,l5,l6,patLabel, imgLabel ;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPasswordField passPF;
	JButton b1,b2,b3, backBtn,cb,mb,nb;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont,myFont1,myFont2;
	

	HospitalAccount account[]=new HospitalAccount[20];
	HospitalAccount acc;
	Patient pat;

	public PatientAccount (Patient pat)
	{
		super("Payment Section ");
		this.setSize(850, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pat=pat;
		
		
		
		
		myColor = new Color(210, 210, 210);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		myFont1 = new Font("Cambria", Font.PLAIN, 18);
		myFont2 = new Font("Cambria", Font.PLAIN, 16);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel(" RASM Hospital");
		hLabel.setBounds(300, 10, 300, 50);
		hLabel.setForeground(Color.WHITE);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		
		

		l1 = new JLabel(" Make Payment");
		l1.setBounds(50, 80, 150, 50);
		l1.setForeground(Color.WHITE);
		l1.setFont(myFont1);

		panel.add(l1);

		l2 = new JLabel("Patient Name : ");
		l2.setBounds(70, 150, 100, 50);
		l2.setForeground(Color.WHITE);
		panel.add(l2);
		
		
		t1 = new JTextField();
		t1.setBounds(240, 160, 100, 30);
		panel.add(t1);

		l3 = new JLabel("Account Number :");
		l3.setBounds(70, 200, 100, 50);
		l3.setForeground(Color.WHITE);
		panel.add(l3);

		t2 = new JTextField("");
		t2.setBounds(240, 210, 100, 30);
		panel.add(t2);
		
		
		
		
		cb = new JButton("CARD");
		cb.setBounds(465, 100, 150, 30);
		cb.setBackground(Color.GREEN);
		cb.setForeground(Color.WHITE);
		cb.addMouseListener(this);
		cb.addActionListener(this);
		panel.add(cb);
		
		mb = new JButton("MOBILE BANKING");
		mb.setBounds(465, 160, 150, 30);
		mb.setBackground(Color.BLUE);
		mb.setForeground(Color.WHITE);
		mb.addMouseListener(this);
		mb.addActionListener(this);
		panel.add(mb);
		
		nb = new JButton("ONLINE BANKING");
		nb.setBounds(465, 220, 150, 30);
		nb.setBackground(Color.GREEN);
		nb.setForeground(Color.WHITE);
		nb.addMouseListener(this);
		nb.addActionListener(this);
		panel.add(nb);

		
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(700, 450, 70, 30);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		img = new ImageIcon("a.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 850, 600);
		panel.add(imgLabel);
		
		this.add(panel);


	}

	
	
	 
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == cb)
		{
			cb.setBackground(Color.BLACK);
			cb.setForeground(Color.WHITE);
		}
		else if(me.getSource() == mb)
		{
			mb.setBackground(Color.BLACK);
			mb.setForeground(Color.WHITE);
		}

		else if(me.getSource() == nb)
		{
			nb.setBackground(Color.BLACK);
			nb.setForeground(Color.WHITE);
		}

		

		else if(me.getSource() == backBtn)
		{
			backBtn.setBackground(Color.BLACK);
			backBtn.setForeground(Color.WHITE);
		}

		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == cb)
		{
			cb.setBackground(Color.GREEN);
			cb.setForeground(Color.BLACK);
		}
         if(me.getSource() == mb)
		{
			mb.setBackground(Color.BLUE);
			mb.setForeground(Color.WHITE);
		}
		if(me.getSource() == nb)
		{
			nb.setBackground(Color.GREEN);
			nb.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == backBtn)
		{
			backBtn.setBackground(Color.RED);
			backBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
     @Override
	 public void actionPerformed(ActionEvent ae)
	{
		
		String command = ae.getActionCommand();
		String s1 = t1.getText();
			String s2 = t2.getText();
		
		if(cb.getText().equals(command))
		{
			
			
			
			if(s1.equals("Shihab") ||s1.equals("Rimon")||s1.equals("Maruf")
				&& s2.equals("1234")||s2.equals("123456"))
			{
				
			
			
			
			
			Payment pay = new Payment( this);
			pay.setVisible(true);
			this.setVisible(false);}
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null,"Unsuccesful operation!");
			
			
			}}
         if(mb.getText().equals(command))
		{
			
			
			
			if(s1.equals("Shihab") ||s1.equals("Rimon")||s1.equals("Maruf")
				&& s2.equals("1234")||s2.equals("2456"))
			{
				
			
			
			
			
			Payment pay = new Payment( this);
			pay.setVisible(true);
			this.setVisible(false);}
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null,"Unsuccesful operation!");
			
			
			}}
         

            if(ae.getSource() == backBtn)
		{  pat.setVisible(true);
			this.setVisible(false);
	      }

	      if(nb.getText().equals(command))
		{
			
			
			
			if(s1.equals("Shihab") ||s1.equals("Rimon")||s1.equals("Maruf")
				&& s2.equals("1234")||s2.equals("2456"))
			{
				
			
			
			
			
			Payment pay = new Payment( this);
			pay.setVisible(true);
			this.setVisible(false);}
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null,"Unsuccesful operation!");
			
			
			}}

		else
		{

		}

		}	

	}


	


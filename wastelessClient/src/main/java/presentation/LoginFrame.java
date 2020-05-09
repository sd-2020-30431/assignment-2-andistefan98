package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entities.User;
import requests.UserRequests;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class LoginFrame {

	private JFrame frmLogin;
	private JTextField userText;
	private JTextField passwordText;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 577, 428);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setLocationRelativeTo(null);
		//frmLogin.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 559, 381);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(156, 119, 101, 43);
		panel.add(lblUsername);
		
		userText = new JTextField();
		userText.setBounds(285, 130, 116, 22);
		panel.add(userText);
		userText.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(156, 156, 82, 38);
		panel.add(lblPassword);
		
		JLabel label = new JLabel("");
		label.setBounds(401, 16, 0, 0);
		panel.add(label);
		
		final JLabel lblEr = new JLabel("");
		lblEr.setBounds(166, 307, 213, 16);
		panel.add(lblEr);
		
		passwordText = new JTextField();
		passwordText.setBounds(285, 165, 116, 22);
		panel.add(passwordText);
		passwordText.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<User> allUsers = new ArrayList<User>();
				int ok=0;
				
				try {
					allUsers  = UserRequests.getAll();
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				User theUser = new User();
				
				if(allUsers!=null) {
					
					for(User usr : allUsers) {
						System.out.println(usr.getUsername());
					
						String inputUsername = "\"" + userText.getText()  + "\"";
						String inputPass = "\"" + passwordText.getText()  + "\"";
						System.out.println(inputUsername);
						if(usr.getUsername().equals(inputUsername))
						{ok=1;
						theUser.setId(usr.getId());
						theUser.setCaloric_goal(usr.getCaloric_goal());
						theUser.setUsername(usr.getUsername());
						System.out.println("AICIIII");
						continue;
						}
					}
				}
				
				if(ok==1) {
					MainFrame frm = new MainFrame(theUser);
					frm.setVisible(true);
					frmLogin.dispose();
				}
				else {
					lblEr.setText("Invalid credentials.");
				}
				
				/*if(userText.getText().equals("admin") && passwordText.getText().contentEquals("admin"));
				{
				MainFrame frm = new MainFrame();
				frm.setVisible(true);
				frmLogin.dispose();
			
				}*/
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(207, 231, 123, 25);
		panel.add(btnLogin);
		
		
	}

	public void setVisible(boolean b) {
		frmLogin.setVisible(b);
		
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Authentification  extends JFrame{

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification window = new Authentification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Authentification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(317, 182, 122, 20);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(203, 185, 77, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(203, 241, 77, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = usernameField.getText().toString();
				String password = passwordField.getText().toString();
				

				//username : MOUNA -- password : 123456789
				
				if(username.equals("MOUNA") && password.contentEquals("1234")) {
					
					JOptionPane.showMessageDialog(null,"Connexion réussite !!");
					Menu menu = new Menu();
					menu.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Connexion échoué !!");
	
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(245, 289, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblApplicationDeGestion = new JLabel("Application de gestion du cabinet dentaire :");
		lblApplicationDeGestion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApplicationDeGestion.setBounds(159, 110, 332, 33);
		frame.getContentPane().add(lblApplicationDeGestion);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 239, 122, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\agurr\\OneDrive\\Bureau\\bleu3.jpg"));
		lblNewLabel.setBounds(0, 0, 693, 385);
		frame.getContentPane().add(lblNewLabel);
	}
}

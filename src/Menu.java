import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Menu extends JFrame{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		setAlwaysOnTop(true);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\agurr\\OneDrive\\Bureau\\ajou.PNG"));
		btnNewButton.setBounds(67, 62, 140, 143);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\agurr\\OneDrive\\Bureau\\mm.PNG"));
		btnNewButton_1.setBounds(240, 62, 118, 143);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\agurr\\OneDrive\\Bureau\\su.PNG"));
		btnNewButton_2.setBounds(389, 62, 140, 143);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblGestionDesPatients = new JLabel("Gestion des patients :");
		lblGestionDesPatients.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGestionDesPatients.setBounds(226, 19, 255, 32);
		getContentPane().add(lblGestionDesPatients);
		
		JLabel lblAjouterPatient = new JLabel("Ajouter patient");
		lblAjouterPatient.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAjouterPatient.setBounds(77, 216, 105, 25);
		getContentPane().add(lblAjouterPatient);
		
		JLabel lblModifierPatient = new JLabel("Modifier patient");
		lblModifierPatient.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblModifierPatient.setBounds(250, 219, 105, 19);
		getContentPane().add(lblModifierPatient);
		
		JLabel lblSupprimerPatient = new JLabel("Supprimer patient");
		lblSupprimerPatient.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSupprimerPatient.setBounds(414, 216, 118, 25);
		getContentPane().add(lblSupprimerPatient);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\agurr\\OneDrive\\Bureau\\bleu1.jpg"));
		lblNewLabel.setBounds(0, 0, 611, 373);
		getContentPane().add(lblNewLabel);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

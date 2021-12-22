package GUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JPanel;

public class GUI {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 400, 320);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(170, 85, 96, 21);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(170, 144, 96, 21);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel account = new JLabel("\u5E33\u865F");
		account.setBounds(100, 85, 47, 15);
		frmLogin.getContentPane().add(account);
		
		JLabel password = new JLabel("\u5BC6\u78BC");
		password.setBounds(100, 144, 47, 15);
		frmLogin.getContentPane().add(password);
		

		JButton btnNewButton = new JButton("\u767B\u9304");
		btnNewButton.setBounds(142, 212, 100, 23);
		frmLogin.getContentPane().add(btnNewButton);
		
		LoginListener A = new LoginListener(frmLogin,textField,textField_1);
		btnNewButton.addActionListener(A);
		
	}
}

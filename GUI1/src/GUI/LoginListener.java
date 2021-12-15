package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginListener implements ActionListener{
	private javax.swing.JTextField textField;
	private javax.swing.JPasswordField textField_1;
	private javax.swing.JFrame frame;
	
	
	public LoginListener(javax.swing.JFrame frame,javax.swing.JTextField textField,javax.swing.JPasswordField textField_1)
	{//獲取登入介面、賬號密碼輸入框物件
		this.frame=frame;
		this.textField=textField;
		this.textField_1=textField_1;
	
	}

	public void actionPerformed(ActionEvent e) {
		//建立新頁面
		javax.swing.JFrame loginAfter = new javax.swing.JFrame();
		loginAfter.setBounds(100, 100, 450, 300);
		loginAfter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginAfter.getContentPane().setLayout(null);
	
		
		String input = textField.getText();
		char[] password = textField_1.getPassword();  
		String password2 = new String(password);
		
		
		if(!input.equals("") && !password2.equals("")){
			
		JLabel message = new JLabel("登 錄 成 功");
		message.setFont(new java.awt.Font("Dialog", 1, 17));
		message.setBounds(101, 30, 100, 60);
		loginAfter.getContentPane().add(message);
		
		JLabel message2 = new JLabel(input);
		message2.setFont(new java.awt.Font("Dialog", 1, 17));
		message2.setBounds(101, 100, 60, 60);
		loginAfter.getContentPane().add(message2);
		
		JLabel message3 = new JLabel(password2);
		message3.setFont(new java.awt.Font("Dialog", 1, 17));
		message3.setBounds(101, 150, 60, 60);
		loginAfter.getContentPane().add(message3);
		
		
		/**loginAfter.add(message);
		loginAfter.add(message2);
		loginAfter.add(message3);*/
		
		loginAfter.setVisible(true);
		frame.dispose();
		}
		
	
	}
}
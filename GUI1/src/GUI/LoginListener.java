package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
		JFrame frmKytues = new JFrame();
		frmKytues.getContentPane().setBackground(new Color(240, 240, 240));
		frmKytues.setTitle("kytues");
		frmKytues.setBounds(100, 100, 450, 700);
		frmKytues.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKytues.getContentPane().setLayout(null);
		
		String input = textField.getText();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(2, 4, 150,659);
		//panel.setLayout(null);
		frmKytues.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton_2_1 = new JButton("\u500B\u4EBA\u8CC7\u8A0A");
		btnNewButton_2_1.setBounds(25, 5, 105, 23);
		btnNewButton_2_1.setBackground(Color.ORANGE);
		panel.add(btnNewButton_2_1);
		
		
		JButton btnNewButton_2 = new JButton("\u5E33\u865F\u7BA1\u7406");
		btnNewButton_2.setBounds(25, 38, 105, 23);
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		panel.add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("\u81EA\u6211\u6E2C\u9A57");
		btnNewButton_3.setBounds(25, 71, 105, 23);
		btnNewButton_3.setBackground(Color.ORANGE);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("\u7FA4\u7D44\u7BA1\u7406");
		btnNewButton_1.setBounds(25, 104, 105, 23);
		btnNewButton_1.setBackground(Color.ORANGE);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(25, 137, 105, 23);
		btnNewButton_5.setBackground(Color.ORANGE);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("\u767B\u51FA");
		btnNewButton_4.setBounds(25, 613, 105, 23);
		btnNewButton_4.setBackground(Color.ORANGE);
	
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("歡迎，"+input);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(179, 6, 1065, 31);
		frmKytues.getContentPane().add(lblNewLabel);
		
		
		
		
		frmKytues.setVisible(true);
		frame.dispose();
		
		
	
	}
}
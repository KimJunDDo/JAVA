package example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Test05 extends JFrame{
	private JTextField inputA, inputB;
	private JButton goBtn;
	private JTextArea result;
	
	public Test05() {
		setSize(160, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
		add(new JLabel("입력 A: "));
		inputA = new JTextField(10);
		add(inputA);
		add(new JLabel("입력 B: "));
		inputB = new JTextField(10);
		add(inputB);
		goBtn = new JButton("Go");
		add(goBtn);
		result = new JTextArea(5, 20);
		result.setEditable(false);
		add(result);
		
		goBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "";
				String text2 = inputA.getText().trim() + inputB.getText().trim();
				
				int length = text2.length();

				for (int i = 0; i < length; i++) {
				    if (i < inputA.getText().trim().length())
				        text += inputA.getText().trim().charAt(i);
				    if (i < inputB.getText().trim().length())
				        text += inputB.getText().trim().charAt(i);
				}
				
				result.setText(text);
			}
		});
	} 
}

public class exam2 {
	public static void main(String[] args) {
		new Test05().setVisible(true);
	}
}

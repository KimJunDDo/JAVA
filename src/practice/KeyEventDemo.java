package practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame {
	
	private String message="";
	
	public KeyEventDemo() {
		setSize(300, 200);
		setTitle("KeyEvent Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextField field = new JTextField(10);
		JTextArea area = new JTextArea(5, 20);
		area.setEditable(false);
		JButton button = new JButton("Reset");
		
		field.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				message += "KeyPressed: code=" + e.getKeyCode() + "\n";
				area.setText(message);
 			}
			@Override
			public void keyTyped(KeyEvent e) {
				message += "KeyTyped: char=" + e.getKeyChar() + "\n";
				area.setText(message);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				message += "KeyReleased: code=" + e.getKeyCode() + "\n";
				area.setText(message);
			}
		});
	
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				message = "";
				area.setText("");
				field.setText("");
			}
		});
		
		setLayout(new FlowLayout());
		add(field);
		add(button);
		add(area);
	}
		
	public static void main(String[] args) {
		(new KeyEventDemo()).setVisible(true);
	}
}

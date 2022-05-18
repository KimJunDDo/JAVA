package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboboxColor extends JFrame {
	private JComboBox red, blue, green;
	private int intred, intgreen,intblue;
	String[] color = {"0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100",
			"110", "120", "130", "140", "150", "160", "170", "180", "190", "200",
			"210", "220", "230", "240", "250", "255"};
	public ComboboxColor() {
		setSize(350, 320);
		setTitle("Combobox Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel labelred = new JLabel("Red");
		red = new JComboBox(color);
		JLabel labelgreen = new JLabel("Green");
		green = new JComboBox(color);;
		JLabel labelblue = new JLabel("Blue");
		blue = new JComboBox(color);
		
		JPanel panel = new JPanel();
		panel.add(labelred);
		panel.add(red);
		panel.add(labelgreen);
		panel.add(green);
		panel.add(labelblue);
		panel.add(blue);
		red.addItemListener(new ItemChangeListener());
		green.addItemListener(new ItemChangeListener());
		blue.addItemListener(new ItemChangeListener());
		
		Container cPane = getContentPane();
		cPane.setLayout(new BorderLayout());
		cPane.add(panel);
	}
	
	class ItemChangeListener implements ItemListener{
	    @Override
	    public void itemStateChanged(ItemEvent e) {
	    	if (e.getStateChange() == ItemEvent.SELECTED) {
	    	  String strred = red.getSelectedItem().toString();
	    	  intred = Integer.parseInt(strred);
	    	  String strgreen = green.getSelectedItem().toString();
	    	  intgreen = Integer.parseInt(strgreen);
	    	  String strblue = blue.getSelectedItem().toString();
	    	  intblue = Integer.parseInt(strblue);
	    	  repaint();
	    	}
	    }
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(intred, intgreen, intblue));
		g.fillOval(70, 80, 200, 200);
	}
	
	public static void main(String[] args) {
		(new ComboboxColor()).setVisible(true);
	}
}

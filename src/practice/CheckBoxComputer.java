package practice;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxComputer extends JFrame {
	private JCheckBox CPU, Mainboard, HDD, RAM, Monitor;
	private JLabel sumLabel;
	int sum = 0;
	
	public CheckBoxComputer() {
		setSize(200, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CPU = new JCheckBox("CPU             220000원");
		Mainboard = new JCheckBox("메인보드     180000원");
		HDD = new JCheckBox("HDD             80000원");
		RAM = new JCheckBox("RAM             60000원");
		Monitor = new JCheckBox("모니터        160000원");
		
		Container cPane = getContentPane();
		setLayout(null);
		cPane.add(CPU);
		CPU.setBounds(10, 10, 300, 15);
		cPane.add(Mainboard);
		Mainboard.setBounds(10, 40, 300, 15);
		cPane.add(HDD);
		HDD.setBounds(10, 70, 300, 15);
		cPane.add(RAM);
		RAM.setBounds(10, 100, 300, 15);
		cPane.add(Monitor);
		Monitor.setBounds(10, 130, 300, 15);
		
		CheckBoxListener listener = new CheckBoxListener();
		CPU.addItemListener(listener);
		Mainboard.addItemListener(listener);
		HDD.addItemListener(listener);
		RAM.addItemListener(listener);
		Monitor.addItemListener(listener);
		
		sumLabel = new JLabel("합계 = 0원");
		sumLabel.setFont(sumLabel.getFont().deriveFont(20.0f));
		cPane.add(sumLabel);
		sumLabel.setBounds(10, 150, 300, 50);
		setVisible(true);
	}
	
	private class CheckBoxListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			String item = ((JCheckBox)e.getItem()).getText();
			if (e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if (e.getItem() == CPU)
				sum = sum + selected*220000;
			else if (e.getItem() == Mainboard)
				sum = sum + selected*180000;
			else if (e.getItem() == HDD)
				sum = sum + selected*80000;
			else if (e.getItem() == RAM)
				sum = sum + selected*60000;
			else
				sum = sum + selected*160000;
			
			sumLabel.setText("합계 ="+sum+"원");	
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxComputer();
	}
}

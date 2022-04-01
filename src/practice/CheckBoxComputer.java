package practice;

import java.awt.Container;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxComputer extends JFrame {
	private JCheckBox CPU, Mainboard, HDD, RAM, Monitor;
	private JLabel sumLabel;
	
	public CheckBoxComputer() {
		setSize(200, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CPU = new JCheckBox("CPU             220000원");
		Mainboard = new JCheckBox("메인보드     180000원");
		HDD = new JCheckBox("HDD             80000원");
		RAM = new JCheckBox("RAM             60000원");
		Monitor = new JCheckBox("모니터        160000원");
		
		Container cPane = getContentPane();
		setLayout(null);
		cPane.add(CPU);
		CPU.setBounds(10, 10, 300, 50);
		cPane.add(Mainboard);
		Mainboard.setBounds(10, 60, 300, 50);
		cPane.add(HDD);
		HDD.setBounds(10, 110, 300, 50);
		cPane.add(RAM);
		RAM.setBounds(10, 160, 300, 50);
		cPane.add(Monitor);
		Monitor.setBounds(10, 210, 300, 50);
		
		MyComputerListener listener = new MyComputerListener();
		
		
		sumLabel = new JLabel("합계 = 0원");
		sumLabel.setFont(sumLabel.getFont().deriveFont(20.0f));
		cPane.add(sumLabel);
		sumLabel.setBounds(10, 260, 300, 50);
		setVisible(true);
	}
	
	@Override
	class MyCoumputerListener implements ItemListener {
		private int sum = 0;
		int CCheck = CPU.isSelected() ? 1 : 0;		
		int MainCheck = Mainboard.isSelected() ? 1 : 0;		
		int HCheck = HDD.isSelected() ? 1 : 0;		
		int RCheck = RAM.isSelected() ? 1 : 0;		
		int MCheck = Monitor.isSelected() ? 1 : 0;		
			
}
	
	public static void main(String[] args) {
		new CheckBoxComputer();
	}
}

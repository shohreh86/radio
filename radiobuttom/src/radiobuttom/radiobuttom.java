package radiobuttom
;

import java.awt.EventQueue;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class radiobuttom {

	private JFrame Grid;
	private final ButtonGroup buttomGroup = new ButtonGroup();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radiobuttom window = new radiobuttom();
					window.Grid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public radiobuttom() {
		initialize();
	}


	private void initialize() {
		
		
		Grid = new JFrame();
		
		
		Grid.setBounds(200, 250, 450, 300);
		
		
		
		JPanel panel = new JPanel();
		
		
		panel.setBounds(131, 51, 109, 152);
		
		
		Grid.getContentPane().add(panel);
		
		
		panel.setLayout(null);
		
		
		
		JRadioButton radiobuttomNewRadioButton = new JRadioButton("S");
		
		
		buttomGroup.add(radiobuttomNewRadioButton);
		
		
		radiobuttomNewRadioButton.setBounds(0, 0, 120, 30);
		
		panel.add(radiobuttomNewRadioButton);
		
		
		radiobuttomNewRadioButton.setSelected(true);
		
		
		JRadioButton radiobuttomRadioButton = new JRadioButton("M");
		
		
		buttomGroup.add(radiobuttomRadioButton);
		
		
		radiobuttomRadioButton.setBounds(0, 60, 120,30);
		
		
		panel.add(radiobuttomRadioButton);
		
		
		
		JRadioButton radiobuttomRadioButton_1 = new JRadioButton("L");
		
		
		
		buttomGroup.add(radiobuttomRadioButton_1);
		
		
		radiobuttomRadioButton_1.setBounds(0, 129, 120, 30);
		
		
		panel.add(radiobuttomRadioButton_1);
	}
}
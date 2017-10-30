import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;


@SuppressWarnings("serial")
public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton optionA, optionB, btnAbout;
	private JLabel label1, label2, lblTeam;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 495);
		//setBounds(100, 100, 597, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("IT155 Final Project");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		
		label1 = new JLabel("WELCOME");
		label1.setForeground(Color.DARK_GRAY);
		label1.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(165, 24, 183, 36);
		contentPane.add(label1);
		
		label2 = new JLabel("PLEASE SELECT A CONVERSION :");
		label2.setForeground(Color.DARK_GRAY);
		label2.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(113, 71, 293, 29);
		contentPane.add(label2);
		
		optionA = new JButton("CONVERSION A");
		optionA.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		optionA.setBounds(60, 146, 144, 79);
		optionA.addActionListener(this);
		contentPane.add(optionA);
		
		optionB = new JButton("CONVERSION B");
		optionB.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		optionB.setBounds(297, 146, 155, 79);
		optionB.addActionListener(this);
		contentPane.add(optionB);
		
		btnAbout= new JButton("ABOUT");
		btnAbout.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		btnAbout.setBounds(178, 273, 144, 79);
		btnAbout.addActionListener(this);
		contentPane.add(btnAbout);
		
		lblTeam = new JLabel("Denise|CJ");
		lblTeam.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblTeam.setForeground(Color.DARK_GRAY);
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setBounds(217, 426, 85, 14);
		contentPane.add(lblTeam);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == optionA){
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				//new displayOptionA();
				displayOptionA display = new displayOptionA();
				display.setTitle("IT155 Final Project");
				display.setResizable(false);
				display.setVisible(true);
				dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(evt.getSource() == optionB){
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				//new displayOptionB();
				displayOptionB display = new displayOptionB();
				display.setTitle("IT155 Final Project");
				display.setResizable(false);
				display.setVisible(true);
				dispose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(evt.getSource() == btnAbout){
				try{
					displayAbout display = new displayAbout();
					display.setTitle("IT155 Final Project");
					display.setResizable(false);
					display.setVisible(true);
					dispose();
				}catch (Exception e){
					e.printStackTrace();
				}
		}
	}
}

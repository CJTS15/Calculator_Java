import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class displayAbout extends JFrame implements ActionListener{

		private JPanel contentPane;
		private JLabel lblTitle, lblTeam;
		private JTextArea a;
		private JButton btnback;
		
		
		/**
		 * Create the panel.
		 */
		public displayAbout() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 540, 495);
			//setBounds(100, 100, 528, 447);
			contentPane = new JPanel();
			contentPane.setBackground(Color.PINK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setVisible(true);
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			lblTitle = new JLabel("IT 155 Final Project");
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle.setForeground(Color.DARK_GRAY);
			lblTitle.setFont(new Font("Calibri Light", Font.BOLD, 20));
			lblTitle.setBounds(137, 11, 216, 37);
			contentPane.add(lblTitle);
			
			a = new JTextArea();
			a.setFont(new Font("Calibri Light", Font.PLAIN, 15));
			a.setForeground(Color.DARK_GRAY);
			a.setLineWrap(true);
			a.setText("                    A simple interface for conversion:\r\n\r\n\r\nI. Conversion between Decimal, Binary, Octal, and \r\nHexa\r\n\r\n\r\nII. Calculation for the word, bytes, and bits \r\ngiven n = address bits and m = word length.");
			a.setEditable(false);
			a.setBackground(Color.PINK);
			a.setBounds(25, 98, 477, 199);
			contentPane.add(a);
			
			btnback = new JButton("<< BACK");
			btnback.setFont(new Font("Calibri Light", Font.PLAIN, 15));
			btnback.setBounds(10, 422, 85, 23);
			btnback.addActionListener(this);
			contentPane.add(btnback);
			
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
			if(evt.getSource() == btnback){
				try {
					//new MainFrame();
					displayOptionA display = new displayOptionA();
					display.setVisible(false);
					MainFrame mf = new MainFrame();
					mf.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class displayOptionB extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField nField, mField;
	private JButton btnCompute, btnback, btnclear;
	private JLabel n, m;
	private JTextArea wordcapArea, bitscapArea, bytescapArea, wordadArea, bitsadArea, bytesadArea;
	private JLabel lblWord, lblBits, lblBytes, cap, ad, title;
	
	/**
	 * Create the frame.
	 */
	public displayOptionB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 495);
		//setBounds(100, 100, 530, 447);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nField = new JTextField();
		nField.setBounds(90, 62, 134, 30);
		nField.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		contentPane.add(nField);
		nField.setColumns(10);
		
		mField = new JTextField();
		mField.setBounds(334, 62, 135, 30);
		mField.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		contentPane.add(mField);
		mField.setColumns(10);
		
		btnCompute= new JButton("COMPUTE");
		btnCompute.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnCompute.setBounds(198, 115, 126, 23);
		btnCompute.addActionListener(this);
		contentPane.add(btnCompute);
		
		n = new JLabel("n =");
		n.setFont(new Font("Calibri", Font.BOLD, 17));
		n.setHorizontalAlignment(SwingConstants.CENTER);
		n.setForeground(Color.DARK_GRAY);
		n.setBounds(40, 69, 46, 14);
		contentPane.add(n);
		
		m = new JLabel("m =");
		m.setFont(new Font("Calibri", Font.BOLD, 17));
		m.setHorizontalAlignment(SwingConstants.CENTER);
		m.setForeground(Color.DARK_GRAY);
		m.setBounds(278, 75, 46, 14);
		contentPane.add(m);
		
		wordcapArea = new JTextArea();
		wordcapArea.setBounds(40, 167, 184, 30);
		wordcapArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		wordcapArea.setEditable(false);
		contentPane.add(wordcapArea);
		
		bitscapArea = new JTextArea();
		bitscapArea.setBounds(40, 303, 184, 30);
		bitscapArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		bitscapArea.setEditable(false);
		contentPane.add(bitscapArea);
		
		bytescapArea = new JTextArea();
		bytescapArea.setBounds(40, 236, 184, 31);
		bytescapArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		bytescapArea.setEditable(false);
		contentPane.add(bytescapArea);
		
		wordadArea = new JTextArea();
		wordadArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		wordadArea.setEditable(false);
		wordadArea.setBounds(285, 167, 184, 30);
		contentPane.add(wordadArea);
		
		bitsadArea= new JTextArea();
		bitsadArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		bitsadArea.setEditable(false);
		bitsadArea.setBounds(285, 303, 184, 30);
		contentPane.add(bitsadArea);
		
		bytesadArea = new JTextArea();
		bytesadArea.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		bytesadArea.setEditable(false);
		bytesadArea.setBounds(285, 236, 184, 30);
		contentPane.add(bytesadArea);
		
		lblWord = new JLabel("WORD");
		lblWord.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblWord.setForeground(Color.DARK_GRAY);
		lblWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblWord.setBounds(216, 207, 68, 14);
		contentPane.add(lblWord);
		
		lblBits = new JLabel("BITS");
		lblBits.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblBits.setForeground(Color.DARK_GRAY);
		lblBits.setHorizontalAlignment(SwingConstants.CENTER);
		lblBits.setBounds(216, 345, 68, 14);
		contentPane.add(lblBits);
		
		lblBytes = new JLabel("BYTES");
		lblBytes.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblBytes.setForeground(Color.DARK_GRAY);
		lblBytes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBytes.setBounds(216, 278, 68, 14);
		contentPane.add(lblBytes);
		
		title = new JLabel("WORDS, BITS, and BYTES CONVERSION");
		title.setFont(new Font("Calibri Light", Font.BOLD, 20));
		title.setForeground(Color.DARK_GRAY);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(40, 11, 429, 31);
		contentPane.add(title);

		cap = new JLabel("Capacity");
		cap.setForeground(Color.DARK_GRAY);
		cap.setFont(new Font("Calibri Light", Font.BOLD, 15));
		cap.setBounds(73, 142, 71, 14);
		contentPane.add(cap);
		
		ad = new JLabel("Address");
		ad.setForeground(Color.DARK_GRAY);
		ad.setFont(new Font("Calibri Light", Font.BOLD, 15));
		ad.setBounds(336, 142, 60, 14);
		contentPane.add(ad);

		btnclear = new JButton("CLEAR");
		btnclear.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnclear.setBounds(105, 422, 85, 23);
		btnclear.addActionListener(this);
		contentPane.add(btnclear);
		
		btnback = new JButton("<< BACK");
		btnback.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnback.setBounds(10, 422, 85, 23);
		btnback.addActionListener(this);
		contentPane.add(btnback);
	}
	
	public void compute(){
		
		String n = nField.getText();
		String m = mField.getText();
		
		int n1 = Integer.parseInt(n);
		int m1 = Integer.parseInt(m);
		
		word(n1);
		bits(n1,m1);
		bytes(n1,m1);
	}
	//function that gets the word value
	public void word(int n){
		wordcapArea.setText("2^"+n+"="+n);
		wordadArea.setText(""+n);
	}
	//function that ges the bytes value
	public void bytes(int n, int m){
		double bytes = Math.log(m/8);
			
		int i = (int) bytes;
		if(i == 0){
			i = 1;
		}
		
		double power = n + i;
		
		int j = (int) power;
		bytescapArea.setText("2^"+n+"+2^"+i);
		bytesadArea.setText(""+j);
	}
	//function that gets the bits value
	public void bits(int n, int m){
		double bits = Math.log(m)/Math.log(2);
		double power = n + bits;
		int i = (int) bits;
		int j = (int) power;
		bitscapArea.setText("2^"+n+"+2^"+i);
		bitsadArea.setText(""+j);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == btnCompute){
			try{
				compute();
			}catch (Exception e){
				JOptionPane.showMessageDialog(null,e);
			}
		}else if(evt.getSource() == btnclear){
			try{
				wordadArea.setText("");
				bitsadArea.setText("");
				bytesadArea.setText("");
				wordcapArea.setText("");
				bitscapArea.setText("");
				bytescapArea.setText("");
				nField.setText("");
				mField.setText("");
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnback){
			try {
				//new MainFrame();
				displayOptionB display = new displayOptionB();
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

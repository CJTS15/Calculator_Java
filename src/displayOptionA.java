import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;



@SuppressWarnings("serial")
public class displayOptionA extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel dec, bin, oct, hex, title;
	private JTextField textField;
	private JTextArea decArea, binArea, octArea, hexArea;
	private JButton btnclear, btnback, btnbin, btndec, btnoct, btnhex;


	/**
	 * Create the frame.
	 */
	public displayOptionA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(87, 94, 362, 33);
		textField.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		contentPane.add(textField);
		textField.setColumns(10);
		
		decArea = new JTextArea();
		decArea.setWrapStyleWord(true);
		decArea.setLineWrap(true);
		decArea.setBounds(87, 160, 358, 32);
		decArea.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		decArea.setEditable(false);
		contentPane.add(decArea);
		
		binArea = new JTextArea();
		binArea.setWrapStyleWord(true);
		binArea.setLineWrap(true);
		binArea.setBounds(87, 228, 358, 32);
		binArea.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		binArea.setEditable(false);
		contentPane.add(binArea);
		
		octArea = new JTextArea();
		octArea.setWrapStyleWord(true);
		octArea.setLineWrap(true);
		octArea.setBounds(87, 292, 358, 32);
		octArea.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		octArea.setEditable(false);
		contentPane.add(octArea);
		
		hexArea = new JTextArea();
		hexArea.setWrapStyleWord(true);
		hexArea.setLineWrap(true);
		hexArea.setBounds(87, 359, 358, 32);
		hexArea.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		hexArea.setEditable(false);
		contentPane.add(hexArea);
		
		dec = new JLabel("DECIMAL");
		dec.setHorizontalAlignment(SwingConstants.CENTER);
		dec.setForeground(Color.DARK_GRAY);
		dec.setFont(new Font("Calibri Light", Font.BOLD, 15));
		dec.setBounds(203, 203, 119, 14);
		contentPane.add(dec);
		
		bin = new JLabel("BINARY");
		bin.setFont(new Font("Calibri Light", Font.BOLD, 15));
		bin.setForeground(Color.DARK_GRAY);
		bin.setHorizontalAlignment(SwingConstants.CENTER);
		bin.setBounds(203, 268, 119, 14);
		contentPane.add(bin);
		
		oct = new JLabel("OCTAL");
		oct.setFont(new Font("Calibri Light", Font.BOLD, 15));
		oct.setForeground(Color.DARK_GRAY);
		oct.setHorizontalAlignment(SwingConstants.CENTER);
		oct.setBounds(203, 335, 119, 20);
		contentPane.add(oct);
		
		hex = new JLabel("HEXADECIMAL");
		hex.setFont(new Font("Calibri Light", Font.BOLD, 15));
		hex.setForeground(Color.DARK_GRAY);
		hex.setHorizontalAlignment(SwingConstants.CENTER);
		hex.setBounds(203, 392, 133, 22);
		contentPane.add(hex);
		
		title = new JLabel("BINARY, OCTAL, and HEXA CONVERSION");
		title.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		title.setForeground(Color.DARK_GRAY);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(87, 11, 362, 31);
		contentPane.add(title);
		
		btnbin = new JButton("Binary");
		btnbin.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnbin.setBounds(71, 53, 89, 23);
		btnbin.addActionListener(this);
		contentPane.add(btnbin);
		
		btndec = new JButton("Decimal");
		btndec.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btndec.setBounds(170, 53, 89, 23);
		btndec.addActionListener(this);
		contentPane.add(btndec);
		
		btnoct= new JButton("Octal");
		btnoct.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnoct.setBounds(280, 53, 89, 23);
		btnoct.addActionListener(this);
		contentPane.add(btnoct);
		
		btnhex = new JButton("Hex");
		btnhex.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		btnhex.setBounds(379, 53, 89, 23);
		btnhex.addActionListener(this);
		contentPane.add(btnhex);
		

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
	//function that converts the input value to binary, octal, and hexadecimal
	public void convertDec(){
		String x = textField.getText();
		int y = Integer.parseInt(x,16);
		
		decArea.setText(String.valueOf(y));
		binArea.append(Integer.toBinaryString(y));
		octArea.append(Integer.toOctalString(y));
		hexArea.append(Integer.toHexString(y));		
	}
	public void convertBin(){
		String x = textField.getText();
		int y = Integer.parseInt(x,16);
		x = Integer.toBinaryString(y);
		
		decArea.setText(String.valueOf(y));
		binArea.setText(x);
		octArea.append(Integer.toOctalString(y));
		hexArea.append(Integer.toHexString(y));
	}
	public void convertOct(){
		String x = textField.getText();
		int y = Integer.parseInt(x,16);
		x = Integer.toOctalString(y);
		
		decArea.setText(String.valueOf(y));
		binArea.append(Integer.toBinaryString(y));
		octArea.setText(x);
		hexArea.append(Integer.toHexString(y));
	}
	public void convertHex(){
		String x = textField.getText();
		int y = Integer.parseInt(x,16);
		x = Integer.toHexString(y);
		
		decArea.setText(String.valueOf(y));
		binArea.append(Integer.toBinaryString(y));
		octArea.append(Integer.toOctalString(y));
		hexArea.setText(x);		
	}
	

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == btndec){
			try{
				decArea.setText("");
				binArea.setText("");
				octArea.setText("");
				hexArea.setText("");
				
				convertDec();
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnbin){
			try{
				decArea.setText("");
				binArea.setText("");
				octArea.setText("");
				hexArea.setText("");
				
				convertBin();
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnoct){
			try{
				decArea.setText("");
				binArea.setText("");
				octArea.setText("");
				hexArea.setText("");
				
				convertOct();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnhex){
			try{
				decArea.setText("");
				binArea.setText("");
				octArea.setText("");
				hexArea.setText("");
				
				convertHex();
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnclear){
			try{
				textField.setText("");
				decArea.setText("");
				binArea.setText("");
				octArea.setText("");
				hexArea.setText("");
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
			}
		}else if(evt.getSource() == btnback){
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

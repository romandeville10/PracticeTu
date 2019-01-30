import java.util.Scanner;

import javax.swing.JOptionPane;

public class cipher {

	private String alpha = "abcdefghijklmnopqrstuvwxyz012345679.: ";
	private String plainText = "";
	private String encodedtext = "";
	private int key = 0;
	Scanner kbd = new Scanner(System.in);
	private String answer;
	
	public cipher() {
		
	}
	
	public void getPlainText() {
		
		plainText = JOptionPane.showInputDialog("enter plain text");
		JOptionPane.showMessageDialog(null,"you have entered:" + plainText);
	}
	
	public void getKey() {
		
		int key = Integer.parseInt(JOptionPane.showInputDialog("enter shift key"));
		JOptionPane.showMessageDialog(null,"you have entered:" + key);
		
	}

	public String encrypt() {
		for (int i =0; i < plainText.length(); i++) {
			if(String.valueOf(plainText.charAt(i)).equals(" ")){
				encodedtext += " ";
			}
			else {
				encodedtext += alpha.charAt(
						(alpha.indexOf(String.valueOf
								(plainText.charAt(i)) .toLowerCase())
								+ key) % alpha.length());
								
				
			}
		
			
		}
		JOptionPane.showMessageDialog(null, "message:" + encodedtext);
		return(encodedtext);
		
	}
	
	public void getencodedText() {
		
		System.out.println("enter encoded text:");
		encodedtext = kbd.next();
		System.out.println("encrypted code:" + encodedtext);

	}
	
	public String decrypt() {
		for (int i =0; i < plainText.length(); i++) {
			if(String.valueOf(plainText.charAt(i)).equals(" ")){
				encodedtext += " ";
			}
			else {
				encodedtext += alpha.charAt(
						(alpha.indexOf(String.valueOf
								(plainText.charAt(i)) .toLowerCase())
								- key) % alpha.length());
				
			}
		
			
		}
		JOptionPane.showMessageDialog(null, "message:" + encodedtext);
		return(encodedtext);
		
	}
	public String getEncryptDecrypt() {
	while (true) {

		answer = JOptionPane.showInputDialog("encrypt or decrypt");
		answer = String.valueOf(answer.charAt(0)).toUpperCase();
		if(answer.equals("E") || answer.equals("D")) {
			break;
		} else {
			JOptionPane.showConfirmDialog(null,"I dont recognize that operator, please try again");
		}	
	}
	return answer;
	}
	
}

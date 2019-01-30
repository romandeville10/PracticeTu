import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		//main program
		cipher opencipher = new cipher();
		
		//ask if they want to encrypt or decrypt
		String crypt= opencipher.getEncryptDecrypt();
		JOptionPane.showConfirmDialog(null,"returned:" + crypt);
		        switch (crypt) {
		        	//encrypt
		            case "E":   
		            JOptionPane.showConfirmDialog(null,"you have chosen encrypt");
		            opencipher.getPlainText();
		    		opencipher.getKey();
		    		opencipher.encrypt();
		            
		            //decrypt
		            case "D":  
		            JOptionPane.showConfirmDialog(null,"you have chosen decrypt");
		            opencipher.getPlainText();
		    		opencipher.getKey();
		    		opencipher.decrypt();
		            break;
		        }
		
	}
}

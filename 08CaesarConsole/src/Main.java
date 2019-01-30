import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    	
    String end = "yes";
    
    while(end == "yes") {
    Caesar openCaesar=new Caesar();
    String crypt = openCaesar.getEncryptDecrypt();
    	if (crypt == "d") {
    		JOptionPane.showMessageDialog(null, "main, Choose: Decrypt");
    		openCaesar.getPlainText();
    		openCaesar.getKey();
    		openCaesar.decrypt();
    	}
    	if (crypt =="e") {
    		JOptionPane.showMessageDialog(null, "You Choose: Encrypt");
    		openCaesar.getPlainText();
        	openCaesar.getKey();
        	openCaesar.encrypt();
    	}
    	}
    } 
}
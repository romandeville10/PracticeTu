import javax.swing.JOptionPane;

public class Caesar {    
	
	private String alpha="zebracdfghijklmnopqstuvwxy0123456789.:";
    private String plainText="";
    private String encodedText="";
    private int key=0;
 
    private String answer="";
    public Caesar() {
    }
    public void getPlainText() {
        plainText=JOptionPane.showInputDialog("Plain text message:");
        
    }
    public void getKey() {
        key = Integer.parseInt(JOptionPane.showInputDialog("Enter the shift key:"));
        
    }
    public void encrypt() {
        
        for (int i=0; i<plainText.length(); i++) {
            if (!alpha.contains(String.valueOf(plainText.charAt(i)))){
                encodedText += " ";
            }
            else    encodedText+=alpha.charAt((alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase())+key)%alpha.length());
        
        }
        JOptionPane.showMessageDialog(null, encodedText);
    }
     public void decrypt() {
         
        for (int i=0; i<plainText.length(); i++) {
            if (!alpha.contains(String.valueOf(plainText.charAt(i)))){
            encodedText += " ";
            }
            else {
                encodedText+=alpha.charAt((alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase())+(38-key))%alpha.length());
            }
        }
        JOptionPane.showMessageDialog(null, encodedText);
    }
      public String getEncryptDecrypt() {
          answer = JOptionPane.showInputDialog("Do you want to encrypt or decrypt?");
          answer=String.valueOf(answer.charAt(0)).toUpperCase();
          if ( answer.equals ("D") || answer.equals("d")){
                  answer = "d";
                  return answer; 
          }
          else if (answer.equals("E")||answer.equals("e")) {
              answer = "e";
              return answer;
          }
          else JOptionPane.showMessageDialog(null, ""); 
              return getEncryptDecrypt();
        
    }
}
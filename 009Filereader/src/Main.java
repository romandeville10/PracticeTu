import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		String fileName = "/home/compsci/eclipse-workspace/textfiles/MyFriends.txt";
		
		
		try {
	FileReader fr = new FileReader("Kennedy_Cuba_Crisis.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String str;
	while ((str = br.readLine()) != null) {
		System.out.println(str+ "/n");
	}
	br.close();
			
		}catch (IOException e) {
			System.out.println("i o error: " + e);
		}
		

	}

}

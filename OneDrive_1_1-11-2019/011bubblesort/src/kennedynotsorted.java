import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class kennedynotsorted {

	public static void main(String a[]){
		String beta =  "25?[]3764890';1x:zj\"qk-.v,gbywpmfucldhrsoniate ";
		String fileName = "/home/compsci/eclipse-workspace/final/Kennedy_Cuba_Crisis.txt"; 
    	String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,':;\"?-[] ";
		int[] alphaCountSorted = new int[alpha.length()];
    	String line;
    	int[] alphaCount = new int[alpha.length()];	
    	ArrayList aList = new ArrayList();
    	try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			if (!input.ready()) {
				input.close();
				throw new IOException();
			}
			while ((line = input.readLine()) != null) {
				aList.add(line);
			}
			input.close();
		}catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		int sz = aList.size();
		//counts each text
		for (int i = 0; i < sz; i++) {
			for (int z = 0; z < aList.get(i).toString().length(); z++) {
				alphaCount[alpha.indexOf(String.valueOf((aList.get(i).toString()).charAt(z)).toLowerCase())] += 1;
			}
		}
		//prints encrypted text or normal
		for (int i = 0; i < alpha.length(); i++) {
			System.out.println(alpha.charAt(i) + ": " + alphaCount[i]);
		}
	}
}

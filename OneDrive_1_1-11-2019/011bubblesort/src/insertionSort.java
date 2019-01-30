import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class insertionSort {

	public int[] main(int[] list) {
		int i, j, key, temp;
		for(i = 1; i < list.length; i++) {
			key = list[i];
			j=i-1;
			while(j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
				j--;
			}
		}
		return list;
	}
	public static void main(String[] args0) {
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
		System.out.println("\n ______________________________________ \n \n");
		
		insertionSort mms = new insertionSort();
		alphaCountSorted = alphaCount;
		mms.main(alphaCountSorted);
		int x = alpha.length();
		while ( x > 0 ) {
			x-= 1;
			System.out.println(beta.charAt(x) + ": " + alphaCountSorted[x]);
		}
	}
}

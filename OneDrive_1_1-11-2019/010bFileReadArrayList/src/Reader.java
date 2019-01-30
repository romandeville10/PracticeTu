import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	private static int[] array;
    private static int[] tempMergArr;
    private static int length;
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,':;\"?-[] ";
		String beta =  "25?[]3764890';1x:zj\"qk-.v,gbywpmfucldhrsoniate ";
		String fileName = "/home/compsci/eclipse-workspace/final/Kennedy_Cuba_Crisis.txt";
		int[] alphaCount = new int[alpha.length()];

		// ** insert sort ArrayList
		ArrayList<Integer> alphaCountSorted = new ArrayList();
		String line;
		ArrayList aList = new ArrayList();
		for (int a = 0; a < alpha.length(); a++) {
			alphaCount[a] = 0;
		}
		
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
			for (int a = 0; a < aList.get(i).toString().length(); a++) {
				alphaCount[alpha.indexOf(String.valueOf((aList.get(i).toString()).charAt(a)).toLowerCase())] += 1;
			}
		}
		//prints encrypted text or normal
		for (int i = 0; i < alpha.length(); i++) {
			System.out.println(alpha.charAt(i) + ": " + alphaCount[i]);
		}
		System.out.println("\n ______________________________________ \n \n");
		alphaCountSorted = insertionSort(alphaCountSorted);
		
		
		//Array list insert sort
		
		for (int a = 0; a < alpha.length(); a++) {
			alphaCountSorted.add(alphaCount[a]);
		}
		alphaCountSorted = insertionSort(alphaCountSorted);
		for (int i = 0; i < alphaCountSorted.size(); i++) {
			System.out.println(beta.charAt(i) + ": " + alphaCountSorted.get(i));
		}
		
		
		
	} //end of main
	public static int[] bubbleSort (int[] list) {
		int i,j,temp = 0;
		for (i = 0; i<list.length - 1; i++) {
			for(j=0;j< list.length - 1; j++) {
				if(list[j]>list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
		return list;
	}
	
	private static ArrayList<Integer>insertionSort(ArrayList<Integer> list) {
		int i, j, key, temp;
		for(i=1; i< list.size(); i++) {
			key=list.get(i);
			j= i-1;
			while (j>=0 && key < list.get(j)) {
				temp = list.get(j);
				list.set(j, list.get(j+1));
				list.set(j + 1, temp);
				j--;
			}
		}
		return list;
	}



} //end of reader

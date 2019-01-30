import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class quicksort {
	public void quickSort (int[] A) {
		quickSort(A, 0, A.length-1);
	}
	public void quickSort (int[] A, int low, int high) {
		if (low < high+1) {
			int p = partition(A, low,high);
			quickSort(A, low, p-1);
			quickSort(A, p+1, high);
		}
	}
	public void swap(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) +low;	
	}
	private int partition(int[] A, int low, int high) {
		swap(A, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (A[i] < A[low]) {
				swap(A, i, border++);
			}
		}
		swap(A, low, border-1);
		return border-1;
		
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
		
		quicksort mms = new quicksort();
		alphaCountSorted = alphaCount;
		mms.quickSort(alphaCountSorted);
		int x = alpha.length();
		while ( x > 0 ) {
			x-= 1;
			System.out.println(beta.charAt(x) + ": " + alphaCountSorted[x]);
		}
	}

}

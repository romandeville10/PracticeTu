import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelectionSort {
	public int[] selectionSort(int[]list) {
		int i,j, minValue, minIndex, temp = 0;
		for(i=0; i<list.length; i++) {
			minValue=list[i];
			minIndex=i;
			for(j =i; j< list.length; j++) {
				if(list[j]<minValue) {
					minValue = list[j];
					minIndex=j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex]= temp;
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
	
	SelectionSort mms = new SelectionSort();
	alphaCountSorted = alphaCount;
	mms.selectionSort(alphaCountSorted);
	int x = alpha.length();
	while ( x > 0 ) {
		x-= 1;
		System.out.println(beta.charAt(x) + ": " + alphaCountSorted[x]);
	}
}
}
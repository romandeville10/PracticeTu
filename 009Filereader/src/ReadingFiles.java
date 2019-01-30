import java.io.File;

import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Scanner;


public class ReadingFiles {

	public static void main(String[] args) throws FileNotFoundException {

		File inFile = new File("Kennedy_Cuba_Crisis.txt");
		Scanner in = new Scanner(inFile);
		
			Array list = ("Kennedy_Cuba_Crisis.txt");
			for (int i = 0; i<list.length - 1; i++) {
				System.out.println(list[i]);
			}
			//options: Bubblesort(list) or Insertionsor(list)
			list = Bubblesort(list);
			System.out.println("");
			System.out.println("bubble Sort");
			for( int i = 0; i<list.length - 1; i++) {
				System.out.println(list[i]);
			}
			System.out.println("");
		
		int i = 0;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(i + ": " + line + "/n");
			i++;
		}
		
		in.close();
		

	}

}

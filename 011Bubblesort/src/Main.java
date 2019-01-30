import java.util.ArrayList;

public class Main {
	
	//label answers: bubble sort:
	//different lists for different sorts
	public static void main(String[] args) {
		int[] list = {5,8,1,3,9,6};
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
		
		int[] list1 = {1,8,1,3,9,6};
		for (int i = 0; i<list1.length - 1; i++) {
			System.out.println(list1[i]);
		}
		list1 = Insertionsort(list1);
		System.out.println("");
		System.out.println("Insertion Sort");
		for( int i = 0; i<list1.length - 1; i++) {
			System.out.println(list1[i]);
		}
		System.out.println("");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i<list2.size() - 1; i++) {
			System.out.println(list2.get(i));
		}
		list2 = Insertionsort(list2);
		System.out.println("");
		System.out.println("Array List Insertion Sort");
		for( int i = 0; i<list2.size() - 1; i++) {
			System.out.println(list2.get(i));
		}
		
		
	}
	
	public static int[] Bubblesort(int[] list){
		int i, j, temp = 0;
		for(i=0;i<list.length -1; i++) {
			for(j=0;j<list.length -1 -i; j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1]=temp;
				}
			}
		}
	
		return list;
	}
	
	public static int[] Insertionsort(int[] list) {
		int i, j, key, temp;
		for(i=1;i<list.length; i++) {
			key=list[i];
			j=i-1;
			while(j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j+1];
				list[j+1]= temp;
				j--;
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> Insertionsort(ArrayList<Integer> list) {
		int i, j, key, temp;
		for(i=1;i<list.size(); i++) {
			key=list.get(i);
			j=i-1;
			while(j >= 0 && key < list.get(j)) {
				temp = list.get(i);
				list.set(j,list.get(j+1));
				list.set(j+1, temp);
				j--;
			}
		}
		return list;
	}
		
}

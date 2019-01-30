import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;
    //String beta =  " etainosrhdlcufmpwybg,v.-kq\"jz:x1;'0984673[]?52";
 
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
        System.out.println("\n ______________________________________ \n \n");
        
        MergeSort mms = new MergeSort();
        alphaCountSorted = alphaCount;
        mms.sort(alphaCountSorted);
        int x = alpha.length();
        while ( x > 0 ) {
            x-= 1;
            System.out.println(beta.charAt(x) + ": " + alphaCountSorted[x]);
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}

package algorithm;

public class selectionSoft {
	
	// Sap xep chon
	// Chon so nho nhat trong mang chuyen sang dau` mang[] sau do chuyen so mang dang dung do sang cho cua so nho nhat
	
public static void printArray(int no, int[] a) {
		
	    System.out.printf("%d: ", no);
	    for (int i = 0; i < a.length; i++) {
	        System.out.printf("%d ", a[i]);
	    }       
	    System.out.println();
	}
	
	public static void selectionSort(int [] a) {
	
	    int n = a.length;
	    for (int i = 0; i < n; i++) {
	        int minIndex = i;
	        for (int j = i+1; j < n; j++) {
	            // Tim min [i, n]
	            if(a[j] < a[minIndex]) {
	            
	                minIndex = j;
	            }
	        }
	        if (minIndex != i){
	        	int t = a[i];
	        	a[i] = a[minIndex];
	        	a [minIndex] = t; 
	        }
	        printArray(i, a);
	     
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5, 3, 2 ,7, 8, 1, 2 }; 
		selectionSort(a);
	}

}

import java.util.Arrays;

public class QuickSort_2 {

	public static void main(String[] args) {
		int [] toSort = {534,23,342,0,8,7,5};
		
		System.out.println("nach dem Sortieren");
		System.out.println("Anzahl der swaps:"+quickSort(toSort,0, toSort.length-1));
//		Arrays.stream(toSort)
//		.forEach((i)->System.out.println(i));
//		System.out.println();

	}
	
	static int quickSort(int[] a, int left, int right) {
		if(right<=left) {
			return 0;
		}else {
			int[] pivotIndex = partitioniere(a,left, right);
			return pivotIndex[1]+ quickSort(a, left, pivotIndex[0]-1)+
			quickSort(a, pivotIndex[0]+1, right);
			
		}
	}
	
	private static int[] partitioniere(int[] a, int left, int right) {
		int pivot = a[right];
		int i = left-1;
		int s=0;
		for(int j = left;j<right;j++) {
			if(a[j]>=pivot) {
				i++;
				swap(a, j, i);
				s++;
			}
		}
		swap(a,i+1,right);
		s++;
		return new int[] {i+1,s};
	}

	public static void swap(int[] a, int low, int height)
    {
    	System.out.println("element at index :   "+low +"\that den Wert:   "+a[low]+"     into Index    :"+height+"   Wert: "+a[height]);
        int temp = a[low];
        a[low] = a[height];
        a[height] = temp;
    }

}

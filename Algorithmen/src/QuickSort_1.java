
public class QuickSort_1 {

	public static void main(String[] args) {
		int[] a = {2,1,3,6,3,5,7,89,4,34,64};
		quickSort(a,0,a.length-1);
		for(int i: a) {
			System.out.println(i);
		}

	}
	
	private static void quickSort(int[]a, int left , int right) {
		if(right-left>0) {
			int pivotIndex = partitioniere(a, left, right);
			quickSort(a, left, pivotIndex -1);
			quickSort(a,pivotIndex+1, right);
		}
	}
	
	static int partitioniere(int[]a,int left, int right) {
		int pivotWert = a[right];
		//remember where to swap next
		int j = left -1;
		for(int i = left; i<right; i++) {
			if(a[i]<=pivotWert) {
				j++;
				swap(a,i,j);
			}
		}
		swap(a,j+1,right);
		return j+1;
	}
	
	public static void swap(int[] a, int low, int height)
    {
    	System.out.println("element at index :   "+low +"\that den Wert:   "+a[low]+"     into Index    :"+height+"   Wert:     "+a[height]);
        int temp = a[low];
        a[low] = a[height];
        a[height] = temp;
    }

}

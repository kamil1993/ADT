import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] toSort = {1,100,2,3,4,5,33,4,534,23,342,0};
		
		System.out.println("nach dem Sortieren");
		insertion(toSort);
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));

	}
	
	static void insertion(int[]a) {
		for(int i = 1;i<a.length;i++) {
			for(int j = i;j>0;j--) {
				if(a[j]<=a[j-1])
					swap(a,j ,j-1);
			}
		}
	}

	public static void swap(int[] a, int low, int height)
    {
    	System.out.println("element at index :   "+low +"\that den Wert:   "+a[low]+"     into Index    :"+height+"   Wert: "+a[height]);
        int temp = a[low];
        a[low] = a[height];
        a[height] = temp;
    }
}

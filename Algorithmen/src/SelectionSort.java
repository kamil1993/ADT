import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] toSort = {1,100,2,3,4,5,33,4,534,23,342,0};
		
		System.out.println("nach dem Sortieren");
		selection(toSort);
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));

	}

	private static void selection(int[] a) {
		int min;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j = i;j<a.length;j++) {
				if(a[min]>a[j])
					min = j;
			}
			swap(a,min,i);
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

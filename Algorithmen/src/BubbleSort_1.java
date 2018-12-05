import java.util.Arrays;

public class BubbleSort_1 {

	public static void main(String[] args) {
		int [] toSort = {1,2,3,4,5,33,4,534,23,342,0};
		System.out.println("vor dem Sortieren");
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));
		System.out.println("nach dem Sortieren");
		bubble(toSort,toSort.length-1);
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));
	}

	private static int[] bubble(int[] a, int length) {
		for(int i = 0; i<length;i++) {
			for(int j = 0;j<length;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		return a;
		
	}
	public static void swap(int[] a, int low, int height)
    {
    	System.out.println("element at index :   "+low +"\that den Wert:   "+a[low]+"     into Index    :"+height+"   Wert: "+a[height]);
        int temp = a[low];
        a[low] = a[height];
        a[height] = temp;
    }

}

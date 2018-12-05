
public class BinarySearch_1 {

	public static void main(String []args) {
		int [] bin = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(binary(bin,bin.length-1,0,1));	
}

	private static int binary(int[] a, int top, int bottom, int value) {
		int mid = (top+bottom)/2;
		if(value>a[mid]) {
			bottom = mid+1;
			return binary(a, top, bottom, value);
		}
		if(value<a[mid]) {
			top = mid-1;
			return binary(a, top, bottom, value);
		}		
		return mid;
	}
}
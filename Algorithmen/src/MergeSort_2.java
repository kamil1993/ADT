import java.util.Arrays;

public class MergeSort_2 {

	public static void main(String[] args) {
		int a[] = {0,5,6,1,2,3};
		doMerge(a,0,a.length-1);
		Arrays.stream(a)
		.forEach((i)->System.out.println(i));
	}
	
	public static void doMerge(int []a, int left, int right) {
		int [] helper = new int[a.length];
		doMerge( a, left, right,helper);
	}

	public static void doMerge(int[] a, int left, int right, int[] helper) {
		if(right-left>0) {
			int mid = (right+left) /2;
			doMerge(a, left, mid,helper);//linke Seite
			doMerge(a, mid+1, right, helper);//rechte Seite
			mergeIt(a, left, mid, right, helper);
		}
		
	}

	private static void mergeIt(int[] a, int left, int mid, int right, int[] helper) {
		//Copy elements to helper
		for(int i = left;i<=right;i++) {
			helper[i] = a[i];
			//System.out.print(helper[i]+"|");
		}
		//System.out.println();
		
		int i= left;//pointer linke Seite
		int j = mid+1; // pointer rechte seite
		int k = left; // änderung in orginal
		
		while(i<=mid && j<=right) {
			if(helper[i]<=helper[j]) {
				a[k] = helper[i];
				i++;
			}
			else {
				a[k]= helper[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			a[k] = helper[i];
			i++;
			k++;
		}
		while(j<=right) {
			a[k] = helper[j];
			j++;
			k++;
		}
		
		
		
	}
}

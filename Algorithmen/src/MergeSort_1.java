import java.util.Arrays;

public class MergeSort_1 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,0};
		merge(a);
		Arrays.stream(a)
		.forEach((i)->System.out.println(i));

	}

	static void merge(int[] a) {
		int[] helper = new int[a.length];
		doMerge(a, 0, a.length-1, helper);
	}

	private static void doMerge(int[] a, int left, int right, int[] helper) {
		if(right-left>0) {
			int middle = (right + left)/2;
			doMerge(a, left, middle,helper);
			doMerge(a,middle +1, right,helper);
			mergeParts(a, left, middle, right, helper);
		}
		
	}

	private static void mergeParts(int[] a, int left, int middle, int right, int[] helper) {
		
		for(int i = left; i<=right;i++) {
			helper[i] = a[i];
		}
		int i = left;
		int k= left;//where to swap next in orginal
		int j = middle+1;
		
		while(i<=middle && j<=right) {
			if(helper[i]<= helper[j]) {
				a[k] = helper[i];
				i++;
			}else {
				a[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
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

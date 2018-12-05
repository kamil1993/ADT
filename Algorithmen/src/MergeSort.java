import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,0};
		mergeSort(a);
		Arrays.stream(a)
		.forEach((i)->System.out.println(i));

	}
	public static void mergeSort(int[] a) {
		int[] helper = new int[a.length];
		doMerge(a, 0, a.length-1, helper);
	}
	
	public static void doMerge(int[] a,int left, int right ,int[] helper){
		if(right - left > 0) {
			int middle = (left + right) /2;
			doMerge(a,left,middle,helper);
			doMerge(a,middle+1,right,helper);
			mergeParts(a,left,middle,right,helper);
		}
	}
	private static void mergeParts(int[] a, int left, int middle, int right, int[] helper) {
		//jedes Teil von a in helper kopieren
		for(int i = left;i<=right; i++) {
			helper[i] = a[i];
			System.out.print(helper[i]+"|");
		}
		System.out.println();
		
		//rechte seite pointer
		int i = left;
		//der nächste Tauch
		int k = left;
		//linke seite pointer
		int j = middle +1;
		
		
		while(i<=middle && j<=right) {
			//kleineste elemente der beiden seiten vergleichen und der klenste an Stell k in Orginal swappen
			if(helper[i] <= helper[j]) {
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

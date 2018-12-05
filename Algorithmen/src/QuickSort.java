import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {2,1,3,6,3,5,7,89,4,34,64};
		quickSort(a,0,a.length-1);
		for(int i: a) {
			System.out.println(i);
		}

	}
	
	public static void _quickSort(int[] a, int left, int right) {
		if(right-left>0) {
			int pivotIndex = _partitioniere(a, left, right);
			_quickSort(a,left, pivotIndex-1);//linke teil
			_quickSort(a,pivotIndex +1, right);//rechte Teil
		}
	}
	//right Pivot
	public static int _partitioniere(int[] a,int left, int right) {
		int pivot = a[right];
		int i = left -1;//the first pointer(pivot Pointer)
		// J is pointer to compare elements with Pivot
		for(int j = left; j<right;j++) {
			
			if(a[j]<= pivot) {
				i++;
				swap(a,i,j);
			}
		}
		// move pivot to the reight Podsition
		swap(a,i+1,right);
		return i+1;
	}
	

	public static void quickSort (int[] a, int low, int height)
    {
        if(height - low > 0)
        {
            int pivotIndex = partitioniere(a,low, height);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a,pivotIndex+1, height);
        }
    }
 // mit left pivot
    public static int partitioniere(int[] a, int low, int height)
    {
        int pivot = a[low];
        int pivotIndexTemp = low ;
        for(int j = low+1; j <= height; j++)
        {
            if (a[j] <= pivot)
            {
            	pivotIndexTemp = pivotIndexTemp + 1;
                swap(a, pivotIndexTemp, j);
            }
        }
        swap(a,pivotIndexTemp,low);
        return pivotIndexTemp;
    }
    public static void swap(int[] a, int low, int height)
    {
    	System.out.println("element at index :   "+low +"\that den Wert:   "+a[low]+"     into Index    :"+height+"   Wert:     "+a[height]);
        int temp = a[low];
        a[low] = a[height];
        a[height] = temp;
    }

}

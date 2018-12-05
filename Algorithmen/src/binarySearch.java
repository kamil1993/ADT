

public  class binarySearch {
    //this is the to Merge
	static int  counter;
	static int  counter_1;
	
	
	public static void main(String []args) {
		//int [] a = {55,31,23,5,7,0,5,40};
		int [] bin = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		//int [] bin = {0,1,2};
		//System.out.println("the MAx is:\t"+max(a));
		System.out.println("the first Binary:\t"+binary(bin,bin.length-1,0,1)+"\t the counter : "+counter);
		System.out.println("the second Binary:\t"+binary_1(bin,bin.length-1,0,14)+"\t the counter : "+counter_1);
		
				
	}
	public static int max(int[] a) {
		int max ;
		max = a[0];
		int i;
		for(i = 1;i<a.length-1;i++) {
			if(max<a[i])
				max = a[i];			
		}
		return max;
	}
	
	static int binary(int []a,int top, int bottom, int searchVal) {
		++counter;
		int mid = (top + bottom) /2;
		System.out.println(mid+"\t top:"+ top+"\t Bottom:" +bottom);
		if(searchVal>a[mid]) {
			bottom = mid +1;
			return binary(a,top,bottom,searchVal);
		}
		if(searchVal<a[mid]) {
			top = mid -1;
			return binary(a,top,bottom,searchVal);
		}
		else
			return mid;
			
	}
	static int binary_1(int []a,int top, int bottom, int searchVal) {
		++counter_1;
		int mid = bottom + ((top - bottom) /2);
		System.out.println(mid +"\t top:"+ top+"\t Bottom:" +bottom);
		if (top<bottom)
			return top;
		
		if(searchVal<a[mid]) {
			
			return binary_1(a,mid -1,bottom,searchVal);
		}
		else {
			
			return binary_1(a,top,mid +1,searchVal);
		}
		
	}
	
} 


import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] toSort = {1,2,3,4,5,0};
		System.out.println("vor dem Sortieren");
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));
		System.out.println("nach dem Sortieren");
		bubble(toSort,toSort.length);
		Arrays.stream(toSort)
		.forEach((i)->System.out.println(i));

	}
	//das problem Hier das die schleife wird sowieso laufen immer length hoch 2 mal ,auch wenn es sortiert ist
	public static int [] bubble(int [] toSort,int length) {
		boolean swapped = false;
		int first = 0;
		int sec = 0;
		for(int i= 0; i<length-1;i++) {
			first++;
			System.out.println("the first Loop : "+first);
			
			for(int j= 0; j<length-1;j++) {
				sec++;
				System.out.println("the second Loop : "+sec);

				if(toSort[j]>toSort[j+1]) {
					int temp = toSort[j+1];
					toSort[j+1]=toSort[j];
					toSort[j] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
			swapped = false;
		}
		return toSort;
	}

}

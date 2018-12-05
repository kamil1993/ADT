package ArrADT;

public class Knoten<T> {
	private T item;
	
	public Knoten(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}

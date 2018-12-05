package dataStructures;

public class Knoten<T> {

	private T element;
	private Knoten<T> next;
	
	public Knoten(T element, Knoten<T> next) {
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Knoten<T> getNext() {
		return next;
	}

	public void setNext(Knoten<T> next) {
		this.next = next;
	}
}

package dataStructures;

public class Queue<T> implements QueueInterface<T> {

	private Knoten<T> head = null;
	private Knoten<T> tail = null;
	
	
	@Override
	public QueueInterface<T> enqueue(T element) {
		Knoten<T> oldtail = tail;
		tail =  new Knoten<>(element, null);
		if(head!=null)
			oldtail.setNext(tail);
		else
			head = tail;
		return this;
	}

	@Override
	public QueueInterface<T> dequeue() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	
}

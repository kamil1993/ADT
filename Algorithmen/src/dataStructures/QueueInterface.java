package dataStructures;

public interface QueueInterface<T> {
	public QueueInterface<T> enqueue(T element);
	public QueueInterface<T> dequeue();
	public T peek();
	public boolean isEmpty();
}

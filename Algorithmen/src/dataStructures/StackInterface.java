package dataStructures;

public interface StackInterface<T> {

	public StackInterface<T> push(T elemnt);
	public StackInterface<T> pop();
	public boolean isEmpty();
	public T top();
}

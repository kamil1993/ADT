package ArrADT;

import dataStructures.QueueInterface;

public class Queue<T> implements QueueInterface<T> {
	private Knoten<T>[] arr = new Knoten[5]; 
	int in = 0;
	int out = 0;
	
//	public void init() {
//		
//	}
	@Override
	public QueueInterface<T> enqueue(T element) {
		
		arr[in] = new Knoten<T>(element);
		in++;
		return this;
	}

	@Override
	public QueueInterface<T> dequeue() {
		out++;
		return this;
	}

	@Override
	public T peek() {
		Knoten<T> A =(Knoten<T>)arr[out];
		System.out.println(A.getItem());
		return A.getItem();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return out>in;
	}

}

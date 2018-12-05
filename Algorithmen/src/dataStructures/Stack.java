package dataStructures;

public class Stack<T> implements StackInterface<T>{

	private int size = 0;
	private int elementNumber = 0;
	private Knoten<T> topKnoten= null;
	

	
	
	public Stack(int size) {
		this.size = size;
	}
	@Override
	
	public StackInterface<T> push(T element) {
		if(elementNumber >= size) {
			throw  new IllegalMonitorStateException();
		}else {
			topKnoten = new Knoten<T>(element, topKnoten);
			elementNumber++;
			return this;
		}
	}


	@Override
	public StackInterface<T> pop() {
		if(isEmpty()) {
			throw  new IllegalMonitorStateException();
		}
		else {
			topKnoten = topKnoten.getNext();
			return this;
		}
			
	}

	@Override
	public boolean isEmpty() {
		
		return topKnoten == null;
	}

	@Override
	public T top() {
		
		return topKnoten.getElement();
	}

	public void print() {
		 Knoten<T> testKnoten= topKnoten;
		 Knoten<T> temp= new Knoten<T>(topKnoten.getNext().getElement(),topKnoten);
		 while(testKnoten.getNext()!=null) {
			 System.out.println(testKnoten.getElement());
			 temp.setNext(new Knoten<T>(topKnoten.getNext().getElement(),topKnoten));
			 
			 testKnoten = testKnoten.getNext();
		 }
		
	}



}

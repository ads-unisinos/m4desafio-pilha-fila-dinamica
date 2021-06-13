package PilhaFilaDinamica;

public class StaticStack<E> implements Stack<E> {
	
	private int top;
	private final E[] elements;

	public StaticStack(int maxSize) {
		elements = (E[])new Object[maxSize];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == elements.length - 1;
	}

	public int numElements() {
		return top + 1;
	}
	
	public void push(E element) throws OverflowException {
		if (isFull())
			throw new OverflowException();
		elements[++top] = element;
	}

	public E pop() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		E element = elements[top];
		elements[top--] = null;
		return element;
	}

	public E top() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		return elements[top];
	}

	public String toString() {
		if (isEmpty())
			return "[Empty]";
		else {
			String s = "[";
			for (int i = numElements() - 1; i >= 0; i--) {
				s += "\n" + elements[i];
			}
			s += "\n]";
			return s;
		}
	}

	public void flip() {
		E array[] =  (E[])new Object[numElements()];
		int cont = numElements();
		int j = 0;
		
		for (int i = 0; i < cont; i++) {
			array[i] = pop();
		}

		while(j < array.length) {
			push(array[j]);
			j++;
		}
	}
}
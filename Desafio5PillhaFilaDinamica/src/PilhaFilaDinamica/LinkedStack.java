package PilhaFilaDinamica;

public class LinkedStack implements Stack
{
    public LinkedStack() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int numElements() {
        return 0;
    }

    @Override
    public void push(Object element) throws OverflowException {

    }

    @Override
    public Object pop() throws UnderflowException {
        return null;
    }

    @Override
    public Object top() throws UnderflowException {
        return null;
    }
}

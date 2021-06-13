package PilhaFilaDinamica.Core;

import PilhaFilaDinamica.Exceptions.InvalidStackOperationException;
import PilhaFilaDinamica.Exceptions.OverflowException;
import PilhaFilaDinamica.Exceptions.UnderflowException;

public class LinkedStack<E> implements Stack<E>
{
    private int numElements;
    private Node<E> topo;

    public LinkedStack()
    {
        numElements = 0;
        topo = null;
    }

    public Node<E> getTopo() {
        return topo;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public void push(E element) throws NullPointerException, OverflowException
    {
        if(element == null) throw new NullPointerException();

        Node<E> newNode = new Node<E>(element);

        if(isEmpty())
        {
            topo = newNode;
        }
        else{
            newNode.setNext(topo);
            topo = newNode;
        }
        numElements++;
    }

    @Override
    public E pop() throws UnderflowException
    {
        if (isEmpty()) throw new UnderflowException();

        E element = topo.getElement();
        topo = topo.getNext();
        numElements--;

        return element;
    }

    @Override
    public E top() throws UnderflowException , InvalidStackOperationException
    {
        if( isEmpty())
        {
            throw new InvalidStackOperationException
                    ( "Stack is empty: Can not execute this operation.");
        }

        return topo.getElement();
    }

    @Override
    public String toString()
    {
        if(isEmpty())
        {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder();
        Node<E> current = topo;

        while (current != null) {
            sb.append( current.getElement().toString() );
            sb.append(" - ");
            sb.append(current.getNext());
            sb.append("\n");

            current = current.getNext();
        }
        return sb.toString();
    }
}

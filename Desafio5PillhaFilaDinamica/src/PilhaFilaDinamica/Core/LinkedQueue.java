package PilhaFilaDinamica.Core;

import PilhaFilaDinamica.Exceptions.OverflowException;
import PilhaFilaDinamica.Exceptions.UnderflowException;

public class LinkedQueue<E> implements Queue<E>
{
    private Node<E> head;
    private Node<E> tail;
    private int numElements;

    public LinkedQueue() 
    {
        numElements = 0;
        head = null;
        tail = null;
    }


    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int numElements(){
        return numElements;
    }

    @Override
    public void enqueue(E element) throws NullPointerException, OverflowException
    {
        if(element == null) throw new NullPointerException();

        Node<E> newNode = new Node<>(element);

        if(isEmpty())        {
            head = tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        numElements++;
    }

    @Override
    public E dequeue() throws UnderflowException
    {
        if(isEmpty()) throw  new UnderflowException();

        E element = head.getElement();

        if(head == tail)
        {
            head = tail = null;
        }
        else{
            head = head.getNext();
        }

        numElements--;
        return element;
    }

    @Override
    public E front() throws UnderflowException
    {
        if(isEmpty()) throw  new UnderflowException();
        return head.getElement();
    }

    @Override
    public E back() throws UnderflowException
    {
        if(isEmpty()) throw  new UnderflowException();
        return tail.getElement();
    }

    @Override
    public String toString()
    {
        if(isEmpty())
        {
            return "[ ]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<E> current = head;

        while (current != null) {
            sb.append( current.getElement().toString() );
            sb.append(" - ");
            sb.append(current.getNext());
            sb.append(" ");

            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}

package PilhaFilaDinamica.Core;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedQueueTest
{
    private final LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();

    @Test
    public void enqueue_WhenTwoElementInQueue_NumElementsTwo()
    {
        int element1 = 1;
        int element2 = 4;

        linkedQueue.enqueue(element1);
        linkedQueue.enqueue(element2);

        assertEquals(2, linkedQueue.numElements());
    }

    @Test
    public void pop_WhenEnqueueTwoDequeueOne_ReturnFirstElement()
    {
        int element1 = 1;
        int element2 = 4;

        linkedQueue.enqueue(element1);
        linkedQueue.enqueue(element2);

        int actualElement = linkedQueue.dequeue();

        assertEquals(element1, actualElement);
    }

    @Test
    public void toString_WhenEnqueue_PrintQueue()
    {
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);

        System.out.println(linkedQueue);

        assertNotNull(linkedQueue);

    }
}
package PilhaFilaDinamica.Core;

import PilhaFilaDinamica.Core.LinkedStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedStackTest
{
    private final LinkedStack<Integer> linkedStack = new LinkedStack<>();

    @Test
    public void IsEmpty_whenTopoEmpty_True()
    {
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    public void numElements_WhenStackEmpty_Zero (){
        assertEquals(0, linkedStack.numElements());
    }

    @Test
    public void push_WhenPushOneElement_NumElementsIsOne ()
    {
        int element = 2;
        linkedStack.push(element);
        assertEquals(1, (linkedStack.numElements()));
    }

    @Test
    public void push_WhenTwoElementInStack_NumElementsTwo()
    {
        int element1 = 1;
        int element2 = 4;

        linkedStack.push(element1);
        linkedStack.push(element2);

        assertEquals(2, linkedStack.numElements());
    }

    @Test
    public void push_WhenStackNotEmpty_TopoNotNull()
    {
        int element1 = 1;
        int element2 = 4;

        linkedStack.push(element1);
        linkedStack.push(element2);

        assertNotNull( linkedStack.getTopo().getNext());
    }

    @Test
    public void pop_WhenPushTwoPopOne_NumElementsIsOne()
    {
        int element1 = 1;
        int element2 = 4;

        linkedStack.push(element1);
        linkedStack.push(element2);

        linkedStack.pop();

        assertEquals(1, linkedStack.numElements() );
    }

    @Test
    public void pop_WhenPushTwoPopOne_ReturnSecondElement()
    {
        int element1 = 1;
        int element2 = 4;

        linkedStack.push(element1);
        linkedStack.push(element2);

        int actualElement = linkedStack.pop();

        assertEquals(element2, actualElement);
    }

    @Test
    public void top_WhenPushTwoTop_LastElement()
    {
        int element1 = 1;
        int element2 = 4;

        linkedStack.push(element1);
        linkedStack.push(element2);

        int actualElement = linkedStack.top();

        assertEquals(element2, actualElement);
    }

    @Test
    public void toString_WhenPushElements_PrintStack()
    {
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);

        System.out.println(linkedStack);

        assertNotNull(linkedStack);

    }
}
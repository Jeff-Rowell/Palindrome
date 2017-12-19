package jRowellHw4;

import java.util.EmptyStackException;

/**
 * This class is an implementation of a stack of characters used to test
 * if a given string is a palindrome.
 * 
 * @author jeffrowell
 */
public class Stack 
{

        // Declare private fields
    private char[] stack;
    private int topIndex;

        /**
         * Initializes topIndex to -1, using the last element in the array as
         * the top of the stack. Creates a new array of characters with a 
         * given length.
         * @param size The size of the stack
         */
    public Stack(int size) 
    {
        stack = new char[size];
        topIndex = -1;
    }

    /**
     * Adds a new entry to the top of this stack.
     * @param newEntry A character to be added to the stack
     */
    public void push(char newEntry) 
    {
        stack[topIndex + 1] = newEntry;
        topIndex++;
    }

    /**
     * Removes and returns this stack's top entry
     * @return The character at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public char pop() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        } 
        else 
        {
            char top = stack[topIndex];
            stack[topIndex] = 0;
            topIndex--;
            return top;
        }
    }

    /**
     * Retrieves this stack's top entry
     * @return The character at the top of the stack
     */
    public char peek() 
    {
        if (isEmpty()) 
        {
            throw new EmptyStackException();
        } 
        else 
        {
            return stack[topIndex];
        }
    }

    /**
     * Detects whether this stack is empty
     * @return True if the stack is empty, false otherwise
     */
    public boolean isEmpty() 
    {
        return topIndex < 0;
    }

    /**
     * Removes all entries from this stack
     */
    public void clear() 
    {
        while (!isEmpty()) 
        {
            pop();
        }
    }
}

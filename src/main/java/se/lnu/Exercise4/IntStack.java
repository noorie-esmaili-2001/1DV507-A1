package se.lnu.Exercise4;

import java.lang.IndexOutOfBoundsException;

public interface IntStack extends Iterable<Integer> {
    /* Add integer at top of stack. */
    void push(int n);

    /* Returns and removes integer at top of stack  */
    int pop() throws IndexOutOfBoundsException;

    /* Returns without removing integer at top of stack */
    int peek() throws IndexOutOfBoundsException;

    /* Number of integers currently stored. */
    int size();

    /* String of type "[ 7 56 -45 68 ... ]" */
    String toString();
}

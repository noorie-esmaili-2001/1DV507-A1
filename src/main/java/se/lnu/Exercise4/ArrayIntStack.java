package se.lnu.Exercise4;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

    @Override
    public void push(int n) {
        resize();
        values[size() - 1] = n;
    }

    @Override
    public int pop() {
        /* Returns and removes integer at top of stack */
        if (size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int top = values[size() - 1];
        int[] tmp = new int[size() - 1];
        System.arraycopy(values, 0, tmp, 0, size() - 1);
        values = tmp;

        return top;
    }

    @Override
    public int peek() {
        /* Returns without removing integer at top of stack */
        if (size() == 0) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return values[size() - 1];
    }
}

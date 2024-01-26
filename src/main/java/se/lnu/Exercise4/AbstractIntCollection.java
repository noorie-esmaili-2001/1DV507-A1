package se.lnu.Exercise4;

import java.util.Iterator;

public abstract class AbstractIntCollection implements Iterable<Integer> {
    protected int[] values = new int[0];

    public int size() {
        return values.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        for (int value : values) {
            buf.append(" ").append(value);
        }

        buf.append(" ]");
        return buf.toString();
    }

    protected void resize() {
        int[] tmp = new int[size() + 1];
        System.arraycopy(values, 0, tmp, 0, values.length);
        values = tmp;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return values[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

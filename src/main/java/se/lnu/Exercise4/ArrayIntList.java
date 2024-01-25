package se.lnu.Exercise4;

public class ArrayIntList extends AbstractIntCollection implements IntList {

    @Override
    public void add(int n) {
        resize();
        values[size() - 1] = n;
    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        resize();
        for (int i = size() - 1; i >= index; i--) {
            if (i == index) {
                values[i] = n;
            }
            if (i > index) {
                values[i] = values[i - 1];
            }
        }
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        int newSize = size() - 1;
        int[] tmp = new int[newSize];
        System.arraycopy(values, 0, tmp, 0, index);
        System.arraycopy(values, index + 1, tmp, index, newSize - index);

        values = tmp;
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for (int i = 0; i < size(); i++) {
            if (get(i) == n) {
                return i;
            }
        }

        return -1;

    }
}

package se.lnu.Exercise2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stacks implements StringStack {
    private ArrayList<String> list;

    public Stacks() {
        list = new ArrayList<>();
        setList(list);
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return getList().isEmpty();
    }

    public int size() {
        return getList().size();
    }

    public void push(String element) {
        list.add(element);
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String o = list.get(size() - 1);
        list.remove(size() - 1);
        return o;
    }

    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return getList().get(size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String l : list) {
            s.append(l).append(" ");
        }
        return s.toString();
    }
}
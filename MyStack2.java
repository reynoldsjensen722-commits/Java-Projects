package chapter_11;

import java.util.ArrayList;

public class MyStack2<E> extends ArrayList<E> {
    private static final long serialVersionUID = 1L;

    public E push(E o) {
        add(o);
        return o;
    }

    public E pop() {
        if (isEmpty()) return null;
        return remove(size() - 1);
    }

    public E peek() {
        if (isEmpty()) return null;
        return get(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int getSize() {
        return size();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}



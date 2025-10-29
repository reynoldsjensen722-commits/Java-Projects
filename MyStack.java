package chapter_13;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public MyStack clone() {
        try {
            MyStack clone = (MyStack) super.clone();
            clone.list = new ArrayList<>(this.list); // deep copy
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}












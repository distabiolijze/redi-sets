package org.redi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SimpleSet<T> implements OurSet<T> {

    private final List<T> items = new ArrayList<>();

    @Override
    public void add(T t) {
        if (items.contains(t))
            return;
        items.add(t);
    }

    @Override
    public void remove(T t) {
        items.remove(t);
    }

    @Override
    public boolean contains(T t) {
        return items.contains(t);
    }

    @Override
    public void forEach(Consumer<T> consumer) {
        items.forEach(consumer);
    }

    @Override
    public int size() {
        return items.size();
    }
}

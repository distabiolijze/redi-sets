package org.redi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MySortedSet<T extends Comparable<T>> implements SortedSet<T> {

    private final List<T> items = new ArrayList<>();

    @Override
    public void add(T t) {
        if (items.contains(t))
            return;
        items.add(t);
        Collections.sort(items);
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

    @Override
    public T first() {
        if (items.isEmpty()) return null;
        return items.get(0);
    }

    @Override
    public T last() {
        if (items.isEmpty()) return null;
        return items.get(items.size() - 1);
    }

    @Override
    public SortedSet<T> subset(T first, T last) {
        MySortedSet<T> ret = new MySortedSet<>();
        for (T item : items) {
            if (item.compareTo(first) >= 0 && item.compareTo(last) < 0) {
                ret.add(item);
            }
        }
        return ret;
    }
}

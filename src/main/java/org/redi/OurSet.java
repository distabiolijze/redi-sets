package org.redi;

import java.util.function.Consumer;

interface OurSet<T> {

    // adds an item to the set
    void add(T t);

    // removes an item from the set
    void remove(T t);

    // checks if the item is present in the set
    boolean contains(T t);

    // performs an operation on every item in the set
    void forEach(Consumer<T> consumer);

    // returns the size of this set
    int size();
}

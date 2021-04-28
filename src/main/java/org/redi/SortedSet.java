package org.redi;

public interface SortedSet<T> extends OurSet<T> {

    // The first item in the Set
    T first();

    // The last item in the Set
    T last();

    // The Set containing items >= first and < last.
    SortedSet<T> subset(T first, T last);

}

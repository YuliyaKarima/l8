import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.ImmutableList;

/**
 * Realisation of ArrayList that allows to create immutable List object
 *
 * @param <E>
 */

public class CustomImmutableList<E> extends ArrayList<E> {
    private ImmutableList<E> list;
    private Iterator<E> iterator;

    public CustomImmutableList(E... elements) {
        list = ImmutableList.copyOf(elements);
        iterator = list.iterator();
    }

    public CustomImmutableList(List<E> elements) {
        list = ImmutableList.copyOf(elements);
        iterator = list.iterator();
    }

    /**
     * Method for cyclical iteration of object
     *
     * @return next element in collection
     */
    public E next() {
        if (iterator.hasNext()) {
            return iterator.next();
        } else {
            iterator = list.iterator();
            return next();
        }
    }

    public E get(int index) {
        return list.get(index);
    }

    /**
     * Unsupported operation
     *
     * @param e
     * @return
     */
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     *
     * @param o
     * @return
     */
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     */
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     *
     * @param c
     * @return
     */
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     *
     * @param index
     * @param c
     * @return
     */
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     *
     * @param c
     * @return
     */
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation
     *
     * @param c
     * @return
     */
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Overrides toString method for correct output to console
     *
     * @return String view of list contents
     */
    public String toString() {
        return list.toString();
    }
}

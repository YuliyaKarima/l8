import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Realization of HashSet that allows to store non unique keys
 *
 * @param <E> type parameter of stored objects
 */
public class NonuniqueHashSet<E> extends HashSet<E> {
    private Map<E, Integer> map;

    public NonuniqueHashSet() {
        map = new HashMap<>();
    }

    /**
     * Overrides method 'add' of Set so that Map field 'map'
     * will be keep count of keys of adding object as Integer value
     *
     * @param e adding object
     * @return true if operation of adding was successfully
     */
    public boolean add(E e) {
        if (map.containsKey(e)) {
            int i = map.get(e);
            map.replace(e, i + 1);
            return true;
        } else {
            return map.put(e, 1) == null;
        }
    }

    /**
     * Overrides method 'remove' of Set so that Map field 'map'
     * will be change it's Integer if map stores
     * more than one such objects
     *
     * @param o deleted object
     * @return true if operation of deleting was successfully
     */
    public boolean remove(Object o) {
        int count = map.get(o);
        if (count > 1) {
            map.replace((E) o, count - 1);
            return true;
        } else {
            return map.remove(o) == count;
        }
    }

    /**
     * Return count of certain object in the map
     *
     * @param o countable object
     * @return count of such objects
     */
    public int count(E o) {
        return map.get(o);
    }

    /**
     * Overrides toString method for correct output to console
     *
     * @return String view of map contents
     */
    public String toString() {
        String toPrint = "[";
        for (E o : map.keySet()) {
            for (int i = 0; i < map.get(o); i++) {
                toPrint = toPrint + o + " ";
            }
        }
        toPrint = toPrint + "]";
        return toPrint;
    }
}

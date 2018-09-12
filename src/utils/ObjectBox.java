package utils;


import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ObjectBox<T> {

    protected Set<T> data;

    public ObjectBox() {
        data = new TreeSet<>();
    }

    public ObjectBox(T[] array) {
        if(array == null) {
            throw new IllegalArgumentException("array can`t be null");
        }
        data = new TreeSet<>(Arrays.asList(array));
    }

    public boolean addObject(T o) {
        return data.add(o);
    }

    public boolean removeObject(T o) {
        return data.remove(o);
    }

    public void dump() {
        System.out.println(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectBox<?> objectBox = (ObjectBox<?>) o;

        return data != null ? data.equals(objectBox.data) : objectBox.data == null;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "data=" + data +
                '}';
    }
}

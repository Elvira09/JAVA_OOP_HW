package HWJavaOOP.HW4;

import java.util.ArrayList;
import java.util.Iterator;

import HWJavaOOP.HW4.IsGood.BeginsWith;
import HWJavaOOP.HW4.IsGood.IsGood;

public class Filter<T> implements Iterable<T> {

    private Iterable<T> array;
    private T item;

    public Filter(Iterable<T> array) {
        this.array = array;
    }

    public Iterable<T> getArray() {
        return array;
    }

    public Iterable<T> filter(Filter<T> fil, IsGood<T> ig) {
        Iterable<T> result = new ArrayList<T>();
        for (T el : getArray()) {
            if (ig.isGood(el)) {
                ((ArrayList<T>) result).add(el);
            }
        }
        return (Iterable<T>) result;

    }
    // public T elementByIndex(Iterable<T> array, int index) {
    //     for (int i = 0; i < ((ArrayList<T>) array).size(); i++) {
    //         if (index == i)
    //             ((ArrayList<T>) array).get(i);
    //     }
    //     return item;
    // }

    // public Iterable<T> filter(Filter<T> fil, IsGood<T> ig) {
    //     Iterable<T> result = new ArrayList<T>();
        
    //         for (T el : getArray()) {
    //             if (ig instanceof BeginsWith && !ig.isGood(elementByIndex(getArray(), 0)))
    //                 continue;
    //             else {
    //                 ((ArrayList<T>) result).add(el);
                    
    //             }
    //         }
        
    //     return (Iterable<T>) result;

    // }

    @Override
    public Iterator<T> iterator() {
        return getArray().iterator();
    }

    // public String getType(Object o)
    // {
    // return o.getClass().getSimpleName();
    // }

}

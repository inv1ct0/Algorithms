package lesson_4;

import java.util.function.Function;
import java.util.function.Predicate;

public interface Queue {
    void enqueue(Object element);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();

    Queue makeCopy();
    Queue filter(Predicate<Object> predicate);
    Queue map(Function<Object, Object> func);
}
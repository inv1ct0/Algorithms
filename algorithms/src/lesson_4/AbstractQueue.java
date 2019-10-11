package lesson_4;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class AbstractQueue implements Queue {
    int size = 0;

    public void enqueue(Object elem) {
        assert elem != null;
        enqueueImpl(elem);
        size++;
    }

    protected abstract void enqueueImpl(Object elem);

    public Object element() {
        assert size > 0;
        return elementImpl();
    }

    protected abstract Object elementImpl();

    public Object dequeue() {
        Object result = element();
        dequeueImpl();
        size--;
        return result;
    }

    protected abstract void dequeueImpl();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        clearImpl();
        size = 0;
    }

    public Object[] toArray() {
        Object[] temp = new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = dequeue();
            enqueue(temp[i]);
        }
        return temp;
    }

    protected abstract void clearImpl();

    protected abstract AbstractQueue createCopy();

    public AbstractQueue filter(Predicate<Object> predicate) {
        AbstractQueue result = createCopy();
        for (int i = 0; i < size; i++) {
            Object temp = result.dequeue();
            if (predicate.test(temp)) {
                result.enqueue(temp);
            }
        }
        return result;
    }

    public AbstractQueue map(Function<Object, Object> func) {
        AbstractQueue result = createCopy();
        for (int i = 0; i < size; i++) {
            result.enqueue(func.apply(result.dequeue()));
        }
        return result;
    }
}
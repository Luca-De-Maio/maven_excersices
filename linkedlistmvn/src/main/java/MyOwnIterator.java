import java.util.ListIterator;
import java.util.Objects;

public class MyOwnIterator<T> implements ListIterator<T> {
    private Node<T> currentFromFirst;
    private Node<T> currentFromLast;

    public MyOwnIterator(Node<T> head, Node<T> tail) {
        this.currentFromFirst = head;
        this.currentFromLast = tail;
    }

    @Override
    public boolean hasNext() {
        return Objects.nonNull(currentFromFirst);
    }

    @Override
    public T next() {
        Node<T> current = currentFromFirst;
        currentFromFirst = current.getNext();
        return current.getDataElement();
    }

    @Override
    public boolean hasPrevious() {
        return Objects.nonNull(currentFromLast);
    }

    @Override
    public T previous() {
        Node<T> current = currentFromLast;
        currentFromLast = current.getPrev();
        return current.getDataElement();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(T t) {

    }

    @Override
    public void add(T t) {

    }
}

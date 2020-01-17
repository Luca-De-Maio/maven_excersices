public class Node<T> {
    private Node<T> next = null;
    private Node<T> prev = null ;
    private T dataElement;

    public Node() {
    }

    public Node(T dataElement) {
        this.dataElement = dataElement;
    }

    @Override
    public String toString() {
        return "Node{" +
                ", dataElement= " + dataElement +
                '}';
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getDataElement() {
        return dataElement;
    }

    public void setDataElement(T dataElement) {
        this.dataElement = dataElement;
    }
}

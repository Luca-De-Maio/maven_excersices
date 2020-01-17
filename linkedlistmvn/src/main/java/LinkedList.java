import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> p;
    private Node<T> head = null;
    private Node<T> tail = null;
    private static final Logger LOGGER = Logger.getLogger(LinkedList.class);

    public Node<T> getP() {
        return p;
    }

    public void setP(Node<T> p) {
        this.p = p;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public LinkedList() {
        this.p = null;
        this.head = null;
        this.tail = null;
    }

    public void add(T data){
        Node<T> nodito = new Node<>(data);
        if (Objects.isNull(head) ){
            head = nodito;
            tail = head;
        }else {
            tail.setNext(nodito);
            nodito.setPrev(tail);
            tail = nodito;
        }
    }

    public void add(int idx, T data){
        Node<T> temp = head;
        int cont = 0;
        while (Objects.nonNull(temp)) {
            if (cont == idx) {
                Node<T> nodito = new Node<T>(data);
                nodito.setPrev(temp.getPrev());
                nodito.setNext(temp);
                temp.getPrev().setNext(nodito);
                temp.setPrev(nodito);
                break;
            }
            temp = temp.getNext();
            cont ++;
        }
    }

    public void delete(T data){
        Node<T> temp = head;
        while (Objects.nonNull(temp)) {
            if (temp.getDataElement().equals(data)) {
                if(temp.equals(head)){
                    head = temp.getNext();
                    head.setPrev(null);
                    break;
                }else{
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                }
            }
            temp = temp.getNext();
        }
    }

    @Override
    public MyOwnIterator<T> iterator() {
        return new MyOwnIterator<T>(head, tail);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        Iterator<T> itr = iterator();
        while (itr.hasNext()) {
            s.append(itr.next().toString());
            if (itr.hasNext()) s.append(",");
        }
        s.append("]");
        return s.toString();
    }

    public String Reverse() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        MyOwnIterator<T> itr = iterator();
        while (itr.hasPrevious()) {
            s.append(itr.previous().toString());
            if (itr.hasPrevious()) s.append(",");
        }
        s.append("]");
        return s.toString();
    }

    public int size(){
        p = head;
        int cont = 0;
        while (p != null){
            cont ++;
            p = p.getNext();
        }
        return cont;
    }

    public static void main(String[] args) {

        LinkedList<Integer> listita = new LinkedList<>();

        listita.add(1);
        listita.add(7);
        listita.add(4);
        listita.add(9);
        listita.add(222);
        listita.add(10);
        listita.add(2,2);
        listita.delete(1);
        LOGGER.info("List : "+listita.toString());
        LOGGER.info("Reverse List : "+listita.Reverse());
    }


}

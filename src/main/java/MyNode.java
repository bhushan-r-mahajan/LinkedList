public class MyNode <K> {
    private K key;
    private MyNode<K> next;

    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }

    public void setNext(MyNode<K> next) {
        this.next = next;
    }

    public MyNode<K> getNext() {
        return next;
    }
}

public class MyNode <K> implements LNode<K> {
    private K key;
    private LNode<K> next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public void setNext(LNode<K> next) {
        this.next = next;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public LNode<K> getNext() {
        return next;
    }
}

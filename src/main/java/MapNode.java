public class MapNode<K, V> implements LNode<K> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public LNode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(LNode<K> next) {
        this.next = (MapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder viewList = new StringBuilder();
        viewList.append (" K = ").append(key).append(" V = ").append(value);
        if (next != null) {
            viewList.append("->").append(next);
        }
        return viewList.toString();
    }
}

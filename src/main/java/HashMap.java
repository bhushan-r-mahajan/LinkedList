public class HashMap<K, V> {
    LinkedList<K> linkedList;

    public HashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.searchList(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.searchList(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "HashMap Nodes are: [" + linkedList + "]";
    }
}

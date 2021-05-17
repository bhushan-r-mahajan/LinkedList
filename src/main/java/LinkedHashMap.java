import java.util.ArrayList;

public class LinkedHashMap<K, V> {
    private final int numberOfContainers;
    ArrayList<LinkedList<K>> containers;

    public LinkedHashMap() {
        this.numberOfContainers = 10;
        this.containers = new ArrayList<>(numberOfContainers);
        for (int i = 0; i < numberOfContainers; i++) {
            this.containers.add(null);
        }
    }

    private int getContainerIndex (K key) {
        int hashcode = Math.abs(key.hashCode());
        int index = hashcode % numberOfContainers;
        return index;
    }

    public V get(K key) {
        int index = this.getContainerIndex(key);
        LinkedList<K> linkedList = this.containers.get(index);
        if (linkedList == null) {
            return null;
        }
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchList(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getContainerIndex(key);
        LinkedList<K> linkedList = this.containers.get(index);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.containers.set(index, linkedList);
        }
        MapNode<K, V> mapNode = (MapNode<K, V>) linkedList.searchList(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            linkedList.append(mapNode);
        } else {
            mapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "LinkedHashMap list: {" + containers + "}";
    }
}

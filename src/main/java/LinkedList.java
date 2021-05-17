@SuppressWarnings("ALL")

public class LinkedList<K> {
    public LNode<K> head;
    public LNode<K> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(LNode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            LNode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(LNode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(LNode<K> newNode, LNode<K> prevNode) {
        LNode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            tempNode = prevNode.getNext();
            prevNode.setNext(newNode);
            newNode.setNext(tempNode);
        }
    }

    public LNode<K> popHead() {
        LNode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public LNode<K> popTail() {
        LNode<K> tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    public LNode searchList(K key) {
        LNode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void remove(K key) {
        LNode tempNode = head;
        LNode prevNode = null;
        while (tempNode.getKey() != key) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        tempNode = tempNode.getNext();
        prevNode.setNext(tempNode);
    }

    public int getSize() {
        LNode newNode = this.head;
        int size = 0;
        while (newNode != null)
        {
            newNode = newNode.getNext();
            size++;
        }
        System.out.println("Size of LinkedList is: " + size);
        return size;
    }

    public void printList() {
        StringBuilder viewList = new StringBuilder("Values are: ");
        LNode<K> tempNode = head;
        while (tempNode.getNext() != null) {
            viewList.append(tempNode.getKey());
            if (!tempNode.equals(tail)) {
                viewList.append("->");
            }
            tempNode = tempNode.getNext();
        }
        viewList.append(tempNode.getKey());
        System.out.println(viewList);
    }

    @Override
    public String toString() {
        return "" + head + "";
    }
}
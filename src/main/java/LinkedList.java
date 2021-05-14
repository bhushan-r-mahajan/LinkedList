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
        LNode<K> tempNode = prevNode.getNext();
        prevNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public LNode pop() {
        LNode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
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
}
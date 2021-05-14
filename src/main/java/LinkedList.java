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

    public void printList() {
        StringBuilder viewList = new StringBuilder("Values: ");
        LNode tempNode = head;
        while (tempNode.getNext() != null) {
            viewList.append(tempNode.getKey());
            if (!tempNode.equals(tail)) viewList.append("->");
            tempNode = tempNode.getNext();
        }
        viewList.append(tempNode.getKey());
        System.out.println(viewList);
    }
}
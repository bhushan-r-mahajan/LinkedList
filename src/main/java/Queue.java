public class Queue<K> {
    private final LinkedList<K> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void push(LNode value) {
        linkedList.append(value);
    }

    public void printStack() {
        linkedList.printList();
    }

    public void size() {
        linkedList.getSize();
    }

    public LNode peek() {
        System.out.println("The Element after peeking is: " + linkedList.head.getKey());
        return linkedList.head;
    }
}

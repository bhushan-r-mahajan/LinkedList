public class Stack<K> {
    private final LinkedList<K> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    public void push(LNode<K> value) {
        linkedList.add(value);
    }

    public LNode<K> peek() {
        System.out.println("The Element after peeking is: " + linkedList.head.getKey());
        return linkedList.head;
    }

    public void printStack() {
        linkedList.printList();
    }
}

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

    public LNode<K> pop() {
        return linkedList.popHead();
    }

    public void size() {
        linkedList.getSize();
    }

    public void printStack() {
        linkedList.printList();
    }

    public boolean isEmpty() {
        if (linkedList.head != null && linkedList.tail != null) {
            System.out.println("The Stack is Not Empty!!");
            return false;
        }
        System.out.println("The Stack is Empty!!");
        return true;
    }
}

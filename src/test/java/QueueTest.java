import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    void given3NumbersWhenAddedToStackShouldHaveLastElementAtHead() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.push(myFirstNode);
        queue.push(mySecondNode);
        queue.push(myThirdNode);
        System.out.print("After Push the ");
        queue.printStack();
        queue.size();
        LNode result = queue.peek();
        Assertions.assertEquals(myFirstNode, result);
    }
}

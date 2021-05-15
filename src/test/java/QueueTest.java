import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    void given3NumbersWhenAddedToQueueShouldHaveFirstElementAtHead() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        System.out.print("After Push the ");
        queue.printQueue();
        queue.size();
        LNode result = queue.peek();
        Assertions.assertEquals(myFirstNode, result);
    }

    @Test
    void given3NumbersWhenDeletedFromQueueShouldHaveHeadDeleted() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        queue.printQueue();
        LNode result = queue.dequeue();
        System.out.print("After Pop the ");
        queue.printQueue();
        queue.size();
        Assertions.assertEquals(myFirstNode, result);
    }

    @Test
    void givenNoNumbersWhenEmptyQueueShouldPassTest() {
        Queue<Integer> queue = new Queue<>();
        boolean result = queue.isEmpty();
        queue.size();
        Assertions.assertTrue(result);
    }
}

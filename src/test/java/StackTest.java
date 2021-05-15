import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    void given3NumbersWhenAddedToStackShouldHaveLastElementAtHead() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        LNode result = stack.peek();
        Assertions.assertEquals(myThirdNode, result);
    }
}

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
        System.out.print("After Push the ");
        stack.printStack();
        stack.size();
        LNode result = stack.peek();
        Assertions.assertEquals(myThirdNode, result);
    }

    @Test
    void given3NumbersWhenDeletedFromStackShouldHaveHeadDeleted() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        LNode result = stack.pop();
        System.out.print("After Pop the ");
        stack.printStack();
        stack.size();
        Assertions.assertEquals(myThirdNode, result);
    }

    @Test
    void givenNoNumbersWhenEmptyStackShouldPassTest() {
        Stack<Integer> stack = new Stack<>();
        boolean result = stack.isEmpty();
        stack.size();
        Assertions.assertTrue(result);
    }
}

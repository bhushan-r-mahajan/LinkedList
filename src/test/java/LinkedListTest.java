
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ALL")

public class LinkedListTest {
    @Test
    void given3NumbersWhenAddedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        LinkedList list = new LinkedList();
        list.add(myFirstNode);
        list.add(mySecondNode);
        list.add(myThirdNode);
        System.out.print("---> When Added the ");
        list.printList();
        boolean result = list.head.equals(myThirdNode) &&
                         list.head.getNext().equals(mySecondNode) &&
                         list.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given3NumbersWhenAppendedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        System.out.print("---> When Appended the ");
        list.printList();
        boolean result = list.head.equals(myFirstNode) &&
                         list.head.getNext().equals(mySecondNode) &&
                         list.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given1NumberWhenInsertedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(myThirdNode);
        list.printList();
        list.insert(mySecondNode, myFirstNode);
        System.out.print("When 30 is Inserted the ");
        list.printList();
        boolean result = list.head.equals(myFirstNode) &&
                         list.head.getNext().equals(mySecondNode) &&
                         list.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given4NumbersWhenInsertedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myFourthNode);
        list.printList();
        list.insert(myThirdNode, mySecondNode);
        System.out.print("When 40 is Inserted the ");
        list.printList();
        boolean result = list.head.equals(myFirstNode) &&
                         list.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given3NumbersWhenPopHeadPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        list.printList();
        list.popHead();
        System.out.print("When 56 is Deleted the ");
        list.printList();
        boolean result = list.head.equals(mySecondNode) &&
                         list.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given3NumbersWhenPopTailPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        list.printList();
        list.popTail();
        System.out.print("When 70 is Deleted the ");
        list.printList();
        boolean result = list.head.equals(myFirstNode) &&
                         list.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    void givenNumberWhenSearchedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        LNode result = list.searchList(30);
        Assertions.assertEquals(result, mySecondNode);
    }

    @Test
    void given4NumbersWhenDeletedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        list.append(myFourthNode);
        list.printList();
        list.remove(40);
        System.out.print("When 40 is Deleted the ");
        list.printList();
        list.getSize();
        boolean result = list.head.equals(myFirstNode) &&
                         list.head.getNext().equals(mySecondNode) &&
                         list.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

    @Test
    void given5NumbersWhenDeletedPassesLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(60);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyNode<Integer> myFifthNode = new MyNode<>(70);
        LinkedList list = new LinkedList();
        list.append(myFirstNode);
        list.append(mySecondNode);
        list.append(myThirdNode);
        list.append(myFourthNode);
        list.append(myFifthNode);
        list.printList();
        list.remove(60);
        System.out.print("When 60 is Deleted the ");
        list.printList();
        list.getSize();
        boolean result = list.head.equals(myFirstNode) &&
                         list.head.getNext().equals(mySecondNode) &&
                         list.tail.equals(myFifthNode);
        Assertions.assertTrue(result);
    }
}

public class BinaryTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {

        if(current == null) {
            return new BinaryNode<>(key);
        }
        int result = key.compareTo(current.key);
        if(result == 0) {
            return current;
        }
        if(result < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int size() {
        System.out.println("The Size of Binary Tree is: " + getSize(root));
        return this.getSize(root);
    }

    private int getSize(BinaryNode<K> current) {
        return current == null ? 0 : 1 + getSize(current.left) + getSize(current.right);
    }

    public boolean search(K key) {
        System.out.println("Searching for element: " + key);
        BinaryNode<K> current = this.root;
        if(current == null){
            System.out.println("Element Not Found because tree is empty!!");
            return false;
        }
        while(current.key != key){
            int result = key.compareTo(current.key);
            if(result < 0){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        System.out.println("The Searched Element Is Found Successfully!!");
        return true;
    }
}

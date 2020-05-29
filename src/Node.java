/**
 * Class that represents an element from the list
 */
public class Node {
    private int data;
    private Node next;

    /**
     * Creates a new Node object
     * @param data The value that the new Node will 
     */
    public Node (int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * The getter for the value of the Node
     * @return An integer which is the value of the node
     */
    public int getData() {
        return this.data;
    }

    /**
     * The getter for the next Node pointer
     * @return A Node object, which is the next pointer
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * A method that sets the pointed of the next Node
     * @param next the node that we want to set the pointer to
     */
    public void setNext(Node next) {
        this.next = next;
    }
}


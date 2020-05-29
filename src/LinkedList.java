/**
 * A class that represents a linked list
 */
public class LinkedList {
    Node head;
    int length;

    /**
     * Adds a new element to the back of the list
     * @param data The value of the new Node
     */
    public void append(int data){
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
        this.length++;
    }

    /**
     * Prints the list in an organized way
     */
    public void printList() {
        StringBuilder list = new StringBuilder("[");
        Node tmp = this.head;
        while (tmp != null) {
            list.append(tmp.getData());
            if (tmp.getNext() != null) {
                list.append(", ");
            }
            tmp = tmp.getNext();
        }
        list.append("]");
        System.out.println(list);
    }

    /**
     * Removes a Node from the list if its value is equal to the data parameter
     * @param data The value that will be compared with each Node in the list
     */
    public void remove(int data){
        if (data == this.head.getData()) {
            this.head = this.head.getNext();
            this.length--;
        }
        else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                if (data == tmp.getNext().getData()) {
                    tmp.setNext(tmp.getNext().getNext());
                    this.length--;
                }
                else {
                    tmp = tmp.getNext();
                }
            }
        }
    }

    /**
     * Gets the average of the data attributes of all the Nodes in the list
     * @return An integer which is the calculated average
     */
    public int getNumAverage() {
        int sum = 0;
        Node tmp = this.head;
        while (tmp.getNext() != null) {
            sum += tmp.getData();
            tmp = tmp.getNext();
        }
        return sum / this.length;
    }

    /**
     * A method that checks the list and uses getNumAverage to remove numbers that
     * are higher than the average
     */
    public void removeHigher() {
        int average = this.getNumAverage();
        Node tmp = this.head;
        while (tmp != null) {
            if (tmp.getData() > average) {
                remove(tmp.getData());
            }
            tmp = tmp.getNext();
        }
    }

    /**
     * A method that checks the list and makes a sum of all values in even spaces
     * @return an int that is a sum of numbers in even spaces
     */
    public int sumEven() {
        int sum = 0;
        Node tmp = this.head;
        for(int i = 0; i < this.length ; i++){
            if (i % 2 == 0){
                sum += tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return sum;
    }

    /**
     * A method that checks the list and multiplies only the values in odd spaces
     * @return an int that is a multiplication of odd spaces
     */
    public int multOdd(){
        int mult = 1;
        Node tmp = this.head;
        for (int i = 0; i < this.length ; i++) {
            if(i % 2 != 0){
                mult *= tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return mult;
    }

    /**
     * Print method for operations
     */
    public void operations(){
        System.out.println("Sum of even positions: " + this.sumEven()+"\n");
        System.out.println("Multiplication of odd positions: " + this.multOdd()+"\n");
    }

    /**
     * checks list and compares each number with the next one
     * @return an int with the highest number on the list
     */
    public int highestNumber() {
        int highest = this.head.getData();
        Node tmp = this.head.getNext();
        for (int i = 0; i < this.length - 1; i++) {
            if (highest < tmp.getData()) {
                highest = tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return highest;
    }

    /**
     * checks list and compares each number with the next one
     * @return an int with the lowest number in the list
     */
    public int lowestNumber() {
        int lowest = this.head.getData();
        Node tmp = this.head.getNext();
        for (int i = 0; i < this.length -1; i++) {
            if (lowest > tmp.getData()){
                lowest = tmp.getData();
            }
            tmp = tmp.getNext();
        }
        return lowest;
    }

    /**
     *Print method for highest and lowest number
     */
    public void highAndLow() {
        System.out.println("This is the highest value: " + this.highestNumber() + "\n");
        System.out.println("This is the lowest value: " + this.lowestNumber() + "\n");
    }

    /**
     * Method used to create new nodes, that are a sum of every two nodes
     */
    public void insertSum() {
        Node tmp = this.head;
        for (int i = 0; i < this.length /2; i++){
                int sum = tmp.getData() + tmp.getNext().getData();
                Node prev = tmp.getNext();
                Node next = tmp.getNext().getNext();
                Node newNode = new Node(sum);
                newNode.setNext(next);
                prev.setNext(newNode);
                tmp = newNode.getNext();
        }
    }
}

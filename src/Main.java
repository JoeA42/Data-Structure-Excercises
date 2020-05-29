/**
 * This class runs the code
 */
public class Main {
    public static void main(String[] args){

        LinkedList list1 = new LinkedList();

        list1.append(4);
        list1.append(5);
        list1.append(3);
        list1.append(8);
        list1.append(3);
        list1.append(2);
        list1.append(9);
        list1.append(2);

        System.out.println("Full list: ");
        list1.printList();
        System.out.println("\n");

        System.out.println("Exercise #1");
        System.out.println("Average: " + list1.getNumAverage());
        System.out.println("List with numbers lower than the average: ");
        list1.removeHigher();
        list1.printList();
        System.out.println("\n");

        System.out.println("Exercise #2");
        list1.operations();
        System.out.println("\n");

        System.out.println("Exercise #3");
        list1.insertSum();
        list1.printList();
        System.out.println("\n");

        System.out.println("Exercise #4");
        list1.highAndLow();

    }

}

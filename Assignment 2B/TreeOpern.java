import java.util.Scanner;
import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        System.out.println("TreeSet elements: " + treeSet);

        System.out.print("Enter a number to search in the TreeSet: ");
        int searchNumber = input.nextInt();

        if (treeSet.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the TreeSet.");
        } else {
            System.out.println(searchNumber + " is not present in the TreeSet.");
        }


        // ye waala remove karne ke liye use hua hai
        System.out.print("Enter an element to remove from the TreeSet: ");
        int removeNumber = input.nextInt();

        if (treeSet.remove(removeNumber)) {
            System.out.println(removeNumber + " removed successfully from the TreeSet.");
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println(removeNumber + " is not present in the TreeSet.");
        }

        input.close();
    }
}

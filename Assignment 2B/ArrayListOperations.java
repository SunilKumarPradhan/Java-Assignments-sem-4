import java.util.*;
class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // ye element add karta hai 
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // ye elements display karta hai
        System.out.println("List: " + list);

        // ye koi bhi element ka existence show karta hai
        System.out.print("Enter a number to search in the list: ");
        int num = sc.nextInt();
        if (list.contains(num)) {
            System.out.println(num + " is present in the list.");
        } else {
            System.out.println(num + " is not present in the list.");
        }

        // Remove an element from the list
        System.out.print("Enter the position of element to remove: ");
        int pos = sc.nextInt();
        if (pos >= 0 && pos < list.size()) {
            list.remove(pos);
            System.out.println("Element removed from position " + pos);
            System.out.println("List after removing element: " + list);
        } else {
            System.out.println("Invalid position entered.");
        }

        // Check if the list is empty
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
    sc.close();
    }
}

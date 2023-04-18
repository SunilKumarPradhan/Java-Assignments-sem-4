import java.util.*;

 class NoDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        Set<Integer> set = new HashSet<>();

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            set.add(num);
        }

        System.out.println("Elements in the set: " + set);
    
        input.close();
    }
    
}

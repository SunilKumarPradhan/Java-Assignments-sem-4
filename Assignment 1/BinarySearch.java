import java.util.*;

class Sub {
     
    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array you want : ");
        int size = sc.nextInt();
        int[] arr = new int[size]; // create an array with the given size
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element for array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search : ");
        key = sc.nextInt();
        
        // sort the array in ascending order
        Arrays.sort(arr);
        
        // define start and end indices
        int start = 0;
        int end = size - 1;
        
        // perform binary search
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                return; // exit the program after finding the element
            }
            else if (arr[mid] < key) {
                start = mid + 1; // search in the right half
            }
            else {
                end = mid - 1; // search in the left half
            }
        }
        
        System.out.println("Element is not found!");
    }
}


import java.util.*;

class SmallestPositiveMissingNumber {
    public static int findSmallestPositiveMissingNumber(int[] arr) {
        // Create a hash table to store the presence of each element in the array
        Map<Integer, Boolean> presence = new HashMap<>();

        
        for (int i = 0; i < arr.length; i++) {
            presence.put(arr[i], true);
        }
        
        // Check each positive integer from 1 onwards until we find one that is missing
        int smallestMissing = 1;
        while (presence.containsKey(smallestMissing)) {
            smallestMissing++;
        }
        
        return smallestMissing;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int smallestMissing = findSmallestPositiveMissingNumber(arr);
        System.out.println("The smallest positive number missing is: " + smallestMissing);
    }
}

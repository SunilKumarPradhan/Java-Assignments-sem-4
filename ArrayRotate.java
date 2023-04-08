public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
            // ek temporary array mein , first "k" elements tak ke value store kar kiya .
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // ye loop array ko print karne ke liye hai
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// This is a Java program that demonstrates how to rotate an array to the right by a given number of positions using a temporary array.

// The program starts by defining an array arr with some initial values, and a variable k which specifies the number of positions to rotate the array by.

// Next, a temporary array temp is defined with a length of k, to store the first k elements of the original array. The first for loop copies the first k elements of the arr to temp array.

// The second for loop then shifts the remaining elements of arr to the left by k positions, effectively removing the first k elements from the start of the array.

// Finally, the third for loop inserts the elements from the temporary array temp to the end of the arr array.

// After completing the rotations, the last for loop simply prints the resulting array.

// Overall, this program rotates the elements of an array to the right by a given number of positions, by temporarily storing the first k elements in a separate array and then moving the remaining elements to the left. It then appends the stored elements to the end of the original array.

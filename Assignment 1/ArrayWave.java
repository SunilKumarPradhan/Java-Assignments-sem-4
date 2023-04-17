import java.util.Arrays;

 class WavelikeArray{
    public static void WaveArray(int[] arr) { 
        int size = arr.length; 
        Arrays.sort(arr); // using built-in method for sorting array
        for (int i = 1; i < size - 1; i += 2) {
            // Swap adjacent elements in array 
            int temp = arr[i]; 
            arr[i] = arr[i + 1]; 
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        WaveArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

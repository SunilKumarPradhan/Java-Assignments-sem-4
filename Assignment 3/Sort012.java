class Sort{
    public static int partition01(int[] arr, int size) {
        int leftIndex = 0;
        int rightIndex = size - 1;
        int count = 0;
        
        while (leftIndex < rightIndex) {
            while (arr[leftIndex] == 0 && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (arr[rightIndex] == 1 && leftIndex < rightIndex) {
                rightIndex--;
            }
            swap(arr, leftIndex++, rightIndex--);
            count++;
        }
        
        return count;
    }
    
    // Helper method to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Helper method to print the elements of an array
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Testing code
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        partition01(arr, arr.length);
        printArray(arr, arr.length);
    }
    
}

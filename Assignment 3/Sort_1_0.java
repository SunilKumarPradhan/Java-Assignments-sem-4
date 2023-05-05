// write a java code to sort 0 and 1 in an array and find mininum number of swaps required to sort the array
class sort {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println("Minimum number of swaps required to sort the array: " + count);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
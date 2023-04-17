// write a program to arrange a sorted array in max min form
class ArrayMaxMin  {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int[] maxMinArr = new int[n];
        
        int maxIndex = n - 1;
        int minIndex = 0;

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                maxMinArr[i] = arr[maxIndex--];
            } else {
                maxMinArr[i] = arr[minIndex++];
            }
            flag = !flag;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(maxMinArr[i] + " ");
        }
    }
}

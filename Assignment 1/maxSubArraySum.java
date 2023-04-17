class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -4, 6, -4, 3, 2};
        int n = arr.length;
        int currentMaxSum = 0;
        int largestMaxSum = 0;

        for (int i = 0; i < n; i++) {
            currentMaxSum = currentMaxSum + arr[i];
            if (currentMaxSum < 0) {
                currentMaxSum = 0;
            }
            if (largestMaxSum < currentMaxSum) {
                largestMaxSum = currentMaxSum;
            }
        }
        System.out.println(largestMaxSum);
    }
}

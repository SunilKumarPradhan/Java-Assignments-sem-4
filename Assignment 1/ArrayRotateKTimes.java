class Rot {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int n = a.length;
        int k = 3;
        
        System.out.println("Before rotation:");
        printArray(a);
        
        ArrayRotateKTimes(a, n, k);
        
        System.out.println("After rotation:");
        printArray(a);
    }
    
    public static void ArrayRotateKTimes(int[] a, int n, int k) { 
        reverseArray(a, 0, k - 1); 
        reverseArray(a, k, n - 1);
        reverseArray(a, 0, n - 1); 
    } 

    public static void reverseArray(int[] a, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = a[i];
             a[i] = a[j]; 
             a[j] = temp;
        }
    } 
    
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

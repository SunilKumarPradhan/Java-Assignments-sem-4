// Write a program to find gcd of two numbers using recursion
class GCDofTwoNumbersUsingRecursion {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(gcd(a, b));
    }
}

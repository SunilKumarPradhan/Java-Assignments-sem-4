import java.util.*;
public class PrimeNum{
public static void main(String[] args) {

    int n, counter=0; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            counter++;
        }
        sc.close();
    }

    if (counter==2)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number."); 
  }
  
}
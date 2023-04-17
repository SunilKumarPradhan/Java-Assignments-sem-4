import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class rev{
  public static void main(String[] args) {
    int n, rev=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = sc.nextInt();

    Queue<Integer> digitsQueue = new LinkedList<Integer>();

    while(n>0){
      digitsQueue.add(n%10);
      n=n/10;
    }

    while(!digitsQueue.isEmpty()){
      rev = rev*10 + digitsQueue.remove();
    }

    System.out.println("Reverse of the number is: " + rev);
    sc.close();
  }
  
} 

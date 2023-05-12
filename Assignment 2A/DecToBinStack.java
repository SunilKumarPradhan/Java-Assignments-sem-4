import java.util.Scanner;
import java.util.Stack;
class bin { 
     public static void main(String[] args) {
           
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();
    
            
            Stack<Integer> binaryStack = new Stack<>();

            while (decimal > 0) {
                int remainder = decimal % 2;
                binaryStack.push(remainder);
                decimal = decimal / 2;
            }
    
            System.out.print("Binary representation of the given number is: ");
            while (!binaryStack.isEmpty()) {
                System.out.print(binaryStack.pop());
                input.close();
            }
        }
    }
    
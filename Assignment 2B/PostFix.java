/*Write a java program to evaluate a postfix expression using Stack
*/
import java.util.*;
class PostFix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression: ");
        String exp = sc.next();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }
            else{
                int op2 = stack.pop();
                int op1 = stack.pop();
                int res = 0;
                switch(ch){
                    case '+':
                        res = op1 + op2;
                        break;
                    case '-':
                        res = op1 - op2;
                        break;
                    case '*':
                        res = op1 * op2;
                        break;
                    case '/':
                        res = op1 / op2;
                        break;
                    case '%':
                        res = op1 % op2;
                        break;
                }
                stack.push(res);
            }
        }
        System.out.println("Result: " + stack.pop());
    }
}
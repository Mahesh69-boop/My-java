package Stacks;
import java.util.Stack;
public class Operator {
   static public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If current character is a digit, build the current number
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }
            
            // If current character is an operator or the last character in the string
            if (!Character.isDigit(currentChar) && currentChar != ' ' || i == s.length() - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);  // push positive number
                } else if (operation == '-') {
                    stack.push(-currentNumber);  // push negative number
                } else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);  // pop and multiply
                } else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);  // pop and divide (integer division)
                }
                // Reset current number and update the operation
                currentNumber = 0;
                operation = currentChar;
            }
        }
        
        // Sum up all the elements in the stack to get the final result
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        
        return result;
    }
    public static void main(String[] args) {
        String mahesh ="3+2*2" ;
        System.out.println(calculate(mahesh));
    }
    
    
}

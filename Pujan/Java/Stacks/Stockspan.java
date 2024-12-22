package Stacks;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class Stockspan {
    static int[] span(int[]arr){
        int len = arr.length;
        int[] span = new int[len]; // Array to hold span values
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < len; i++) {
            // Pop elements from the stack while the stack is not empty and the current price is greater than the price at the index on top of the stack
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            // If the stack is empty, it means there's no greater price to the left
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i); // Push the current index onto the stack
        }
        
        return span; // Return the calculated span array

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of your Days");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " stocks for " + len + " days");

        for (int a = 0; a < len; a++) {
            arr[a] = sc.nextInt(); // Read stock prices
        }
        
        System.out.println("You entered the following Stocks for days:");
        System.out.println(Arrays.toString(arr)); // Print the stock prices
        
        System.out.println("The Span of each day is:");
        System.out.println(Arrays.toString(span(arr))); // Print the calculated spans
    }
    }


    

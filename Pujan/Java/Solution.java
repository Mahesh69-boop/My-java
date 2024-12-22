import java.util.Stack;
public class Solution {
    public static String decodeString(String s) {
        Stack<String> mahesh = new Stack<>();
        Stack<Integer> Pujan = new Stack<>();
        int currentNumber = 0;
        StringBuilder currentString = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
               
                currentNumber = currentNumber * 10 + (ch - '0');
            } else if (ch == '[') {
                
                mahesh.push(currentString.toString());
                Pujan.push(currentNumber);
               
                currentString.setLength(0);
                currentNumber = 0; 
            } else if (ch == ']') {
                String prevString = mahesh.pop();
                int repeatCount = Pujan.pop();
                StringBuilder newString = new StringBuilder(prevString);
               
                for (int i = 0; i < repeatCount; i++) {
                    newString.append(currentString);
                }
                currentString = newString;
            } else {
                
                currentString.append(ch);
            }
        }
        return currentString.toString();

        }
        public static void main(String[] args) {
            String s= "4[er]6[rt]";
            System.out.println("The string is " + decodeString(s));
        }
}
            
import java.util.Scanner;

public class jj {
   public static void main(String[] args) {
      Scanner SC = new Scanner(System.in);
      
      // Read the number of words
      int first = SC.nextInt();
      SC.nextLine(); // Consume the leftover newline
      
      // Declare the array to store words
      String[] Arr = new String[first];
      
      // Read the words into the array
      for (int i = 0; i < first; i++) {
         Arr[i] = SC.nextLine();
      }
      
      // Read the character
      char A = SC.nextLine().charAt(0);
      
      // Filter and print words containing the character
      for (String C : Arr) {
         if (C.contains(Character.toString(A))) {
            System.out.print(C + ",");
         }
      }
      
      // Add a newline to the output
      System.out.println();
   }
}

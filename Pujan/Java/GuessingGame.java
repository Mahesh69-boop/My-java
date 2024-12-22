import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    
    public static void Guess(int a){
        int correctGuess=0;
        Random rand= new Random();
        int randNum= rand.nextInt(6)+1;
            if(randNum==a){
                System.out.println("Cogralutaions! You got this correct");
                correctGuess++;
            }
            else{
                System.out.println("Oops! The autual number is " + randNum + ", not " + a);
        }
        System.out.println("The total no of correct guess is " + correctGuess);
        
       }
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your Guess:");
        int a=sc.nextInt();
        Guess(a);
        System.out.println("Enter the Second Guess");
        int b=sc.nextInt();
        Guess(b);
        System.out.println("Enter the second Guess");
        int c=sc.nextInt();
        Guess(c);
       
       }
}

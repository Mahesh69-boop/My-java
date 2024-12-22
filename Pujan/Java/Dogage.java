import java.util.Scanner;
public class Dogage {
    //Ask user to enter dog’s age;
    // Accept user input and store the dog’s age;
   //Convert dog age to human age by multiplying the factor 7;
   //Display the dog age and corresponding human age
    public static void main(String[] args) {
        Scanner dog=new Scanner(System.in);
        System.out.println("Enter dog's age :");
        int Dog=dog.nextInt();
        int DogAge = Dog*7;
        System.err.printf("%d years old Dog is %d years old in Human",Dog,DogAge);

    }
    
}

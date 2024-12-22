import java.util.Scanner;
public class gradeClassifier {
    public static void grader(int A){
        if(A>=0 && A<60){
            System.out.println("Your Grade is E");
        }
        else if(A>=60 && A<70){
            System.out.println("Your Grade is D");
        }
        else if(A>=70 && A<80){
            System.out.println("Your Grade is C");      
        }
        else if(A>=80 && A<90){
            System.out.println("Your Grade is B");
        }
        else if(A>=90 && A<=100){
            System.out.println("Your Grade is A");
        }
        else{
            System.out.println("Invalid score! Try again");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your Score ");
        int Score=sc.nextInt();
        grader(Score); 
    }  
}

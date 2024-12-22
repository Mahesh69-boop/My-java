import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String response =" ";
        do{
            response= sc.nextLine();
            if(response.equals("Q"))
            break;
            System.out.println("Yes!");
        }while(true);
        System.out.println("Quit!");
        
    }
}

import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name (END TO QUIT)");
        String Name= "";
        while(true){
            Name= sc .nextLine();
            if(Name.equals("END")){
                System.out.println("I am Done");
                break;
            }
            System.out.println(Name);
            System.out.println("");
        }

    }
    
}

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        String fullName="",firstName="",MiddleName="",lastName="";
        System.out.println("Enter Your Full name :");
        fullName=Sc.nextLine();
        
        
        int idx = fullName.indexOf(" ");
        int idx2=fullName.indexOf(" ",idx+1);

       
        firstName= fullName.substring(0,idx);
        MiddleName=fullName.substring(idx+1,idx2);
        lastName= fullName.substring(idx2+1);
        System.out.println("The full name of the User is : " + fullName);
        System.out.println("First name is : " + firstName);
        System.out.println("The Middel name is : " + MiddleName);
        System.out.println("Last name is : " + lastName);
    }
    
}
    


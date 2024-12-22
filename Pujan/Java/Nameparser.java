import java.util.Scanner;
public class Nameparser {
    public static void main(String[] args) {
        // variable Declaration
        Scanner Sc=new Scanner(System.in);
        String fullName="",firstName="",lastName="";
        int idx=-1;
        // Take User Input
        System.out.println("Enter Your Full name :");
        fullName=Sc.nextLine();
        // Split fullname into firstname and lastname
        // s1:Use indexof() to find out the index number of emptyspace
        // Alex Johnson
        idx = fullName.indexOf(" ");
        // s2: using substring() to retrive the Firstname, and lastname, seperately
        firstName= fullName.substring(0,idx);
        lastName= fullName.substring(idx+1);
        System.out.println("The full name of the User is : " + fullName);
        System.out.println("First name is : " + firstName);
        System.out.println("Last name is : " + lastName);
    }
    
}

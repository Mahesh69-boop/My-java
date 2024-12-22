import java.util.Scanner;
public class Firstlast {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an String !");
        String Word=sc.nextLine();
        if(Character.toLowerCase(Word.charAt(0))==Character.toLowerCase(Word.charAt(Word.length()-1))){
            System.out.println("The First Character and the last Character are Same");
        }
        else{
            System.out.println("The First Character and the last Character are not Same");
        }
    }

    
}

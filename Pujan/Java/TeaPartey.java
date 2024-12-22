import java.util.Scanner;
public class TeaPartey {
    public static void main(String[] args) {
        Scanner T=new Scanner(System.in);
        System.out.println("Enter the Number of Tea");
        int Tea=T.nextInt();
        Scanner C=new Scanner(System.in);
        System.out.println("Enter the Number of Candy ");
        int candey=C.nextInt();
        if(candey<5||Tea<5){
            System.out.println("Opps !, The partey is Bad");
        }
        else if((Tea>=candey*2 && Tea>5) || (candey>=Tea*2 && candey>5)){
            System.out.println("Wow!, The party was Great");
        }
        else if(candey>=5 && Tea>=5){
            System.out.println("Yeah! , the party was good");
        }
       
       
    }
    
}

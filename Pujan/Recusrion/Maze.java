import java.util.Scanner;
public class Maze {
    public static int Maze(int cr, int cc,int er, int ec){
        int rightways=0;
        int downways=0;
        if(cr==er && cc==ec){
            return 1;
        }
        if(cr==er){
            rightways+=Maze(cr,cc+1,er,ec);
        }
        if(cc==ec){
            downways+=Maze(cr+1,cc,er,ec);
        }
        if(cr<er && cc<ec){
            rightways+=Maze(cr,cc+1,er,ec);
            downways+=Maze(cr+1,cc,er,ec);
        }
        int Totalways=rightways+downways;
        return Totalways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int rows=sc.nextInt();
        Scanner sa=new Scanner(System.in);
        System.out.println("Enyer the number of columns : ");
        int columns=sa.nextInt();
        int cr=1;
        int cc=1;
        System.out.println("The Number of ways = " + Maze(cr,cc,rows,columns));
    }
    
}

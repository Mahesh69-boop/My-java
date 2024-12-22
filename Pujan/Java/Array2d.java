import java.util.Random;
public class Array2d{
    public static void main(String[] args) {
        int row= 8;
        int column = 8;
        int Boundry= 10;
        int[][] arr2D= new int[row][column];
        Random rand = new Random();
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr2D[i][j]=rand.nextInt(Boundry);
            }


        }
        
        for(int i=0; i<row; i++){
            int Sum =0;
            for(int j=0; j<column; j++){
                Sum+=arr2D[i][j];
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.printf("| Row sum: %d row Average: %.2f\n", Sum,(double)Sum/column);
        }

    }

}
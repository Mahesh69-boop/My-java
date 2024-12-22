import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GeneScanner{
    public static void main(String[] args) {
        try{
            File file = new File("/Users/maheshbhandari/Documents/Hello World/Pujan/Java/gene.fasta");
            Scanner sc = new Scanner(file);
            System.out.println("File Information " + sc.nextLine());
            int A=0, C=0, T=0, G=0, Total =0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                for(int i =0; i<line.length(); i++){
                    if(line.charAt(i)=='A')A++;
                    else if(line.charAt(i)=='C')C++;
                    else if(line.charAt(i)=='T')T++;
                    else if(line.charAt(i)=='G')G++;
                   
                }
            }
            Total = A+C+T+G;
            System.out.println("Relative Frequency of genes :");
            System.out.printf("Percentage of A: %.2f%%\n ",A*100.0/Total);
            System.out.printf("Percentage of C: %.2f%%\n ",C*100.0/Total);
            System.out.printf("Percentage of T: %.2f%%\n ",T*100.0/Total);
            System.out.printf("Percentage of G: %.2f%%\n ",G*100.0/Total);
            System.out.printf("Total  NUmber of Nucleoties is %d\n",Total);
                

        }catch (FileNotFoundException e){
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
    
       
        
        
    }
}

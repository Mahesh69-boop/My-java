import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrafficAnalysis {
    public static void main(String[] args) {
        int[][] arr = new int[13][2]; 

        try {
           
            File file = new File("/Users/maheshbhandari/Downloads/traffic.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                String[] parts = line.split("\\s+");
                int intersectionId = Integer.parseInt(parts[0]); 
                int time = Integer.parseInt(parts[1]); 
               arr[intersectionId][0]++;
               if(time>500){
                arr[intersectionId][1]++;
               }
            }
            scanner.close();

            System.out.printf("%-15s %-15s %-15s %-15s\n", "Intersection", "Vehicles", "Accidents", "Accident Rate");
            System.out.println("------------------------------------------------------------");
            int max=Integer.MIN_VALUE;
            double maxRatio = (double)Integer.MIN_VALUE;
            for (int a = 0; a < 12; a++) {
                System.out.printf("%-18d%-16d%-15d%-15.3f\n", a, arr[a][0], arr[a][1], (double)arr[a][1]/arr[a][0] );
                if(arr[a][1]>max){
                    max=arr[a][1];
                }
                if((double)arr[a][1]/arr[a][0]>maxRatio){
                    maxRatio=(double)arr[a][1]/arr[a][0];
                }
            }
            System.out.println();
            System.out.println("Most accidents at any intersection : " + max);
            System.out.println("Highest accident rate at any intersection : " + maxRatio);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

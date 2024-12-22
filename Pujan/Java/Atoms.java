import java.io.*;
import java.util.*;

public class Atoms {
    public static void main(String[] args) {
        final double MIN_DIS = 2.0; 
        final double MAX_DIS = 4.0; 
        try {
            
            Scanner scanner = new Scanner(new File("/Users/maheshbhandari/Downloads/ATOMS.DAT"));

            int numAtoms = Integer.parseInt(scanner.nextLine().trim());

            scanner.nextLine();

            double[] arrX = new double[numAtoms];
            double[] arrY = new double[numAtoms];
            double[] arrZ = new double[numAtoms];

            for (int i = 0; i < numAtoms; i++) {
                String[] line = scanner.nextLine().trim().split("\\s+");
                arrX[i] = Double.parseDouble(line[1]); 
                arrY[i] = Double.parseDouble(line[2]); 
                arrZ[i] = Double.parseDouble(line[3]); 
            }

            scanner.close();

            double sumDistances = 0.0;
            int count = 0;

            for (int i = 0; i < numAtoms; i++) {
                for (int j = i + 1; j < numAtoms; j++) {
                    double distance = Math.sqrt(
                        Math.pow(arrX[i] - arrX[j], 2) +
                        Math.pow(arrY[i] - arrY[j], 2) +
                        Math.pow(arrZ[i] - arrZ[j], 2)
                    );

                    if (distance >= MIN_DIS && distance <= MAX_DIS) {
                        sumDistances += distance;
                        count++;
                    }
                }
            }
            if (count > 0) {
                double averageDistance = sumDistances / count;
                System.out.printf("The average distance within range [%.1f, %.1f] is: %.4f\n",
                        MIN_DIS, MAX_DIS, averageDistance);
            } else {
                System.out.println("No distances found within the range.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File ATOMS.DAT not found.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

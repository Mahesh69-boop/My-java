import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class InstructionExtractor {
    public static void main(String[] args) {
        File inputFile = new File("/Users/maheshbhandari/Downloads/sumN.asm");
        File outputFile = new File("output.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintWriter pw = new PrintWriter(outputFile)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Process each line to extract the pure instruction
                String pureInstruction = processLine(line);

                // Write to output only if it's not empty
                if (pureInstruction != null) {
                    pw.println(pureInstruction);
                }
            }

            // Ensure the content is flushed to the file
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to process each line and return the pure instruction
    public static String processLine(String line) {
        // Step 1: Remove content after '//' for comments
        String cleanedLine = line.split("//")[0].trim();

        // Step 2: Remove content inside parentheses, including the parentheses
        cleanedLine = cleanedLine.replaceAll("\\(.*?\\)", "").trim();

        // Return the cleaned line only if it’s not empty
        return cleanedLine.isEmpty() ? null : cleanedLine;
    }
}

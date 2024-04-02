import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {

    public static void main(String[] args) {
        String filePath = "c:\\PerfLogs\\balkonda.txt"; // Replace this with the actual path to your file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t"); // Assuming the data is tab-separated
                // Process the data here, e.g., print it
                for (String datum : data) {
                    System.out.print(datum + "\t");
                }
                System.out.println(); // Move to the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

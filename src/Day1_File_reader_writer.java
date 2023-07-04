import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day1_File_reader_writer {
    public void characterHistogram(){
        // Enter the path of the file you want to read
        String filePath = "C:/Users/zenasc/Downloads/week1/Day2/tesingText1.txt ";



        // Create a map to store the frequency of each character
        Map<Character, Integer> charFreq = new HashMap<>();     //Hash map --8


        // Open the file and read it line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {    //the buffered Reader
            String line;
            while ((line = br.readLine()) != null) {
                // Process each character in the line
                for (char c : line.toCharArray()) {
                    // Update the frequency count for the current character
                    charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
                }
            }
        }
        catch (IOException IOE){
            System.out.println("error are caused");
        }

        // Print the histogram
        for (char c : charFreq.keySet()) {
            System.out.print(c + ": ");
            for (int i = 0; i < charFreq.get(c); i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

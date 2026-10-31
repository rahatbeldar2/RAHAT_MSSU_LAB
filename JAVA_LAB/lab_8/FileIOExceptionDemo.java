import java.io.*;
import java.util.Scanner;

// User-defined exception class
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

// FileHandler class
class FileHandler {
    String fileName = "student.txt";

    // Write data into the file
    public void writeToFile(String data) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(data);
            System.out.println("Data written successfully.");
        }
    }

    // Read data from the file
    public void readFromFile() throws IOException, EmptyFileException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean empty = true;

            System.out.println("\nReading file contents:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                
                // Check if the line has actual content (not just whitespace)
                if (!line.trim().isEmpty()) {
                    empty = false;
                }
            }

            // Throw exception if the file is empty
            if (empty) {
                throw new EmptyFileException("File is empty. No data available to read.");
            }
        }
    }
}

// Main class
public class FileIOExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();

        try {
            System.out.println("Enter text to write into the file:");
            String data = scanner.nextLine();

            fileHandler.writeToFile(data);
            fileHandler.readFromFile();
        } 
        catch (EmptyFileException exception) {
            System.out.println("\nError: " + exception.getMessage());
        } 
        catch (IOException exception) {
            System.out.println("\nFile I/O Error: " + exception.getMessage());
        } 
        finally {
            System.out.println("\nFile operation completed.");
            scanner.close();
        }
    }
}
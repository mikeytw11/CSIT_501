import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\lasst\\Desktop\\Coding\\Java\\CSIT 501\\Project1\\Project_M1\\src\\project1.java";

        File file = new File(fileName);

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Check if file is readable
            if (file.canRead()) {
                System.out.println("File is readable.");

                // Read the file
                try {
                    FileReader reader = new FileReader(file);
                    int character;
                    StringBuilder content = new StringBuilder();
                    while ((character = reader.read()) != -1) {
                        content.append((char) character);
                    }
                    System.out.println("File content:\n" + content.toString());
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error reading the file: " + e.getMessage());
                }
            } else {
                System.out.println("File is not readable.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
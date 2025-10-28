// Task 4: File Reader Program 
// Author: Reshma Bollagani
// Internship: Alfido Tech Java Developer
// Description:Write a Java program that reads and displays the contents of a text file, demonstrating file handling and exception handling.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4_FileReader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===================================");
        System.out.println("          File Reader");
        System.out.println("===================================");
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\n-------- File Contents --------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("-------- End of File --------");
        } 
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } 
        finally {
            try {
                if (reader != null)
                    reader.close();
                sc.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }

        System.out.println("===================================");
        System.out.println("        Program Completed");
        System.out.println("===================================");
    }
}

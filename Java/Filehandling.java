import java.io.*;
import java.util.*;

public class Filehandling{
    
    public static void main(String[] args) {

        File myfile = new File("myfile.txt");
        // 1. Create a File
        try {
            if(myfile.createNewFile()){
                System.out.println("File has been created: " +myfile.getName());
            }else{
                System.out.println("File already exist...");
            }
            
        } catch (IOException e) {
            System.out.println("An error occured while creating the file");
            
        }

        //2. Write to File..
        try {
            FileWriter write = new FileWriter("myfile.txt");
            write.write("Hello This is the simple file handing Java Program: ");
            write.close();
            System.out.println("Successfully written in the File...  :)");
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            
        }

        //3. Read from the file..
        try {
            try (FileReader reader = new FileReader("myfile.txt"); Scanner filScanner = new Scanner(reader)) {
                System.out.println("Reading the content of the file...");
                while(filScanner.hasNextLine()){
                    String data = filScanner.nextLine();
                    System.out.println(data);
                }
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        
    }
}
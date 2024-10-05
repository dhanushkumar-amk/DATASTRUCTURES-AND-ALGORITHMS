package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\file1.txt");

        boolean present = file.exists();


        // the file may created or not created so we use try catch block
        if (!present){
            try{
                boolean created = file.createNewFile();
                System.out.println("File is Created : " + created );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

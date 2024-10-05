package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;
import java.io.IOException;

public class RenameTheFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\file1.txt");

        boolean present = file.exists();


        // file creation
        if (!present){
            try {
                file.createNewFile();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }

            // then create a new file

            if (present){
              File RenameFile = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\file1.txt");
              boolean created = RenameFile.renameTo(RenameFile);
            }
            
        }
    }
}

package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;

public class FolderCreation {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\FolderDemo");

            // check if the folder is already exists or not
        boolean present = file.exists();
//        System.out.println("Folder present : " + present);

        if (!present){
            file.mkdirs();
        }
    }
}

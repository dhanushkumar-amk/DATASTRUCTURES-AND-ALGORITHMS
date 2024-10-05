package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;

public class printFileName {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\file1.txt");


        System.out.println(file.getName());

        // access modifier of the file
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());



    }
}

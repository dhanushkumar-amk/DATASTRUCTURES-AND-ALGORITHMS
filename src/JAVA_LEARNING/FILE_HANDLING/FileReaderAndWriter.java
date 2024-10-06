package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\hello.txt");

        try{
        file.createNewFile();

            FileWriter writer = new FileWriter(file);
            writer.write(7080);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

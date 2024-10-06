package JAVA_LEARNING.FILE_HANDLING;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReaderWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\hello.txt");

        FileReader fWriter;
        try {
            fWriter = new FileReader(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

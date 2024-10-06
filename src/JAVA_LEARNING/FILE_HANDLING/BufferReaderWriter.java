package JAVA_LEARNING.FILE_HANDLING;

import java.io.*;

public class BufferReaderWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\hello.txt");

        FileWriter fWriter;
        try {
            fWriter = new FileWriter(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("Hi am dhanushkumar");
            bWriter.flush();
//            bWriter.close();
            bWriter.newLine();
            bWriter.write("Hello world");
            bWriter.flush();
            bWriter.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\hello.txt");

        try{
        file.createNewFile();

            FileWriter writer = new FileWriter(file, true);
            writer.write("hello world \n welcome to the world");// there is a one disadvantage iis we use manually escape sequence
            writer.flush();   // to push the content into the file
            writer.close();


            FileReader fileReader = new FileReader(file);
            int output = fileReader.read();  // it will return -1 whenever it completes the reading the file
            while (output != -1) {
                System.out.print((char)output);
                output = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

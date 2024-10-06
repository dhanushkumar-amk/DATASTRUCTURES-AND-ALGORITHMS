package JAVA_LEARNING.FILE_HANDLING.FolderDemo;

import java.io.*;

public class Merge2Files {
    public static void main(String[] args) throws IOException {


        FileReader Freader1 = new FileReader("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\FolderDemo\\text1.txt");
        FileReader Freader2 = new FileReader("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\FolderDemo\\text2.txt");

        BufferedReader Breader1 = new BufferedReader(Freader1);
        BufferedReader Breader2 = new BufferedReader(Freader2);

        // merge two files using printWriter
        PrintWriter pWriter = new PrintWriter("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING\\FolderDemo\\text3.txt");

        String line1 = Breader1.readLine();
        String line2 = Breader2.readLine();

        while (line1 != null || line2 != null){
            if (line1 != null) {
                pWriter.println(line1);
                line1 =Breader1.readLine();
            }
            if (line2 != null) {
                pWriter.println(line2);
                line2 = Breader2.readLine();
            }
        }

        pWriter.close();




    }
}

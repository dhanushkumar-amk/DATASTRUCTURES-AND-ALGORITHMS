package JAVA_LEARNING;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlinginJava {
    public static void main(String[] args) {

//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter the something... : ");
//            int letters = isr.read();
//
//            while (isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//
////            isr.close();
//            System.out.println();
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());;
//        }

// read the elements from the file
        try(FileReader fr = new FileReader("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\note.txt")){
            int letters = fr.read();
            while (fr.ready()){
                System.out.print((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


       try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           System.out.println("you typed :" + br.readLine());
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }



    }


}

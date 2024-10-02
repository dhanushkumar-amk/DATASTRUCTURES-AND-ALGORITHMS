package JAVA_LEARNING;

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


        try(FileReader fr = new FileReader("note")){
            int letters = fr.read();

            while (fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }

//            isr.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }



    }


}

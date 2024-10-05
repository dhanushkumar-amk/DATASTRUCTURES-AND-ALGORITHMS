package JAVA_LEARNING.FILE_HANDLING;

import java.io.File;

public class ListTheFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp5cd\\OneDrive\\Documents\\DATASTRUCTURES-AND-ALGORITHMS\\src\\JAVA_LEARNING\\FILE_HANDLING");

//       String[] listOfFiles =  file.list();

//        for (int i = 0; i <listOfFiles.length ; i++)
//            System.out.println(listOfFiles[i]);
//

        File[] fileFolderList = file.listFiles();

        // print only files
//        for(File f : fileFolderList)
//            if (f.isFile())
//                System.out.println(f);


        // print only folders
//        for(File f : fileFolderList)
//            if (file.isDirectory())
//                System.out.println(f);


    // print only specific files

        for(File f : fileFolderList) {
            if (f.isFile()) {
                String fileName = f.getName();
                int lastDot = fileName.lastIndexOf(".");
                String extensionOfFileName = fileName.substring(lastDot + 1);
            // System.out.println(extensionOfFileName);

                if (extensionOfFileName.equals("txt"))
                    System.out.println(fileName);


            }
        }
    }
}

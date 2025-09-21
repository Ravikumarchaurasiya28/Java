import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //Creating a new file.
//        File file = new File( "file.txt");
//        try {
//            file.createNewFile();
//        }
//        catch(IOException e) {
//            System.out.println("Unable to create file due to:");
//            System.out.println(e);
//        }
        //Writing something...
//        try {
//            FileWriter fwrt = new FileWriter("file.txt");
//            fwrt.write("This is my first file handling code");
//            fwrt.close();
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }
        //Reading file
//        File file = new File("file.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //Deleting a file
        File file = new File("file.txt");
        if(file.delete()) System.out.println("I have deleted the file " + file.getName());
        else System.out.println("Some error occured");
    }
}
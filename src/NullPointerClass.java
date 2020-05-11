
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class NullPointerClass {

    public static boolean readFromExistFile(File filename){
        // checking on my own if the object is null by the boolean function that check if its null or not
        if(filename== null){
            System.out.println("the file does not exist");
            return false;
        }
        else{
            System.out.println("the file exist");
            return true;
        }


    }

    public static  void comperFile(File file1, File file2){
        if(readFromExistFile(file1)&&readFromExistFile(file2)){
            System.out.println("both files  exist and can be compered");
            System.out.println("comper: "+file1.compareTo(file2));
        }
        else{
            System.out.println("one or more of the files dose not exist therefor they cant be compered");
        }

    }




    public static void main(String[] args) {
        File myfile= new File("Yana.txt");
        File myfile2= null;
        readFromExistFile(myfile);
        readFromExistFile(myfile2);
        comperFile(myfile, myfile2);
    }



}

package hust.soict.globalict.garbage;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class GarbageCreator {
    public static void main(String args[]){
        try{
            File myFile = new File("D:/garbage.txt");
            Scanner myReader = new Scanner(myFile);
            String data="";
            StringBuilder sb= new StringBuilder()
            while(myReader.hasNextLine()){
                data += myReader.nextLine();
                sb.append(myReader.nextLine());
            }
           
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured");
        }
    }
}

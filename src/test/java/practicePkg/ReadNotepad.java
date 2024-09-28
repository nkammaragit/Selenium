package practicePkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReadNotepad {

	public static void main(String[] args) throws IOException{
		
	String filePath = "E:/OneDrive/Desktop/Test.txt";
	File file = new File(filePath);
	System.out.println(file.exists());
	
	BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
	writer.write("Hello, World!");
    writer.newLine();
    writer.write("This is a simple text file.");
    writer.newLine();
    writer.write("Enjoy learning Java!");
    System.out.println("Data has been written to the file.");
    
//    BufferedReader reader = new BufferedReader(new FileReader(filePath));
//    while(reader.readLine()!=null) {
//    	System.out.println(reader.readLine());
//    }

	}

}

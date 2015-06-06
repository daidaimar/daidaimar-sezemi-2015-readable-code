import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args){
		try{
			File file = new File("recipe-data.txt");
			FileReader filereader = new FileReader(file);
			
			int ch;
			  while((ch = filereader.read()) != -1){
			    System.out.print((char)ch);
			  }
			filereader.close();
			  
			}catch(FileNotFoundException e){
			  System.out.println(e);
			}catch(IOException e){
			  System.out.println(e);
			}
	}
}
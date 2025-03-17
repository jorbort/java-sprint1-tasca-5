package lvl1.ex04;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cat {

	public  Cat(){}
	public void readFile(String path){
		try{
			File file = new File(path);
			Scanner reader = new Scanner(file); 
			while(reader.hasNextLine()){
				System.out.println(reader.nextLine());
			}
			reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

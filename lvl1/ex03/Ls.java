package lvl1.ex03;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ls {
	public void ls(){}
	
	public void listDirectory(String path){
		File directory = new File(path);
		if(directory.isDirectory()){
			String[] contents = directory.list();
			if(contents != null){
				Arrays.sort(contents);
				for(String item : contents){
					System.out.println(item);
				}
			}else{
				System.out.println("Empty directory");
			}
		}else{
			System.out.println("Provided route is not a directory");
		}

	}

	public void listDirectoryRecursive(String path){
		File directory = new File(path);
		try{
			FileWriter writer = new FileWriter("directory.txt");
			if (directory.isDirectory()){
				listRecursion(directory,0,writer);
				writer.close();
			}else{
				System.out.println("Provided path is not a directory");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void listRecursion(File directory, int level, FileWriter writer){
		File[] contents = directory.listFiles();
		if(contents != null){
			Arrays.sort(contents);
			for(File file : contents){
				formatPrint(file, level, writer);
				if(file.isDirectory()){
					listRecursion(file, level + 1, writer);
				}
			}
		}
	}

	private void formatPrint(File file, int level,FileWriter writer){
		String indent = "----".repeat(level);
		String type = file.isDirectory() ? "D" : "F";
		String lastMod = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
		try {
			writer.write(indent + file.getName() + " (" + type + ") " + lastMod + "\n");
			writer.flush();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}

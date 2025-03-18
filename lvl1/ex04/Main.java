package lvl1.ex04;

public class Main {
	public static void main(String []argv){
		if (argv.length != 1){
			System.out.println("must recive one argument, argument must be a file path");
		}
		Cat reader = new Cat();
		reader.readFile("lvl1/ex04/Main.java");
	}
}

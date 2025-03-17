package lvl1.ex03;

public class Main {
	public static void main(String [] argv){
		if (argv.length!= 1){
			System.out.println("program needs at least one argument, the argument must be a directory path");
			return;
		}
		Ls ls = new Ls();
		ls.listDirectoryRecursive(argv[0]);
	}
}

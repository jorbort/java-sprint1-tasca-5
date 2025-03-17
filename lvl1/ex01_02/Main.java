package lvl1.ex01_02;
class Main{
	public static void main(String[] argv){
		if (argv.length != 1){
			System.out.println("Need to input at least one value as parameter, the value must be an existing directory");
			return;
		}
		Ls ls = new Ls();
		System.out.println("simply listing directory-----");
		ls.listDirectory(argv[0]);
		System.out.println("Recursively listing directories -----");
		ls.listDirectoryRecursive(argv[0]);
	}
}
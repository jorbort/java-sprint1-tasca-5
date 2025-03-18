package lvl1.ex01_02;
class Main{
	public static void main(String[] argv){
		
		Ls ls = new Ls();
		System.out.println("simply listing directory-----");
		ls.listDirectory(".");
		System.out.println("Recursively listing directories -----");
		ls.listDirectoryRecursive(".");
	}
}
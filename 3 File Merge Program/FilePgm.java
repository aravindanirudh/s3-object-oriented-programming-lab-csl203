import java.io.*;
class FilePgm {
	public static void main(String args[]) {
		try {
			FileReader f1 = new FileReader("file1.txt");
			FileReader f2 = new FileReader("file2.txt");
			FileWriter f3 = new FileWriter("file3.txt");
			int i;
			while((i=f1.read())!=-1) {
				f3.write(i);
			}
			f1.close();
			while((i=f2.read())!=-1) {
				f3.write(i);
			}
			f2.close();
			f3.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
	}
}

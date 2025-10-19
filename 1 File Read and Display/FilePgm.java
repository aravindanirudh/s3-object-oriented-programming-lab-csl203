import java.io.*;
class FilePgm {
	public static void main(String args[]) {
		try {
			FileInputStream f1 = new FileInputStream("file1.txt");
			int i;
			while((i=f1.read())!=-1) {
				System.out.print((char)i);
			}
			f1.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

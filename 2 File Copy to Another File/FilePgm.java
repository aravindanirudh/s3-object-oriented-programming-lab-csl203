import java.io.*;
class FilePgm {
	public static void main(String args[]) {
		try {
			FileInputStream f1 = new FileInputStream("file1.txt");
			FileOutputStream f2 = new FileOutputStream("file2.txt");
			int i;
			while((i=f1.read())!=-1) {
				f2.write(i);
			}
			f1.close();
			f2.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

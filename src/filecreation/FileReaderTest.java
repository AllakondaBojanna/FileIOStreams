package filecreation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		File f=new File("Student.txt");
		FileReader fr=new FileReader(f);
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		

	}

}

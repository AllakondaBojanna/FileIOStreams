package filecreation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File f=new File("mydata.txt");
		FileInputStream fis=new FileInputStream(f);
		int ch;
		while((ch=fis.read())!=-1) {
			System.out.print((char)ch);
		}

	}

}

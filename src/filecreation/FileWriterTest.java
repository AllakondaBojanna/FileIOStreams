package filecreation;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		String str="Iam Student Of CarrerIT";
		FileWriter fw=new FileWriter("Student.txt");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			fw.write(ch);
		}
		fw.close();
		

	}

}

package filecreation;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream abc=new FileOutputStream("mydata.txt",true);
		DataInputStream bnj=new DataInputStream(System.in);
		System.out.println("Enyter the data,to terminate enter '@'");
		int ch;
		while((ch=bnj.read())!='@') {
			
			abc.write(ch);
		}
		abc.close();

	}

}

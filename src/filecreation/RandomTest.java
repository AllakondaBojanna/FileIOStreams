package filecreation;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rd=new RandomAccessFile("mycontent.dat","rw");
		rd.writeChar('H');
		rd.writeInt(345);
		rd.writeDouble(333.25);
		rd.seek(0);
		
		System.out.println(rd.readChar());
		System.out.println(rd.readInt());
		System.out.println(rd.readDouble());
		
		rd.seek(rd.length());//file pointer at the end of the file
		rd.writeBoolean(true);
		rd.seek(6);
		
		System.out.println(rd.readDouble());
		
		rd.seek(14);
		
		System.out.println(rd.readBoolean());
	}

}

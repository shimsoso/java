package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

//public class FileReaderEx {
//
//	public static void main(String[] args) throws IOException {
//		FileReader fin = new FileReader("D:\\soso\\JAVA\\javaex\\ex.txt");
//		int c;
//		while((c=fin.read())!=-1) {
//			System.out.print((char)c);
//		}
//		fin.close();
//	}
//
//}

public class FileReaderEx {

	public static void main(String[] args){
		FileReader fin;
		try {
			fin = new FileReader("D:\\soso\\JAVA\\javaex\\ex.txt", Charset.forName("UTF-8"));
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

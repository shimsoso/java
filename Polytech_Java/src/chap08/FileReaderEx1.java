package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class FileReaderEx1 {

	public static void main(String[] args){
		FileInputStream in;
		try {
			in = new FileInputStream("D:\\soso\\JAVA\\javaex\\ex.txt");
			InputStreamReader is = new InputStreamReader(in, "UTF-8");
			int c;
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}
			is.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

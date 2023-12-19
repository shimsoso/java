package chap08;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
			File f = new File("D:\\soso\\JAVA\\javaex\\ex.txt");
			System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.getPath());
			System.out.println("파일크기 : " +f.length());
			
			f = new File("D:\\\\soso\\\\JAVA\\\\javaex");
			if(f.isDirectory())
				System.out.println("디렉토리가 맞습니다");
			File [] subfiles = f.listFiles();
			for(File ff : subfiles)
				System.out.println(ff.getName());
	}

}

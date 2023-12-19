package chap06;

import java.util.Scanner;

public class AlphabetHistogram {

	int histData[] = new int[26]; //각 알파벳의 갯수를 카운티하는 정수형 배열
	
	AlphabetHistogram() {
		for(int i=0; i<histData.length; i++)
			histData[i]=0;
	}
	
	//동작을 해주는 메소드 : readString -> checkAlphabet -> drawHistogram
	void run() {
		checkAlphabet(readString());
		drawHistogram();
	}
	
	//readString을 통해 가지고 온 텍스트를 알파벳 별로 카운팅하는 메소드
	void checkAlphabet(String msg) {
		msg = msg.toUpperCase();
		int index=0;
		for(int i=0; i<msg.length(); i++) {
			char c = msg.charAt(i);
			if(c>='A' && c<='Z')
				index = c - 'A';
				histData[index]++;
		}
	}

	//히스토그램을 그리는 메소드
	void drawHistogram() {
		for(int i=0; i<histData.length;i++) {
			System.out.println((char)(i+'A') + ":");
			for(int j=0; i<histData[i]; j++)
				System.out.print("★");
			System.out.println();
		}
	}
	
	//텐스트를 입력받아 하나의 StringBuffer로 붙이고, String으로 변경하여 리턴하는 메소드
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String line = scan.nextLine();
			if(line.length() == 1 && line.charAt(0)==';')
				break;
			sb.append(line);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		AlphabetHistogram al = new AlphabetHistogram();
		al.run();
	}
}

package chap06;

import java.util.Scanner;

public class AlphabetHistogram {

	int histData[] = new int[26]; //�� ���ĺ��� ������ ī��Ƽ�ϴ� ������ �迭
	
	AlphabetHistogram() {
		for(int i=0; i<histData.length; i++)
			histData[i]=0;
	}
	
	//������ ���ִ� �޼ҵ� : readString -> checkAlphabet -> drawHistogram
	void run() {
		checkAlphabet(readString());
		drawHistogram();
	}
	
	//readString�� ���� ������ �� �ؽ�Ʈ�� ���ĺ� ���� ī�����ϴ� �޼ҵ�
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

	//������׷��� �׸��� �޼ҵ�
	void drawHistogram() {
		for(int i=0; i<histData.length;i++) {
			System.out.println((char)(i+'A') + ":");
			for(int j=0; i<histData[i]; j++)
				System.out.print("��");
			System.out.println();
		}
	}
	
	//�ٽ�Ʈ�� �Է¹޾� �ϳ��� StringBuffer�� ���̰�, String���� �����Ͽ� �����ϴ� �޼ҵ�
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

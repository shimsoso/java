package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/* HangmanGame ���� ���� (������, ����1���� �����ϴ� �޼ҵ�) 
 * =======================================*/
public class HangmanGameEx {
	String randomWord;
	StringBuffer hiddenWord;
	final int BlankMax = 2; 
	final int TrialMax = 3;	
	Scanner scanner = new Scanner(System.in);
	
	// ���� 2���� ���ܼ� hiddenWord�� ����� �޼ҵ�
	void hideLetter() {
		hiddenWord = new StringBuffer(randomWord);
		Random r = new Random();
		for(int i=0; i<BlankMax; i++) {
			int index = r.nextInt(hiddenWord.length());
			char c = randomWord.charAt(index);
			//����غ���~~~ (���ɸ�����...)
			for(int j=0; j<randomWord.length(); j++)
				if(hiddenWord.charAt(j) == c)
					hiddenWord.setCharAt(j, '_');	
//				else
//					continue;
		}
	}
	
	// ���� ������ �ϴ� �޼ҵ�
	boolean go() {
		boolean success = false;
		int count = 0;
		
		while(true) {
			count++;	//���� ���ߴ� Ƚ��
			if(count > TrialMax) break;
			System.out.println(hiddenWord);
			System.out.print(">>");
			String text = scanner.next();
			char key = text.charAt(0);
			for(int i=0; i<randomWord.length(); i++)
				if(randomWord.charAt(i)==key && hiddenWord.charAt(i)=='_')
					hiddenWord.setCharAt(i, key);
//			System.out.println(randomWord);
//			System.out.println(hiddenWord);
			String msg = new String(hiddenWord);
			if(randomWord.equals(msg)) {success=true;break;}
		}
		return success;
	}
	
	void run() {
		System.out.println("��� ������ �����մϴ�...");
		//������ Word �����ڿ� �־� Vector�� ��ȯ�մϴ�. 
		Word word = new Word("D:\\soso\\JAVA\\ex\\words.txt");
		//������ �����մϴ�. 
		while(true) {
			randomWord = word.getRandomWord(); //������ �ܾ ���Ϳ��� �����´�. 
			//word.printVector();
			System.out.println(randomWord);
			hideLetter(); 	//���� 2���� ���ܼ� hiddenWord�� �����.
			//System.out.println(hiddenWord);
			if(go()) 	System.out.println("success");
			else		System.out.println("fail");
			System.out.print("������ �� �Ͻðڽ��ϱ�? (y/n) ");
			if(scanner.next().equals("n")) break;
		}
	}
	
	public static void main(String[] args) {
		HangmanGameEx game = new HangmanGameEx();
		game.run();
	}
}

/* Word Ŭ���� ���� (������, ����1���� �����ϴ� �޼ҵ�) 
 * =======================================*/
class Word{	
	Vector<String> wordVector = new Vector<String>();
	
	public Word(String filename) {
		try {
			Scanner scan = new Scanner(new FileReader(filename));
			while(scan.hasNext()) {
				String words = scan.nextLine();			
				wordVector.add(words);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);   //���α׷� ����
		}
	}
	
	public void printVector() {
		for(String s : wordVector)
			System.out.println(s);
	}
	
	public String getRandomWord() {
		final int WORDMAX = wordVector.size();
		int randomIndex = (int)(Math.random() * WORDMAX);
		return wordVector.get(randomIndex);
	}
}

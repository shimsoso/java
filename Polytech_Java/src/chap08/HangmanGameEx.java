package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/* HangmanGame 게임 구성 (생성자, 글자1개를 추출하는 메소드) 
 * =======================================*/
public class HangmanGameEx {
	String randomWord;
	StringBuffer hiddenWord;
	final int BlankMax = 2; 
	final int TrialMax = 3;	
	Scanner scanner = new Scanner(System.in);
	
	// 글자 2개를 숨겨서 hiddenWord를 만드는 메소드
	void hideLetter() {
		hiddenWord = new StringBuffer(randomWord);
		Random r = new Random();
		for(int i=0; i<BlankMax; i++) {
			int index = r.nextInt(hiddenWord.length());
			char c = randomWord.charAt(index);
			//고민해봐요~~~ (점심먹으며...)
			for(int j=0; j<randomWord.length(); j++)
				if(hiddenWord.charAt(j) == c)
					hiddenWord.setCharAt(j, '_');	
//				else
//					continue;
		}
	}
	
	// 실제 게임을 하는 메소드
	boolean go() {
		boolean success = false;
		int count = 0;
		
		while(true) {
			count++;	//글자 맞추는 횟수
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
		System.out.println("행맨 게임을 시작합니다...");
		//파일을 Word 생성자에 넣어 Vector로 변환합니다. 
		Word word = new Word("D:\\soso\\JAVA\\ex\\words.txt");
		//게임을 시작합니다. 
		while(true) {
			randomWord = word.getRandomWord(); //랜덤한 단어를 벡터에서 꺼내온다. 
			//word.printVector();
			System.out.println(randomWord);
			hideLetter(); 	//글자 2개를 숨겨서 hiddenWord를 만든다.
			//System.out.println(hiddenWord);
			if(go()) 	System.out.println("success");
			else		System.out.println("fail");
			System.out.print("게임을 더 하시겠습니까? (y/n) ");
			if(scanner.next().equals("n")) break;
		}
	}
	
	public static void main(String[] args) {
		HangmanGameEx game = new HangmanGameEx();
		game.run();
	}
}

/* Word 클래스 구성 (생성자, 글자1개를 추출하는 메소드) 
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
			System.out.println("파일이 찾을 수 없습니다.");
			System.exit(0);   //프로그램 종료
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

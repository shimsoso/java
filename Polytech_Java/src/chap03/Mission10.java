package chap03;

//do while문을 이용하여 a to z까지 출력하는ㅍ
public class Mission10 {

	public static void main(String[] args) {
		 char c= 'a';
		 
		 do {
			 System.out.print(c);
			 c = (char)(c + 1);
		 }while(c<='z');
	}

}

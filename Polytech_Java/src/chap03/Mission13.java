package chap03;

public class Mission13 {
	
	// makeArray 메소드 : int형 배열을 생성한 후 데이터를 넣어 리턴하는 메소드
	// 메소드는 괄호안에 내용이 있어야 빨간줄이 없어짐
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0; i<temp.length;i++)
			temp[i] = i;
		return temp;
	}
	
	public static void main(String[] args) {
		int[] intArray = makeArray();
		for(int n : intArray)
			System.out.print(n + " ");
	}

}

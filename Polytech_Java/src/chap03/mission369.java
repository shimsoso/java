package chap03;

public class mission369 {

	public static void main(String[] args) {
		
		for(int num=1; num<=99; num++) 
		{
			int a = num/10;
			int b = num%10;
			
			if(a==3 || a==6 || a==9) {
				if (b==3 || b==6 || b==9)   System.out.println(num + " ¹Ú¼öÂ¦Â¦");
				else 						System.out.println(num + " ¹Ú¼öÂ¦");
			} 
			
			
			else if(b==3 || b==6 || b==9) System.out.println(num + " ¹Ú¼öÂ¦");
		}
		
	}

}

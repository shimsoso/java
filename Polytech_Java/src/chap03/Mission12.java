package chap03;

public class Mission12 {

	public static void main(String[] args) {
			int H[][] = {
					{1,0,0,0,1},
					{1,0,0,0,1},
					{1,1,1,1,1},
					{1,0,0,0,1},
					{1,0,0,0,1}
			};
		
			for(int i=0; i<H.length; i++) {
				for(int j=0; j<H[i].length; j++) {
					if(H[i][j]==1) 			System.out.print("бс");
					else 					System.out.print(" ");
				}
				System.out.println();
			}
	}

}

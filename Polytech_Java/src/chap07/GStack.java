package chap07;

public class GStack<T> {
		int tos;
		Object stck[];
		
		public GStack(){
			tos=0;
			stck = new Object[10]; //Object�� 10���� �غ�
			
		}
		
		public void push(T item) {
			if(tos==10)
				return;
			stck[tos] = item; //�ڽ��� �θ𿡰� �����Ƿ� upcasting
			tos++;
		}
		
		public T pop() {
			if(tos==0)
				return null;
			tos--;
			return (T)stck[tos];		//downcating�� ���� ������Ÿ���� �ٲ������
		}
}

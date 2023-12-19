package chap07;

public class GStack<T> {
		int tos;
		Object stck[];
		
		public GStack(){
			tos=0;
			stck = new Object[10]; //Object에 10개를 준비
			
		}
		
		public void push(T item) {
			if(tos==10)
				return;
			stck[tos] = item; //자식을 부모에게 넣으므로 upcasting
			tos++;
		}
		
		public T pop() {
			if(tos==0)
				return null;
			tos--;
			return (T)stck[tos];		//downcating에 들어가서 데이터타입을 바꿔줘야함
		}
}

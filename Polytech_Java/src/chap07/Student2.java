package chap07;

public class Student2 {
		private int id;
		private String tel;
		
		
	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTel() {
			return tel;
		}


		public void setTel(String tel) {
			this.tel = tel;
		}

		
	public Student2(int id, String tel) {
			super();
			this.id = id;
			this.tel = tel;
		}
		
	

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", tel=" + tel + "]";
	}


	public static void main(String[] args) {
		
	}

}

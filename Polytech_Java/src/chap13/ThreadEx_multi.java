package chap13;

public class ThreadEx_multi extends Thread{
	
	@Override
	public void run() {
		String currentThread = Thread.currentThread().getName();
		System.out.println(currentThread + "--- 시작");
		for(int i=1; i<=10; i++) {
			System.out.println(currentThread + "-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(currentThread + "--- 종료");
	}

	public static void main(String[] args) {		
		ThreadEx_multi ex;
		System.out.println("Thread 시작 ================ ");		
		for(int i=1; i<=2; i++) {
			ex = new ThreadEx_multi();
			ex.start();
		}	
		System.out.println("Thread 종료 ================ ");
	}
}
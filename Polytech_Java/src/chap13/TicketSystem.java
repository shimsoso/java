package chap13;

public class TicketSystem extends Thread{	
	int total;
	SellManager sm;
	
	@Override 
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println(currentName + "- 시작");
		for(int i=0; i<3; i++) {
			System.out.println(currentName + "- 판매" + sm.sell());
		}
		System.out.println(currentName + "- 종료");
	}
	
	//생성자 
	public TicketSystem() {
		total = 100;
		sm = new SellManager();
	}
	
	public static void main(String[] args) {
		System.out.println("############# 티켓 예매 시스템 ###############");
		TicketSystem app = new TicketSystem();
		for(int i=0; i<10; i++) {
			Thread t = new Thread(app);
			t.start();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 메소드 종료 !!");
	}
	
	//내부 클래스 작성 
	class SellManager{		
		synchronized int sell() {
			total--;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return total;
		}
	}
}
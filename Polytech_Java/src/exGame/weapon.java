package exGame;

//인터페이스   
public interface weapon {
	//추상
	public void punch(int power);
	public void sword(int power);
	public void fire(int power);
	public int getRestPower();
	public int charge(int power);
}

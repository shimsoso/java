package exGame;

//나의 무게클래스
public class MyWeapon implements weapon {
	//속성(필드)
	private int curPower;
	
	@Override
	public void punch(int power) {
		GameUnit.bossHp = GameUnit.bossHp - power;
	}
	@Override
	public void sword(int power) {
		GameUnit.bossHp = GameUnit.bossHp - power;
	}
	@Override
	public void fire(int power) {
		GameUnit.bossHp = GameUnit.bossHp - power;
	}
//	@Override
//	public void heal(int power) {
//		GameUnit.bossHp = GameUnit.bossHp + power;
//	}

	@Override
	public int getRestPower() {
		return 0;
	}

	@Override
	public int charge(int power) {
		return this.curPower = curPower + power;
	}

}

package exGame;

//���� ����Ŭ����
public class MyWeapon implements weapon {
	//�Ӽ�(�ʵ�)
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

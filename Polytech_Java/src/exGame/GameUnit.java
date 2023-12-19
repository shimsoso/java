package exGame;

import java.util.Random;

import javax.swing.JOptionPane;

//게임시나리오 클래스
public class GameUnit{
    static int bossHp = 10000;
    static int PlayerHp = 5000;
    static int ComHp = 4500;
    static String user_name = null;
   

    //생성자 구현
	public static void main(String[] args) {
		MyWeapon  w = new MyWeapon();
		Random ran = new Random();	
		String weapon_name=null;


	
		//유저 이름 받기
		user_name = JOptionPane.showInputDialog("Player의 이름을 입력하시오.");
		
		//게임 시작 창
		JOptionPane.showMessageDialog(null, user_name + "님 Game을 시작합니다.","GAME START", JOptionPane.PLAIN_MESSAGE);
		
		
		while(true) {
			//player턴
			//무기 입력 창
			String num = JOptionPane.showInputDialog("공격할 무기를 선택하시오.\n 1.펀치 2.칼 3.파이어");						
			
			//취소나 값을 입력하지 않을시 종료
			if(num == null || num.equals("")) {
				System.exit(0);
			}
			
			int wapon_num = Integer.parseInt(num); //입력받은 무기를 정수형으로 변경
			int damage = 1+ran.nextInt(300); //무기 공격력 랜덤값
			
			//player 공격 
			switch(wapon_num) {
			case 1 : 
				w.punch(damage);
				weapon_name = "punch";
				break; 
				
			case 2 : 
				w.sword(damage*3);
				weapon_name = "sword";
				break;
				
			case 3 : 
				w.fire(damage*5);
				weapon_name = "fire";
				break;
				
			default :
				JOptionPane.showMessageDialog(null, "다시 입력하시오.", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
				break;
		}
			if(GameUnit.bossHp <= 0) {
				JOptionPane.showMessageDialog(null, "게임에서 승리 하셨습니다!", "게임 결과", JOptionPane.INFORMATION_MESSAGE);
				System.out.println("용사" + user_name + "의 공격 - 용사의 승리!");
				System.exit(0);
				}
			else {
				System.out.println("용사 "+ user_name +"(이)가 스킬 " + weapon_name + "를 시전하였습니다!\n 남겨진 마왕 Hp는 " + GameUnit.bossHp);
		}
			
			
			
			//Com턴
			int Cskill = 1+ran.nextInt(3); //컴퓨터의 랜덤스킬 
			int Cdamage = 1+ran.nextInt(300); //Com 공격력 랜덤값
			
			//Com 공격 
			switch(Cskill) {
			case 1 : 
				w.punch(Cdamage);
				weapon_name = "punch";
				break; 
				
			case 2 : 
				w.sword(Cdamage*3);
				weapon_name = "sword";
				break;
				
			case 3 : 
				w.fire(Cdamage*5);
				weapon_name = "fire";
				break;
		
		}
			if(GameUnit.bossHp <= 0) {
				JOptionPane.showMessageDialog(null, "게임에서 패배 하셨습니다!", "게임 결과", JOptionPane.ERROR_MESSAGE);
				System.out.println("용사 동료 COM의 공격 - 동료의 승리!");
				System.exit(0);
				}
			else {
				System.out.println("COM(이)가 스킬 " + weapon_name + "를 시전하였습니다!\n 남겨진 마왕 Hp는 " + GameUnit.bossHp);
		}

			
			
			
		}		
				
	}
	

}

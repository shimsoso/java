package exGame;

import java.util.Random;

import javax.swing.JOptionPane;

//���ӽó����� Ŭ����
public class GameUnit{
    static int bossHp = 10000;
    static int PlayerHp = 5000;
    static int ComHp = 4500;
    static String user_name = null;
   

    //������ ����
	public static void main(String[] args) {
		MyWeapon  w = new MyWeapon();
		Random ran = new Random();	
		String weapon_name=null;


	
		//���� �̸� �ޱ�
		user_name = JOptionPane.showInputDialog("Player�� �̸��� �Է��Ͻÿ�.");
		
		//���� ���� â
		JOptionPane.showMessageDialog(null, user_name + "�� Game�� �����մϴ�.","GAME START", JOptionPane.PLAIN_MESSAGE);
		
		
		while(true) {
			//player��
			//���� �Է� â
			String num = JOptionPane.showInputDialog("������ ���⸦ �����Ͻÿ�.\n 1.��ġ 2.Į 3.���̾�");						
			
			//��ҳ� ���� �Է����� ������ ����
			if(num == null || num.equals("")) {
				System.exit(0);
			}
			
			int wapon_num = Integer.parseInt(num); //�Է¹��� ���⸦ ���������� ����
			int damage = 1+ran.nextInt(300); //���� ���ݷ� ������
			
			//player ���� 
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
				JOptionPane.showMessageDialog(null, "�ٽ� �Է��Ͻÿ�.", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
				break;
		}
			if(GameUnit.bossHp <= 0) {
				JOptionPane.showMessageDialog(null, "���ӿ��� �¸� �ϼ̽��ϴ�!", "���� ���", JOptionPane.INFORMATION_MESSAGE);
				System.out.println("���" + user_name + "�� ���� - ����� �¸�!");
				System.exit(0);
				}
			else {
				System.out.println("��� "+ user_name +"(��)�� ��ų " + weapon_name + "�� �����Ͽ����ϴ�!\n ������ ���� Hp�� " + GameUnit.bossHp);
		}
			
			
			
			//Com��
			int Cskill = 1+ran.nextInt(3); //��ǻ���� ������ų 
			int Cdamage = 1+ran.nextInt(300); //Com ���ݷ� ������
			
			//Com ���� 
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
				JOptionPane.showMessageDialog(null, "���ӿ��� �й� �ϼ̽��ϴ�!", "���� ���", JOptionPane.ERROR_MESSAGE);
				System.out.println("��� ���� COM�� ���� - ������ �¸�!");
				System.exit(0);
				}
			else {
				System.out.println("COM(��)�� ��ų " + weapon_name + "�� �����Ͽ����ϴ�!\n ������ ���� Hp�� " + GameUnit.bossHp);
		}

			
			
			
		}		
				
	}
	

}

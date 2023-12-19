package game;

import java.util.Random;
import java.util.Scanner;

//게임 시나리오
public class GameUnit {
       static int bossPower = 5000;
       private int unitPower = 5000;
       private MyWeapon weapon; 
       private String name;
       
      
       //생성자를 구현해주세요. 
       
       // 생성자메서드
//       public GameUnit () {};
       public GameUnit(String name) {
         this.name =name;
          weapon = new MyWeapon();
          weapon.charge(unitPower);
          
      }
       //attack 메서드 구현
       void attack (int power) {
          GameUnit.bossPower = bossPower - power;
          if (power<=500) System.out.println("Miss!! 야생초봄이의 공격이 미미했다!");
       }
       
       void defence (int power) {
          GameUnit.bossPower = bossPower + power;
       }
       
       
       public static void main(String[] args){ 
         GameUnit unit1 = new GameUnit("unit1");
         GameUnit unit2 = new GameUnit("unit2");         
         
         
         Random r = new Random();
         Scanner scan = new Scanner(System.in);
         while(true){   
            int p1 = 1+ r.nextInt(1000);
            int p2 = 1+ r.nextInt(200);
            System.out.println("공격하세요!");
            String act = scan.next();
           
            if(act.equals("g"))  { 
               
               unit1.attack(p1);
               
               System.out.println("바보초봄이가 공격한다!"+ p1 + "데미지가 들어갔다!");
               
                     
               if(GameUnit.bossPower <0) {
                        System.out.println("보스가 죽었다");
                        System.exit(0);}
               else
                  System.out.println("남겨진 bossPower:" + GameUnit.bossPower);
               
               unit2.defence(p2);
               System.out.println("바보귤언니가 보스피를 회복했다! "+ p2+ "보스피가 회복됐다");
            }
            
            else {System.out.println("보스에게 공격이 먹히지 않았다");
            	 System.out.println("초봄이 바부");
            
            }
            if(GameUnit.bossPower<=0) {
               System.out.println("게임승리!-게임 종료합니다.");
            System.exit(0);
            }
            else
               System.out.println("남겨진 bossPower:" + GameUnit.bossPower);
           }
       
       }
}
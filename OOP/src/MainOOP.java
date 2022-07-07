import Terran.*;

import java.util.Scanner;

public class MainOOP {
    public static void main(String[] args) {

        Marine marine = new Marine();
        Medic medic = new Medic();
        Ghost ghost = new Ghost();


        System.out.println("단축키를 입력하세요 \n A:마린, M:메딕, G:고스트");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();

        if(name.equals("A")){
            System.out.println(marine);
            marine.attack();
        }
        else if (name.equals("M")){
            System.out.println(medic);
            medic.attack();
        }
        else if (name.equals("G")) {
            System.out.println(ghost);
            ghost.attack();
        }else{
            System.out.println("단축키가 틀렸습니다.");
        }



    }


}

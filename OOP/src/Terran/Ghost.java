package Terran;

public class Ghost extends Unit implements Attack {

    int speed = 7;

    public Ghost(){
        unitId = 3;
        life = 75;
        damege = 10;
    }



    @Override
    public String toString() {
        return "고스트 : {" +
                "이동속도=" + speed +
                ", 체력=" + life +
                ", 공격력=" + damege +
                '}';
    }

    @Override
    public void attack() {
        System.out.println("공격유형 : 저격소총");
    }
}

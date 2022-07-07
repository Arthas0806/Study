package Terran;

public class Marine extends Unit implements Attack {

    int speed = 5;

    public Marine(){
        unitId = 1;
        life = 50;
        damege = 5;
    }

    @Override
    public void attack() {
        System.out.println("공격유형 : 자동소총");
    }

    @Override
    public String toString() {
        return "마린 : {" +
                "이동속도=" + speed +
                ", 체력=" + life +
                ", 공격력=" + damege +
                '}';
    }


}

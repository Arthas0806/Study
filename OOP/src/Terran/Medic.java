package Terran;

public class Medic extends Unit implements Attack {

    int speed = 3;
    public Medic(){
        unitId = 2;
        life = 60;
        damege = 0;
        System.out.println(99);
    }

    public Medic(int A){
        System.out.println(100);

    }

    @Override
    public String toString() {
        Medic medic = new Medic();

        return "메딕 : {" +
                "이동속도=" + speed +
                ", 체력=" + life +
                ", 공격력=" + damege +
                '}';
    }

    @Override
    public void attack() {
        System.out.println("공격유형 : 공격불가");
    }
}

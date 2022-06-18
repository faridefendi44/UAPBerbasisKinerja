package Tugas8;

public class Healer extends Character{
    public Healer(int defense, int attact, int HP) {
        super(defense, attact, HP);
    }

    @Override
    public boolean attact(){
        boolean hit;
        double randomNum = (double) (Math.random()*11);

        if (randomNum <=8.5){
            hit=true;
        }else{
            hit=false;
        }
        return hit;
    }
    public void heal(){
        setHP(getHP()+25);
    }
}

package Tugas8;

public class Magician extends Character{

    public Magician(int defense, int attact, int HP){
        super(defense, attact, HP);
    }

    @Override
    public boolean attact(){
        boolean hit;
        double randomNum = (double)(Math.random()*11);

        if (randomNum <=3.5){
            hit=true;
        }else {
            hit=false;
        }
        return hit;
    }
}


package Tugas8;

public class Titan extends Character {
    public Titan(int defense, int attact, int HP){
        super(defense, attact, HP);
    }
    @Override
    public boolean attact(){
        boolean hit;
        double randomNum = (double) (Math.random()*11);

        if(randomNum<=4){
            hit=true;
        }else{
            hit=false;
        }
        return hit;
    }
}

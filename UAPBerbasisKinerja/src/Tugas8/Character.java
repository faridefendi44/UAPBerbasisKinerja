package Tugas8;


public abstract class Character {
    private int defense;
    private int attact;
    private int HP;

    public Character(int defense, int attact, int HP){
        this.defense=defense;
        this.attact=attact;
        this.HP=HP;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttact() {
        return attact;
    }

    public void setAttact(int attact) {
        this.attact = attact;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract boolean attact();
    public void receivedDamage(int damage){
        int totalDamage;
        if(damage > defense){
            totalDamage = damage - defense;
        }else{
            totalDamage = 0;
        }
        this.HP -= totalDamage;
        if(HP<=0){
            setHP(0);
        }
    }

    public void info(){
        System.out.println("HP      = "+getHP());
        System.out.println("Attack  = "+getAttact());
        System.out.println("Defence = "+getDefense());
    }

}
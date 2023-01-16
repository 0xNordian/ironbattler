
public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(String name) {
        super(name);
        setHP();
        setMana();
        setIntelligence();
    }
    public Wizard(String name, int hp) {
        super(name, hp);
        setMana();
        setIntelligence();
    }

    public void setHP (){
        int vida =(int) (Math.random()*(100-50))+50;
        super.setHp(vida);
    }


    public int getMana() {
        return mana;
    }

    public void setMana() {
        this.mana = (int) (Math.random()*(50-10))+10;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence() {
        this.intelligence = (int) (Math.random()*(50-1))+1;
    }

    @Override
    public void attack() {

    }
}


import java.util.Random;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(String name) {
        super(name);
        setHp();
        setMana();
        setIntelligence();
    }
    public Wizard(String name, int hp) {
        super(name, hp);
        if(hp < 50 || hp > 100){
            super.setHp(75);
        }
        setMana();
        setIntelligence();
    }

    public void setHp (){
        int vida =(int) (Math.random()*(100-50))+50;
        super.setHp(vida);
    }

    public void setHp(int hp){
        super.setHp(hp);
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
    public boolean isAlive() {
        return super.isAlive();
    }
    @Override
    public void attack(Character character) {
        Random random= new Random();

        boolean isFireball = random.nextBoolean();
        if (isFireball){
            fireball(character);
        } else{
            staffHit(character);
        }
    }
    private void fireball(Character character) {
        //variable de fbDamage
        int fbDamage= this.intelligence;
        if (this.mana<5 && this.mana>0){
            System.out.println("\uD83E\uDDD9\u200D  "+this.getName()+ "  \uD83D\uDD2E" + " tried a FireBall☄️ but had not enough mana🔋!");
            staffHit(character);
        } else if (this.mana >=5) {
            this.mana -= 5;
            character.setHp(character.getHp()-fbDamage);
            System.out.println("\uD83E\uDDD9\u200D  "+this.getName()+ "  \uD83D\uDD2E" + " executed FireBall☄️ for [" + fbDamage + "] points of damage!");
        }
    }
    private void staffHit (Character character){
        int shDamage;
        if ( this.mana<5 && this.mana>0) {
            this.mana += 2;
            shDamage = 0;
            System.out.println("\uD83E\uDDD9\u200D  "+this.getName()+ "  \uD83D\uDD2E" + " executed a Staff Hit🧹 for [" + shDamage+ "] points of damage. But hey, mana🔋 increased  2 point and is now  "+ this.getMana() +"!");
        }
        if (this.mana >= 5){
            shDamage =2;
            this.mana +=1;
            character.setHp(character.getHp()-shDamage);
            System.out.println("\uD83E\uDDD9\u200D  "+this.getName()+ "  \uD83D\uDD2E" + " executed a Staff Hit🧹, for [" + shDamage+ "] points of damage! Mana🔋 increased  1 point and is now " + this.getMana() + "!");
        }
    }
}


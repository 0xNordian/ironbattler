import java.util.Random;

public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name);
        setStamina();
        setStrength();
        setHp();
    }

    public Warrior(String name, int hp) {
        super(name, hp);
        if(hp < 100 || hp > 200){
            super.setHp(150);
        }
        setStamina();
        setStrength();
    }

    public int getStamina() {
        return stamina;
    }

    private void setStamina() {
        this.stamina = (int) (Math.random() * (50 - 10)) + 10;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        this.strength = (int) (Math.random() * (10 - 1)) + 1;
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    public void setHp() {
        int vida = (int) (Math.random() * (200 - 100)) + 100;
        super.setHp(vida);
    }

    public void setHp(int hp){
        super.setHp(hp);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void attack(Character character) {
        String action;
        int damage;
        Random random = new Random();
        action = random.nextBoolean()? "heavyAttack" : "weakAttack";
        switch (action){
            case "heavyAttack":
                if(this.stamina>5){
                    damage = this.strength;
                    character.setHp(character.getHp()-damage);
                    this.stamina -= 5;
                    System.out.println("⚔️  "+this.getName()+ "  \uD83D\uDEE1️" + " executed a Heavy Attack💪 for [" + damage + "] points of damage!");
                } else if(this.stamina <= 0) {
                    this.stamina += 2;
                    System.out.println("⚔️  "+this.getName()+ "  \uD83D\uDEE1️" + " tried to attack but had not stamina🫠! Took a deep breath and stamina\uD83D\uDC89 increased by 2 and is now " + this.getStamina()+ "!");

                } else {
                    damage = this.strength/2;
                    character.setHp(character.getHp()-damage);
                    this.stamina += 1;
                    System.out.println("⚔️  "+this.getName()+ "  \uD83D\uDEE1️" +  " executed a Weak Attack👊 for [" + damage + "] points of damage! Stamina\uD83D\uDC89 increased by 1 and is now " + this.getStamina()+ "!");
                }
                break;
            case "weakAttack":
                damage = this.strength/2;
                character.setHp(character.getHp()-damage);
                this.stamina += 1;
                System.out.println("⚔️  "+this.getName()+ "  \uD83D\uDEE1️" + " executed a Weak Attack👊 for [" + damage + "] points of damage! Stamina\uD83D\uDC89 increased by 1 and is now " + this.getStamina()+ "!");
                break;
        }
    }
}

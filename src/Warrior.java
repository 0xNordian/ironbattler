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

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void setName(String name) {
        super.setName(name.trim().substring(0,1).toUpperCase() + name.trim().substring(1).toLowerCase());
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
                    //case1: enough stamina for heavy attack
                    damage = this.strength; //calculate damage
                    character.setHp(character.getHp()-damage); //decrease enemy hp
                    this.stamina -= 5; //decrease own stamina
                    System.out.println(this.getName() + " executed a Heavy Attack for [" + damage + "] points of damage!");
                } else if(this.stamina <= 0) {
                    //case2: no stamina, no attack
                    this.stamina += 2; //increases stamina +2
                    System.out.println(this.getName() + " tries to attack but has not stamina!");
                    System.out.println(this.getName() + " 'stamina increases by 2!");
                } else {
                    //case3: has stamina, but not enough (>0 && <5), weak attack
                    damage = this.strength/2; //calculate damage
                    character.setHp(character.getHp()-damage); //decrease enemy hp
                    this.stamina += 1; //increases stamina +1
                    System.out.println(this.getName() + " executed a Weak Attack for [" + damage + "] points of damage!");
                    System.out.println(this.getName() + " 'stamina increases by 1!");
                }
                break;
            case "weakAttack":
                damage = this.strength/2;
                character.setHp(character.getHp()-damage);
                this.stamina += 1;
                System.out.println(this.getName() + " executed a Weak Attack for [" + damage + "] points of damage!");
                System.out.println(this.getName() + " 'stamina increases by 1!");
                break;
        }

    }
}

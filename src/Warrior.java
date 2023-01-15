public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name);
        setStamina();
        setStrength();
        setHp((int) (Math.random() * (200 - 100)) + 100);
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

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public boolean attack() {
        return false;
    }

/*
    @Override
    public void attack(Character attackedCharacter) {
        attackedCharacter.changeHp(attackedCharacter.getHp() - strength);
    }

 */

    @Override
    public void attack(Character character) {
        int damage = (int) (Math.random() * 2) == 0 ? strength : strength / 2;
        character.setHp(character.getHp() - damage);
        stamina -= 5;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}

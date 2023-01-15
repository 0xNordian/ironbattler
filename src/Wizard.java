//This class is derived from the Character class. A Wizard is a Character that fights by casting spells. Spells inflict damage and require mana to be cast.
//
//The Wizard class will have:
//
//Variable called mana of data type int, random between 10-50, representing a resource the wizard consumes to cast spells (Private member)
//Variable called intelligence of data type int, random between 1-50, measuring how strong the wizard spells are (Private member)
//Public Getter functions to access these variables
//Public Setter functions to change these variables
//A parameterized constructor that takes name, hp, mana, and intelligence
//A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the intelligence of the spell

public class Wizard extends Character{
    private int mana;
    private int intelligence;

    public Wizard(String id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        setHP();
        setMana(mana);
        setIntelligence(intelligence);
    }
    private void setHP (){
        super.setHp((int) (Math.random()*100)+50);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = (int) (Math.random()*50)+10;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = (int) (Math.random()*50)+1;
    }
}


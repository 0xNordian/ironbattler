import java.util.UUID;

public abstract class Character implements Attacker {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name) {
        this.id = UUID.randomUUID().toString();
        setName(name);
        this.isAlive = true;
    }

    public Character(String name, int hp) {
        this.id = UUID.randomUUID().toString();
        setName(name);
        setHp(hp);
        this.isAlive = true;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp <= 0) {
            this.hp = 1;
        } else {
            this.hp = hp;
        }
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void changeHp(int newHp){
        this.hp = newHp;
    }

    @Override
    public void attack(Character character) {

    }
}

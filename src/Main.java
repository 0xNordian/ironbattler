public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("NT");
        w1.attack();
        System.out.println(Math.random() * 2);
        System.out.println(
                "Name: " + w1.getName() + '\n' +
                "Id: " + w1.getId() + '\n' +
                "HP: " + w1.getHp() + '\n' +
                "isAlive: " + w1.isAlive() + '\n' +
                "Strength: " + w1.getStrength() + '\n' +
                "Stamina: " + w1.getStamina() + '\n'
        );

        Warrior w2 = new Warrior("Marina", 200000000);
        w1.attack();
        System.out.println(Math.random() * 2);
        System.out.println(
                "Name: " + w2.getName() + '\n' +
                        "Id: " + w2.getId() + '\n' +
                        "HP: " + w2.getHp() + '\n' +
                        "isAlive: " + w2.isAlive() + '\n' +
                        "Strength: " + w2.getStrength() + '\n' +
                        "Stamina: " + w2.getStamina() + '\n'
        );
    }
}
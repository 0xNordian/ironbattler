public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("NT");
        //System.out.println("w1: " + w1);
        System.out.println(
                "Name: " + w1.getName() + '\n' +
                "Id: " + w1.getId() + '\n' +
                "HP: " + w1.getHp() + '\n' +
                "Strength: " + w1.getStrength() + '\n' +
                "Stamina: " + w1.getStamina() + '\n'
        );
    }
}
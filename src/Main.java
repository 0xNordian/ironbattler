import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*

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
 */

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select game mode:");
            System.out.println("1) Create characters");
            System.out.println("2) Create random characters");
            System.out.println("3) Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                int count = 0;
                while (count < 2) {
                    System.out.println("Create characters:");
                    System.out.println("1) Warrior");
                    System.out.println("2) Wizard");
                    int subChoice = sc.nextInt();
                    sc.nextLine();
                    if (subChoice == 1) {
                        System.out.println("Enter name for warrior:");
                        String name = sc.nextLine();
                        System.out.println("Enter hp for warrior between 100-200:");
                        int hp = sc.nextInt();
                        Warrior warrior = new Warrior(name, hp);
                        System.out.println("Warrior created: " + "\n" + "Name: " + warrior.getName() + "\n"  + "Hp: " + warrior.getHp() + "hp " + "\n"   + "Strength: " + warrior.getStrength() + "\n" + "Stamina: " + warrior.getStamina());
                    } else if (subChoice == 2) {
                        System.out.println("Enter name for wizard:");
                        String name = sc.nextLine();
                        System.out.println("Enter hp for wizard between 50-100:");
                        int hp = sc.nextInt();
                        Wizard wizard = new Wizard(name, hp);
                        System.out.println("Wizard created: " + "\n" + "Name: " + wizard.getName() + "\n"  + "Hp: " + wizard.getHp() + "hp " + "\n"   + "Intelligence: " + wizard.getIntelligence() + "\n" + "Mana: " + wizard.getMana());
                    }
                    count++;
                }
                System.out.println("Let the battle begin!");
                break;
            } else if (choice == 2) {
                // code random characters
            }
        } while (choice != 3);

    }
}

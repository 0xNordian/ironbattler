
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void startMenu() {
        ArrayList<Character> characters = new ArrayList<Character>();
        String art = """

                ██ ██████   ██████  ███    ██ ██████   █████  ████████ ████████ ██      ███████\s
                ██ ██   ██ ██    ██ ████   ██ ██   ██ ██   ██    ██       ██    ██      ██     \s
                ██ ██████  ██    ██ ██ ██  ██ ██████  ███████    ██       ██    ██      █████  \s
                ██ ██   ██ ██    ██ ██  ██ ██ ██   ██ ██   ██    ██       ██    ██      ██     \s
                ██ ██   ██  ██████  ██   ████ ██████  ██   ██    ██       ██    ███████ ███████\s

                                      
                """;

        art.lines().forEach(System.out::println);
        System.out.println("created by PoderComputacional™ 2023" + "\n\n");
        Scanner sc = new Scanner(System.in);
        int choice;
            Character char1 = null;
            Character char2 = null;
        do {
            System.out.println("Select game mode:");
            System.out.println("1) Create characters");
            System.out.println("2) Create random characters");
            System.out.println("3) Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid option, please select 1, 2 or 3");
                continue;
            }
            if (choice == 1) {
                char1 = createCharacter();
                char2 = createCharacter();
                System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
                System.out.println("Let the battle begin!");
                System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
            } else if (choice == 2) {
                    char1 = createRandomCharacter();
                    char2 = createRandomCharacter();
                System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
                System.out.println("Let the battle begin!");
                System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
            }
        }
        while (choice == 3);
        //System.out.println("Players Stats Details TBD");
        Battle.battle(char1, char2);
    }

    private static void battle() {
    }

    private static Character createCharacter(){
        Character cha = null;
        Scanner sc = new Scanner(System.in);
            System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
            System.out.println("Create characters:");
            System.out.println("1) Warrior ⚔️\uD83D\uDEE1️");
            System.out.println("2) Wizard \uD83E\uDDD9\u200D️\uD83D\uDD2E");
            int subChoice = sc.nextInt();
            sc.nextLine();
            if (subChoice < 1 || subChoice > 2) {
                System.out.println("Invalid option, please select 1 or 2");
            }
            if (subChoice == 1) {
               cha = warriorCharacterGenerator();
            } else if (subChoice == 2) {
                cha = wizardCharacterGenerator();
            }
        return cha;
    }

    private static Character warriorCharacterGenerator(){
        Scanner sc = new Scanner(System.in);
        String artWarrior = """
                                       |\\                     /)
                                     /\\_\\\\__               (_//
                                    |   `>\\-`     _._       //`)
                                     \\ /` \\\\  _.-`:::`-._  //
                                      `    \\|`    :::    `|/
                                            |     :::     |
                                            |.....:::.....|
                                            |:::::::::::::|
                                            |     :::     |
                                            \\     :::     /
                                             \\    :::    /
                                              `-. ::: .-'
                                               //`:::`\\\\
                                              //   '   \\\\
                                             |/         \\\\      
                                    """;

        artWarrior.lines().forEach(System.out::println);
        System.out.println("Enter name for warrior:");
        String name = sc.nextLine();
        System.out.println("Enter hp for warrior between 100-200:");
        int hp = sc.nextInt();
        Warrior warrior = new Warrior(name, hp);
        System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
        System.out.println("⚔️\uD83D\uDEE1 Warrior created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + warrior.getName() + "\n" + "❤️Hp: " + warrior.getHp() + "hp " + "\n" + "💪Strength: " + warrior.getStrength() + "\n" + "🦵Stamina: " + warrior.getStamina());
    
        return warrior;
    }

    private static Character wizardCharacterGenerator(){
        Scanner sc = new Scanner(System.in);
        String artWarrior = """
                                            *    .
                                     '  +   ___    @    .
                                         .-" __"-.   +
                                 *      /:.'`__`'.\\       '
                                     . |:: .'_ `. :|   *
                                @      |:: '._' : :| .
                                   +    \\:'.__.' :/       '
                                         /`-...-'\\  '   +
                                '       /         \\   .    @
                                  *     `-.,___,.-'     
                                """;

        artWarrior.lines().forEach(System.out::println);
        System.out.println("Enter name for wizard:");
        String name = sc.nextLine();
        System.out.println("Enter hp for wizard between 50-100:");
        int hp = sc.nextInt();
        Wizard wizard = new Wizard(name, hp);
        System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
        System.out.println("\uD83E\uDDD9\u200D️\uD83D\uDD2E Wizard created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + wizard.getName() + "\n" + "❤️Hp: " + wizard.getHp() + "hp " + "\n" + "🧠Intelligence: " + wizard.getIntelligence() + "\n" + "💠Mana: " + wizard.getMana());
    
        return wizard;
    }

    public static Character createRandomCharacter() {
        Character cha;
        int randomNum = (int) (Math.random() * 2) + 1;
        if (randomNum == 1) {
            cha = new Warrior(generateRandomName(), (int) (Math.random() * (200 - 100)) + 100);
            System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
            System.out.println("⚔️\uD83D\uDEE1 Warrior created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + cha.getName() + "\n" + "❤️Hp: " + cha.getHp() + "hp " + "\n" + "💪Strength: " + ((Warrior) cha).getStrength() + "\n" + "🦵Stamina: " + ((Warrior) cha).getStamina());
        } else {
            cha = new Wizard(generateRandomName(), (int) (Math.random() * (100 - 50)) + 50);
            System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
            System.out.println("\uD83E\uDDD9\u200D️\uD83D\uDD2E Wizard created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + cha.getName() + "\n" + "❤️Hp: " + cha.getHp() + "hp " + "\n" + "🧠Intelligence: " + ((Wizard) cha).getIntelligence() + "\n" + "💠Mana: " + ((Wizard) cha).getMana());
        }
        return cha;
    }
    private static ArrayList<String> fantasyNames = new ArrayList<>();

    static {
        fantasyNames.add("Gimli");
        fantasyNames.add("Legolas");
        fantasyNames.add("Aragorn");
        fantasyNames.add("Boromir");
        fantasyNames.add("Samwise");
        fantasyNames.add("Thorin");
        fantasyNames.add("Gollum");
        fantasyNames.add("Bilbo");
        fantasyNames.add("Eowyn");
        fantasyNames.add("Galadriel");
        fantasyNames.add("Arwen");
        fantasyNames.add("Elrond");
        fantasyNames.add("Gandalf");
        fantasyNames.add("Frodo");
        fantasyNames.add("Sauron");
        fantasyNames.add("Merlin");
        fantasyNames.add("Alfred");
        fantasyNames.add("Dumbledore");
        fantasyNames.add("Harry");
        fantasyNames.add("Hermione");
        fantasyNames.add("Ron");
        fantasyNames.add("Voldemort");
        fantasyNames.add("Ginny");
        fantasyNames.add("Draco");
        fantasyNames.add("Snape");
    }

    public static String generateRandomName() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(fantasyNames.size());
        return fantasyNames.get(randomIndex);
    }

}
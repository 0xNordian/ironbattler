
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        boolean intCheck = true;
        Character char1 = null;
        Character char2 = null;
        do {
            System.out.println("Select game mode:");
            System.out.println("1) Create characters");
            System.out.println("2) Create random characters");
            System.out.println("3) Exit");

            while(!sc.hasNextInt()){
                System.out.println("Please, enter a value number:");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid option, please select 1, 2 or 3");
                continue;
            }
            if (choice == 1) {
                System.out.println(TEXT_GREEN + "\033[3m `Welcome to the arena! Here to see the battle?  \033[23m" + TEXT_RESET);
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
        Battle.battle(char1, char2);
    }

    private static void battle() {
    }

    private static Character createCharacter(){
        Character cha = null;
        Scanner sc = new Scanner(System.in);
            //System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
            System.out.println(TEXT_GREEN + "\033[3m Choose a fighter! Pick one of those warriors... or perhaps a wizard.` \033[23m" + TEXT_RESET);
            System.out.println("Select class:");
            System.out.println("1) ⚔️ Warrior \uD83D\uDEE1️");
            System.out.println("2) \uD83E\uDDD9\u200D Wizard ️\uD83D\uDD2E");
            while(!sc.hasNextInt()){
                System.out.println("Please, enter a value number:");
                sc.next();
            }
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
        System.out.println(TEXT_GREEN + "\033[3m `Ah a warrior, then! Hope their sword is sharp...` ");
        System.out.println(" `What's their name?` \033[23m" + TEXT_RESET);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println(TEXT_GREEN + "\033[3m `" + name + "? Complete their registry for the battle, then.` \033[23m" + TEXT_RESET);
        System.out.println("Enter health points (between 100-200):");
        int hp = sc.nextInt();
        Warrior warrior = new Warrior(name, hp);
        System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
        System.out.println("⚔️\uD83D\uDEE1 Warrior created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + warrior.getName() + "\n" + "❤️ Hp: " + warrior.getHp() + "hp " + "\n" + "💪 Strength: " + warrior.getStrength() + "\n" + "🦵 Stamina: " + warrior.getStamina());
    
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
        System.out.println(TEXT_GREEN + "\033[3m `A wizard! Is their magic powder any good?` ");
        System.out.println(" `What's their name?` \033[23m" + TEXT_RESET);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println(TEXT_GREEN + "\033[3m `" + name + "? Complete their registry for the battle, then.` \033[23m" + TEXT_RESET);
        System.out.println("Enter health points (between 50-100):");
        int hp = sc.nextInt();
        Wizard wizard = new Wizard(name, hp);
        System.out.println("⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄");
        System.out.println("\uD83E\uDDD9\u200D️\uD83D\uDD2E Wizard created: " + "\n" + "⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄⌃⌄" + "\n" + "Name: " + wizard.getName() + "\n" + "❤️ Hp: " + wizard.getHp() + "hp " + "\n" + "🧠 Intelligence: " + wizard.getIntelligence() + "\n" + "💠 Mana: " + wizard.getMana());
    
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
        fantasyNames.add("Nestor");
        fantasyNames.add("Estel");
        fantasyNames.add("Jordi");
        fantasyNames.add("Dani");
        fantasyNames.add("Marina");
    }

    public static String generateRandomName() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(fantasyNames.size());
        return fantasyNames.get(randomIndex);
    }

    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_WHITE = "\u001B[37m";

}
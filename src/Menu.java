import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void startMenu() {
        String art = """

                ██ ██████   ██████  ███    ██ ██████   █████  ████████ ████████ ██      ███████\s
                ██ ██   ██ ██    ██ ████   ██ ██   ██ ██   ██    ██       ██    ██      ██     \s
                ██ ██████  ██    ██ ██ ██  ██ ██████  ███████    ██       ██    ██      █████  \s
                ██ ██   ██ ██    ██ ██  ██ ██ ██   ██ ██   ██    ██       ██    ██      ██     \s
                ██ ██   ██  ██████  ██   ████ ██████  ██   ██    ██       ██    ███████ ███████\s

                                      
                """;

        art.lines().forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        int choice;
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
                int count = 0;
                while (count < 2) {
                    System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
                    System.out.println("Create characters:");
                    System.out.println("1) Warrior ⚔️\uD83D\uDEE1️");
                    System.out.println("2) Wizard \uD83E\uDDD9\u200D️\uD83D\uDD2E");
                    int subChoice = sc.nextInt();
                    sc.nextLine();
                    if (subChoice < 1 || subChoice > 2) {
                        System.out.println("Invalid option, please select 1 or 2");
                        continue;
                    }
                    if (subChoice == 1) {
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
                        System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
                        System.out.println("Warrior created: " + "\n" + "Name: " + warrior.getName() + "\n" + "❤️Hp: " + warrior.getHp() + "hp " + "\n" + "💪Strength: " + warrior.getStrength() + "\n" + "🦵Stamina: " + warrior.getStamina());
                    } else if (subChoice == 2) {
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
                        System.out.println("⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝");
                        System.out.println("Wizard created: " + "\n" + "Name: " + wizard.getName() + "\n" + "❤️Hp: " + wizard.getHp() + "hp " + "\n" + "🧠Intelligence: " + wizard.getIntelligence() + "\n" + "💠Mana: " + wizard.getMana());
                    }
                    count++;
                }
                System.out.println("Let the battle begin!");
                break;
            } else if (choice == 2) {
                int count = 0;
                while (count < 2) {
                    createRandomCharacter();
                    count++;
                }
                System.out.println("Let the battle begin!");
                break;
            }
        } while (choice != 3);
    }

    public static void createRandomCharacter() {
        int randomNum = (int) (Math.random() * 2) + 1;
        if (randomNum == 1) {
            Warrior warrior = new Warrior(generateRandomName(), (int) (Math.random() * (200 - 100)) + 100);
            System.out.println("Warrior created: " + "\n" + "Name: " + warrior.getName() + "\n"  + "Hp: " + warrior.getHp() + "hp " + "\n"   + "Strength: " + warrior.getStrength() + "\n" + "Stamina: " + warrior.getStamina());
        } else {
            Wizard wizard = new Wizard(generateRandomName(), (int) (Math.random() * (100 - 50)) + 50);
            System.out.println("Wizard created: " + "\n" + "Name: " + wizard.getName() + "\n"  + "Hp: " + wizard.getHp() + "hp " + "\n"   + "Intelligence: " + wizard.getIntelligence() + "\n" + "Mana: " + wizard.getMana());
        }
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



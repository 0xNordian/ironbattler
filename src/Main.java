import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Warrior w1 = new Warrior("NT");
        //w1.attack();

        //Warrior w2 = new Warrior("Marina", 200000000);
        //w1.attack();

        Character player1 = createCharacter();

    }
    public static Character createCharacter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the arena, it's always good to see a new face.");
        System.out.println("Are you a WARRIOR (Insert: 1), or perhaps a WIZARD (Insert: 2)?");
        int classPick = Integer.parseInt(input.nextLine());
        String className = "";
        switch (classPick){
            case 1:
                className = "Warrior";
            case 2:
                className = "Wizard";
        }
        System.out.println("Oh I see. And what is your name, " + className + "?");
        String name = input.nextLine().toUpperCase();
        System.out.println("Well, " + name + ", I hope you are ready to fight.");
        Character character;
        switch (className){
            case "Warrior":
                character = new Warrior(name);
                break;
            case "Wizard":
                character = new Wizard(name);
                break;
            default:
                character = new Warrior(name);
                break;
        }
        return character;
    }
}
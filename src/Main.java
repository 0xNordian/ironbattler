public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("NT");
        //w1.attack();

        Warrior w2 = new Warrior("Marina", 200000000);
        //w1.attack();

        Wizard w3 = new Wizard("Marina", 200000000);



       w3.attack(w1);

    }
}
public abstract class Battle {

    public static void battle(Character cha1, Character cha2){
        while(cha1.isAlive() && cha2.isAlive()){
            cha1.attack(cha2);
            cha2.attack(cha1);
            if(cha1.getHp() <= 0) cha1.setAlive(false);
            if(cha2.getHp() <= 0) cha2.setAlive(false);
        }
        checkStatus(cha1, cha2);
    }

    public static void checkStatus(Character cha1, Character cha2){
        if(!cha1.isAlive() && !cha2.isAlive()){
            battle(cha1, cha2);
        }
        if(cha1.isAlive()) System.out.println("Cha1 Winner!");
        if(cha2.isAlive()) System.out.println("Cha2 Winner!");
    }
}

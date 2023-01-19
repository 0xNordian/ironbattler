public abstract class Battle {

    public static void battle(Character cha1, Character cha2){
        while(cha1.isAlive() && cha2.isAlive()){
            cha1.attack(cha2);
            cha2.attack(cha1);
            if(cha1.getHp() <= 0) cha1.setAlive(false);
            if(cha2.getHp() <= 0) cha2.setAlive(false);
            System.out.println("・・・・・・・・・・・・・・・・・・・・・・");
        }
        checkStatus(cha1, cha2);
    }

    public static void checkStatus(Character cha1, Character cha2){
        if(!cha1.isAlive() && !cha2.isAlive()){
            System.out.println("It's a tie. Fight Again!");
            cha1.setAlive(true);
            cha1.setHp(cha1.getMaxHp());
            // System.out.println("cha1 maxHp: " + cha1.getMaxHp());
            cha2.setAlive(true);
            cha2.setHp(cha2.getMaxHp());
            // System.out.println("cha2 maxHp: " + cha2.getMaxHp());
            battle(cha1, cha2);
        }
        System.out.println("\n");
        System.out.println("⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺");
        int cha1HpDiff = cha1.getMaxHp() - cha1.getHp();
        int cha2HpDiff = cha2.getMaxHp() - cha2.getHp();

        if (cha1.isAlive() && cha1 instanceof Warrior && cha2 instanceof Warrior) {
            System.out.println(cha1.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺" + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "⚔️🛡 " + cha1.getName() + " Final Stats:" + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "❤️ Original hp: " + ((Warrior) cha1).getMaxHp() + "\n" +
                    "❤️ Final hp: " + ((Warrior) cha1).getHp() + "\n" +
                    "🥊️️ Damage taken hp: " + cha1HpDiff + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +

                    "⚔️🛡 " + cha2.getName() + " Final Stats:" + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "️❤️ Original hp: " + ((Warrior) cha2).getMaxHp() + "\n" +
                    "💀 Final hp: " + ((Warrior) cha2).getHp() + "\n" +
                    "🥊️ Damage taken hp: " + cha2HpDiff + "\n"
            );
        } else if (cha1.isAlive() && cha1 instanceof Warrior && cha2 instanceof Wizard) {
                System.out.println(cha1.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                        "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                        "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                        "⚔️🛡 " + cha1.getName() + " Final Stats:"  + "\n" +
                        "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                        "❤️ Original hp: " + ((Warrior) cha1).getMaxHp()  + "\n" +
                        "❤️ Final hp: " + ((Warrior) cha1).getHp()  + "\n" +
                        "🥊️️ Damage taken hp: " + cha1HpDiff  + "\n\n" +
                        "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                        "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha2.getName() + " Final Stats:"  + "\n" +
                        "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                        "️❤️ Original hp: " + ((Wizard) cha2).getMaxHp()  + "\n" +
                        "💀 Final hp: " + ((Wizard) cha2).getHp()  + "\n" +
                        "🥊️ Damage taken hp: " + cha2HpDiff  + "\n"
                );
        } else if (cha1.isAlive() && cha1 instanceof Wizard && cha2 instanceof Wizard) {
            System.out.println(cha1.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha1.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "❤️ Original hp: " + ((Wizard) cha1).getMaxHp()  + "\n" +
                    "❤️ Final hp: " + ((Wizard) cha1).getHp()  + "\n" +
                    "🥊️️ Damage taken hp: " + cha1HpDiff  + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha2.getName() + " FinalStats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "️❤️ Original hp: " + ((Wizard) cha2).getMaxHp()  + "\n" +
                    "💀 Final hp: " + ((Wizard) cha2).getHp()  + "\n" +
                    "🥊️ Damage taken hp: " + cha2HpDiff  + "\n"
            );
        } else if (cha1.isAlive() && cha1 instanceof Wizard && cha2 instanceof Warrior) {
            System.out.println(cha1.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha1.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "❤️ Original hp: " + ((Wizard) cha1).getMaxHp()  + "\n" +
                    "❤️ Final hp: " + ((Wizard) cha1).getHp()  + "\n" +
                    "🥊️️ Damage taken hp: " + cha1HpDiff  + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                    "⚔️🛡 " + cha2.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "️❤️ Original hp: " + ((Warrior) cha2).getMaxHp()  + "\n" +
                    "💀 Final hp: " + ((Warrior) cha2).getHp()  + "\n" +
                    "🥊️ Damage taken hp: " + cha2HpDiff  + "\n"
            );
        }

        if (cha2.isAlive() && cha2 instanceof Warrior && cha1 instanceof Warrior) {
            System.out.println(cha2.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺" + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "⚔️🛡 " + cha2.getName() + " Final Stats:" + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "❤️ Original hp: " + ((Warrior) cha2).getMaxHp() + "\n" +
                    "❤️ Final hp: " + ((Warrior) cha2).getHp() + "\n" +
                    "🥊️️ Damage taken hp: " + cha2HpDiff + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +

                    "⚔️🛡 " + cha1.getName() + " Final Stats:" + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝" + "\n" +
                    "️❤️ Original hp: " + ((Warrior) cha1).getMaxHp() + "\n" +
                    "💀 Final hp: " + ((Warrior) cha1).getHp() + "\n" +
                    "🥊️ Damage taken hp: " + cha1HpDiff + "\n"
            );
        } else if (cha2.isAlive() && cha2 instanceof Warrior && cha1 instanceof Wizard) {
            System.out.println(cha2.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "⚔️🛡 " + cha2.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "❤️ Original hp: " + ((Warrior) cha2).getMaxHp()  + "\n" +
                    "❤️ Final hp: " + ((Warrior) cha2).getHp()  + "\n" +
                    "🥊️️ Damage taken hp: " + cha2HpDiff  + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha1.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "️❤️ Original hp: " + ((Wizard) cha1).getMaxHp()  + "\n" +
                    "💀 Final hp: " + ((Wizard) cha1).getHp()  + "\n" +
                    "🥊️ Damage taken hp: " + cha1HpDiff  + "\n"
            );
        } else if (cha2.isAlive() && cha2 instanceof Wizard && cha1 instanceof Wizard) {
            System.out.println(cha2.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha2.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "❤️ Original hp: " + ((Wizard) cha2).getMaxHp()  + "\n" +
                    "❤️ Final hp: " + ((Wizard) cha2).getHp()  + "\n" +
                    "🥊️️ Damage taken hp: " + cha1HpDiff  + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha1.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "️❤️ Original hp: " + ((Wizard) cha1).getMaxHp()  + "\n" +
                    "💀 Final hp: " + ((Wizard) cha1).getHp()  + "\n" +
                    "🥊️ Damage taken hp: " + cha1HpDiff  + "\n"
            );
        } else if (cha2.isAlive() && cha2 instanceof Wizard && cha1 instanceof Warrior) {
            System.out.println(cha2.getName().toUpperCase() + " IS THE WINNER!" + "\n" +
                    "⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺⌺"  + "\n\n" +

                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "\uD83E\uDDD9\u200D️\uD83D\uDD2E " + cha2.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "❤️ Original hp: " + ((Wizard) cha2).getMaxHp()  + "\n" +
                    "❤️ Final hp: " + ((Wizard) cha2).getHp()  + "\n" +
                    "🥊️️ Damage taken hp: " + cha2HpDiff  + "\n\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +

                    "⚔️🛡 " + cha1.getName() + " Final Stats:"  + "\n" +
                    "⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝⏜⏝"  + "\n" +
                    "️❤️ Original hp: " + ((Warrior) cha1).getMaxHp()  + "\n" +
                    "💀 Final hp: " + ((Warrior) cha1).getHp()  + "\n" +
                    "🥊️ Damage taken hp: " + cha1HpDiff  + "\n"
            );
        }
    }
}
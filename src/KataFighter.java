public class KataFighter {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter firstFighter;
        Fighter secondFighter;
        if (fighter1.name.equals(firstAttacker)) {
            firstFighter = fighter1;
            secondFighter = fighter2;
        }
        else{
            firstFighter = fighter2;
            secondFighter = fighter1;
        }
        while (true){
            secondFighter.health -= firstFighter.damagePerAttack;
            if (secondFighter.health <= 0) {
                System.out.printf("%s attacks %s: %s now has %d health and is dead. %s wins.%n",
                        firstFighter.name, secondFighter.name, secondFighter.name, secondFighter.health, firstFighter.name);
                return firstFighter.name;
            }
            System.out.printf("%s attacks %s; %s now has %d health.%n",
                    firstFighter.name, secondFighter.name, secondFighter.name, secondFighter.health);
            firstFighter.health -=secondFighter.damagePerAttack;
            if (firstFighter.health <= 0) {
                System.out.printf("%s attacks %s: %s now has %d health and is dead. %s wins.%n",
                        secondFighter.name, firstFighter.name, firstFighter.name, firstFighter.health, secondFighter.name);
                return secondFighter.name;
            }
            System.out.printf("%s attacks %s; %s now has %d health.%n",
                    secondFighter.name, firstFighter.name, firstFighter.name, firstFighter.health);
        }
    }
}

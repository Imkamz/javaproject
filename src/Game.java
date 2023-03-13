public class Game {
    public static void main(String[] args) {
        Player a = new Player("Bob");
        Player b = new Player("Tim");
        double playerASpeed = a.getSpeedPoints();
        double playerBSpeed = b.getSpeedPoints();
        boolean playerAFirst = playerASpeed > playerBSpeed;
        double playerAAttack = a.getAttackPoints();
        double playerBAttack = b.getAttackPoints();
        double playerADefence = a.getDefencePoints();
        double playerBDefence = b.getDefencePoints();


        int maxRounds = 1000;
        int roundNumber = 0;
        while (true) {
            roundNumber++;
            if (roundNumber > maxRounds) {
                break;
            }
            System.out.println("Round number: " + roundNumber);
            if (playerAFirst) {
                //player a attacks player b
                double damage = getDamage(playerAAttack, playerBDefence);
                b.setHealth(b.getHealth() - damage);
                System.out.println("Player B health: " + b.getHealth());
                if (b.getHealth() <= 0) {
                    System.out.println(a.getName() + " Wins");
                    break;
                }

            } else {
                //player b attacks player a
                double damage = getDamage(playerBAttack, playerADefence);
                a.setHealth(a.getHealth() - damage);
                System.out.println("Player A health: " + a.getHealth());
                if (a.getHealth() <= 0) {
                    System.out.println(b.getName() + " Wins");
                    break;}

            }
            playerAFirst = !playerAFirst;


        }
    }

    private static double getDamage(double attack, double defense) {
        if (attack == defense) {
            return 1;
        }
        double difference = attack - defense;
        if (difference > 0) {
            return difference * attack * 0.1;
        }
        return difference * defense * 0.1;
    }

}


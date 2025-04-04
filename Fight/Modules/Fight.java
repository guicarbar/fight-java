package Fight.Modules;

import java.lang.foreign.StructLayout;

public class Fight {
    // puxando os objetos
    private Fighter player;
    private Enemy enemy;

    // construtor
    public Fight(Fighter player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }


    // calcular round
    public boolean calcRound(int playerGolpe, int enemyGolpe) {
        // init dano
        int danoPlayer = 0;
        int danoEnemy = 0;

        // golpes player
        switch (playerGolpe) {
            case 1:
                // jab direto
                danoPlayer = player.jab();
                break;
            case 2:
                //  chute baixo
                danoPlayer = player.lowkick();
                break;
            case 3:
                // Cruzado de direita
                danoPlayer = player.cruzado();
                break;
            case 4:
                // chute alto
                danoPlayer = player.kick();
                break;
            default:
                System.out.println("erro");
                break;
        }


        // golpes enemy
        switch (enemyGolpe) {
            case 1:
                // jab direto
                danoEnemy = enemy.jab();
                break;
            case 2:
                //  chute baixo
                danoEnemy = enemy.lowkick();
                break;
            case 3:
                // Cruzado de direita
                danoEnemy = enemy.cruzado();
                break;
            case 4:
                // chute alto
                danoEnemy = enemy.kick();
                break;
            default:
                System.out.println("erro");
                break;
        }

        // calc menos vida
        if (danoPlayer > danoEnemy) {
            danoPlayer += 2;
        } else {
            danoEnemy += 2;
        }

        // int lifes analiser
        boolean playerStatus = player.reduxlife(danoEnemy);
        boolean enemyStatus = enemy.reduxlife(danoPlayer);


        // analisa a vida dos dois
        if (playerStatus == true && enemyStatus == true) {
            return false;
        } else {
            return true;
        }
    }
}

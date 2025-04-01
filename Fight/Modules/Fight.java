package Fight.Modules;

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
    public static void calcRound(int playerGolpe, int enemyGolpe) {
        // golpes player
        switch (playerGolpe) {
            case 1:
                // jab direto

                break;
            case 2:
                //  chute baixo

                break;
            case 3:
                // Cruzado de direita

                break;
            case 4:
                // chute alto

                break;
            case 5:
                // empurrar

                break;
            case 6:
                // defender

                break;
            default:
                System.out.println("erro");
                break;
        }


        // golpes enemy
        switch (enemyGolpe) {
            case 1:
                // jab direto

                break;
            case 2:
                //  chute baixo

                break;
            case 3:
                // Cruzado de direita

                break;
            case 4:
                // chute alto

                break;
            case 5:
                // empurrar

                break;
            case 6:
                // defender

                break;
            default:
                System.out.println("erro");
                break;
        }


        // iniciando o round
    }
}

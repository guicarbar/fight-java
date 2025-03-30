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


    // golpes iguais
    private static void equalsGolpes(int golpe) {
        switch (golpe) {
            case 1:
                // jab

                break;
            case 2:
                // chute baixo

                break;
            case 3:
                // cruzado

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
                // ble

                break;
        }
    }


    // golpes diferentes
    private static void diferentsGolpes(int playerGolpe, int enemyGolpe) {
            
    }


    // metods for fiht
    public static void comparGolpes(int playerGolpe, int enemyGolpe) {
        // verificador
        if (playerGolpe == enemyGolpe) {
            // para golpes iguais
            equalsGolpes(playerGolpe);
        } else {
            // para golpes diferentes
            diferentsGolpes(playerGolpe, enemyGolpe);
        }
    }
}

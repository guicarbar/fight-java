package Fight.Modules;

public class Fight {
    // var for fighter
    static Fighter player = null;


    // generate fighter
    public static void generateFighter(int characterSelect) {
        if (characterSelect == 1) {
            // noah
            player = new Fighter(80, 6, 80, 6, "Noah");
        } else if (characterSelect == 2) {
            // amelia
            player = new Fighter(50, 4, 100, 10, "Amelia");
        } else if (characterSelect == 3) {
            // ethan
            player = new Fighter(100, 10, 60, 3, "Ethan");
        } else {
            System.out.println("\nErro na geraçao do lutador escolhido!\n");
        }
    }
}

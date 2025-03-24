// package
package Fight.Resorces;


// import bibliotecas
import Fight.Modules.Enemy;
import Fight.Modules.Fighter;


// bibliotecas
import java.util.Random;

// init class
public class Resources {
    // to check strings
    public static int isValidString(String str) {
        if (str == null || str.isEmpty()) {
            return 1;
        } else {
            try {
                Integer.parseInt(str.trim());
                return 2;
            } catch (NumberFormatException e) {
                return 3;
            }
        }
    }


    // randomizar um numero
    public static int getRandomNumber(int scale) {
        // init random
        Random random = new Random();
        return random.nextInt(scale);
    }


    // metodo para confirmar a criaçao dos persnagens e inimigos
    public static boolean characterCreated(Fighter obj) {return obj != null;}
    public static boolean enemyCreated(Enemy obj) {return obj != null;}


    //
}
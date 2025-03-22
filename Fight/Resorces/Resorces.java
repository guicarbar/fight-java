// package
package Fight.Resorces;

// import bibliotecas
import java.util.Random;

// init class
public class Resorces {
    // to check strings
    public static int isValidString(String str) {
        if (str == null | str.isEmpty()) {
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
    public static int getRandomNumber() {
        // init random
        Random random = new Random();
        return random.nextInt(2);
    }
}

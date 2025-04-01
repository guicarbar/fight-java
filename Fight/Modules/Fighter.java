package Fight.Modules;

// import
import Fight.Resorces.Resources;

// character
public class Fighter {
    // definindo as variaveis
    protected int life;
    protected int strength;
    protected int stamina;
    protected int speed;
    protected String name;


    // constructor for character
    public Fighter(int life, int strength, int stamina, int speed, String name) {
        this.life = life;
        this.strength = strength;
        this.stamina = stamina;
        this.speed = speed;
        this.name = name;
    }


    // getters
    public int getLife() {return life;}
    public int getStrength() {return strength;}
    public int getStamina() {return stamina;}
    public int getSpeed() {return speed;}
    public String getName() {return name;}


    // calcular jab direto
    public void jab() {
        // dano total
        int danoTotal = 0;

        // numero de socos
        int punchNumbers = Resources.getRandomNumber(speed) + 1;

        // codigo pros socos
       for (int i = 0; i <= punchNumbers; i++) {
           // verifica estamina
           if (stamina >= 3) {
               System.out.println("Narradaor: " + getName() + " acerta outro soco!");
               danoTotal += strength - i;
               stamina -= 3;
           } else {
               // sem estamina pra isso
           }
       }
    }


    // chute baixo
    public void lowKick() {
        // dano total
    }


    // calcular chute baixo
    public void lowKick() {

    }
}

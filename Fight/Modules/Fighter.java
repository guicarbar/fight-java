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
    public void jab(int speed, String name) {
        int pushNumb = Resources.getRandomNumber(speed) + 1;
        switch (pushNumb) {
            case 1:
                System.out.println(name + " conseguiu dar " + pushNumb +" soco!");
                break;
            case 2:
                System.out.println(name + " conseguiu dar " + pushNumb +" soco!");
                break;
            case 3:
                System.out.println(name + " conseguiu dar " + pushNumb +" soco!");
                break;
            case 4:
                System.out.println(name + " conseguiu dar " + pushNumb +" soco!");
                break;
            case 5:
                System.out.println(name + " conseguiu dar " + pushNumb +" soco!");
                break;
            default:
                System.out.println("erro no soco");
                break;
        }
    }


    // calcular chute baixo
    public void lowKick() {

    }
}

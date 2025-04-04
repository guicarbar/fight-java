package Fight.Modules;

// import
import Fight.Resorces.Resources;

// character
public class Fighter {
    // definindo as variaveis
    protected int life;
    protected int strength;
    protected int speed;
    protected String name;


    // constructor for character
    public Fighter(int life, int strength, int speed, String name) {
        this.life = life;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
    }


    // getters
    public int getLife() {return life;}
    public int getStrength() {return strength;}
    public int getSpeed() {return speed;}
    public String getName() {return name;}

    // jab
    public int jab() {
        int critical = Resources.getRandomNumber(6);
        return strength + critical;
    }

    // lowKick
    public int lowkick() {
        int critical = Resources.getRandomNumber(8);
        return speed + critical;
    }

    public int cruzado() {
        int critical = Resources.getRandomNumber(8);
        return strength + critical;
    }

    public int kick() {
        int critical = Resources.getRandomNumber(11);
        return speed + critical;
    }


    // menos vida
    public boolean reduxlife(int dano) {
        // reduz a vida
        life -= dano;

        // verifica a vida
        if (life <= 0) {
            return false;
        } else {
            return true;
        }
    }
}

package Fight.Modules;

import Fight.Resorces.Resources;

public class Enemy extends Fighter {
    // construtor do enemy
    public Enemy(int life, int strength, int speed, String name) {
        super(life, strength, speed, name);
    }


    // jab
    public int jab() {
        int critical = Resources.getRandomNumber(5);
        return strength + critical;
    }

    // lowKick
    public int lowkick() {
        int critical = Resources.getRandomNumber(7);
        return speed + critical;
    }

    public int cruzado() {
        int critical = Resources.getRandomNumber(7);
        return strength + critical;
    }

    public int kick() {
        int critical = Resources.getRandomNumber(10);
        return speed + critical;
    }

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

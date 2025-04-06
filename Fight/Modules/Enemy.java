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

        // narrador falando
        System.out.println("\nNarrador: O golpe parece ter tirado " + dano + " de dano do seu oponente!\n");

        // verifica a vida
        boolean lifeTest = searchLife();
        return lifeTest;
    }

    // verifica vida para win
    public boolean searchLife() {
        if (life <= 0) {
            // morreu
            return false;
        } else {
            // vivo
            return true;
        }
    }
}

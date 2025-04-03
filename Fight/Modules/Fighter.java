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
        // inicia o dano total
        int danoTotal = 0;

        if (speed <= 3) {
            // dano total
            int kickAin = Resources.getRandomNumber(2);

            // verifica se acertou
            if (kickAin == 0) {
                // acertou
                danoTotal = strength /2;
            } else {
                // errou o chute
            }
        } else {
            danoTotal = strength /2;
        }
    }


    // cruzado de direita
    public void cruzado() {
        // luck for golpe
        int luck = Resources.getRandomNumber(10) + 1;

        switch (speed) {
            case 1:
                if (luck >= 7) {
                    // acerta
                } else {
                    // erra
                }
                break;
            case 2:
                if (luck >= 6) {
                    // acerta
                } else {
                    // erra
                }
                break;
            case 3:
                if (luck >= 5) {
                    // acerta
                } else {
                    // erra
                }
                break;
            case 4:
                if (luck >= 4) {
                    // acerta
                } else {
                    // erra
                }
                break;
            case 5:
                if (luck >= 3) {
                    // acerta
                } else {
                    // erra
                }
                break;
            default:
                // erro
                break;
        }
    }


    // chute alto
    public void highKick() {
        if (speed <=3 ) {
            int luck = Resources.getRandomNumber(2);
            if (luck == 0) {
                // acerta
            } else {
                // erra
            }
        } else {
            // acerta
        }
    }


    // empurrar
    public boolean empurrar() {
        return true;
    }
    

    // defender
    public boolean defesa() {
        return true;
    }
}

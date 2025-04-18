// biliotecas
import java.util.Scanner;

// imports internos
import Fight.Modules.Enemy;
import Fight.Modules.Fighter;
import Fight.Modules.Fight;
import Fight.Resorces.Resources;


// core main class
public class Core {
    // main function
    public static void main(String[] args) {
        // iniciando o scanner
        Scanner sc = new Scanner(System.in);

        // start menu
        boolean startMenu = true;
        do {
            // inicando game
            System.out.println("\nComeçar a luta? Precione ENTER para começar!");
            String answerStartMenu = sc.nextLine();

            // if-else doq deve ser feito
            if (Resources.isValidString(answerStartMenu) == 1) {
                startMenu = false;
            } else {
                System.out.println("\nApenas ENTER para começar!\n");
            }
        } while (startMenu == true);


        // select personagem
        boolean characterSelectLoop = true;
        int characterSelect = 0;
        do {
            // inicnado seleçao dos personagens
            System.out.println("\nEscolha o guerreiro que vai controlar:\n1. Noah\n2. Amelia\n3. Ethan\n\nDigite apenas o numero para saber mais sobre o lutador!");
            String answerCharacterMenuSTR = sc.nextLine();

            // if-else to check
            if (Resources.isValidString(answerCharacterMenuSTR) == 2) {
                // transforma em inteiro
                int answerCharacterMenuINT = Integer.parseInt(answerCharacterMenuSTR);

                // apresentando personagens
                switch (answerCharacterMenuINT) {
                    case 1:
                        System.out.println("\nNoah: Um lutador jovem e forte, com uma boa velocidade, resistência e durabilidade.\n");
                        break;
                    case 2:
                        System.out.println("\nAmelia: Uma lutadora extremamente rápida, com alta resistência. Seus golpes não são os mais fortes, e ela pode ser um pouco mais frágil.\n");
                        break;
                    case 3:
                        System.out.println("\nEthan: Um lutador experiente, extremamente forte e durável, com boa resistência, mas muito lento.\n");
                        break;
                    default:
                        System.out.println("\nDigite apenas numeros de personagens disponiveis!\n");
                        break;
                }

                // definindo se vai escolher ou nao o personagem
                System.out.println("Vai escolher esse personagem mesmo? y ou n");
                String confirmeCharacter = sc.nextLine();

                // confirmar a escolhar
                if (Resources.isValidString(confirmeCharacter) == 3) {
                    if (confirmeCharacter.equalsIgnoreCase("y") || confirmeCharacter.equalsIgnoreCase("yes")) {
                        // fializa o processo de seleçao de personagem
                        characterSelect = answerCharacterMenuINT;
                        characterSelectLoop = false;
                    } else {
                        // retorna ao inicio do processo de seleçao de personagem
                        System.out.println("\nOK! vamos conferir os outros personagens.");
                    }
                } else {
                    System.out.println("\nDigite apenas y ou n!\n");
                }
            } else {
                System.out.println("\nApenas numeros para começar!\n");
            }
        } while (characterSelectLoop == true);


        // var for fighter
        Fighter player = null;

        // gem player
        if (characterSelect == 1) {
            // noah
            player = new Fighter(80, 7, 3, "Noah");
        } else if (characterSelect == 2) {
            // amelia
            player = new Fighter(50, 4, 5, "Amelia");
        } else if (characterSelect == 3) {
            // ethan
            player = new Fighter(100, 10, 1, "Ethan");
        } else {
            System.out.println("\nErro na geraçao do lutador escolhido!\n");
        }

        // iniciando character
        System.out.println("\nVocê escolheu: " + player.getName() + "!");

        // aleatorizar o inimigo
        int oponent = Resources.getRandomNumber(3);
        Enemy enemy = null;
        if (oponent == 0) {
            // inimigo 1 - Klauss
            enemy = new Enemy(70, 5, 3, "Klauss");
        } else if (oponent == 1) {
            // oponente 2 - Beatrice
            enemy = new Enemy(80, 9, 2, "Beatrice");
        } else if (oponent == 2) {
            // oponent 3 - Dutch
            enemy = new Enemy(60, 5, 4, "Dutch");
        } else {
            System.out.println("Erro na randomização do oponente!");
        }


        // entrando no ring
        System.out.println(player.getName() + " Entra  no ring! Se preparando para a batalha olha para us frente e vê seu oponete nessa noite ...");


        // apresentando o inimigo para a luta
        System.out.println("\n Do outro lad do ring seu oponetne entra e a multidão vai a loucura! Seu  oponente da noite é: " + enemy.getName() + "\n");


        // inicia o objeto luta
        Fight luta = new Fight(player, enemy);

        // iniciando a luta
        boolean fightLoop = true;
        do {
            // verifica
            if (!Resources.characterCreated(player) && !Resources.enemyCreated(enemy)) {
                System.out.println("Ou inimigo ou player nn foi criado corretamente");
            } else {
                // luta
                System.out.println("Qual será sua ação ?\n1. Jab direto.\n2. Chute baixo.\n3. Cruzado de direita.\n4. Chute alto.\n\nDigite apenas o numero da opção!");
                String golpe = sc.nextLine();

                // verifica a escolha
                if (Resources.isValidString(golpe) == 2) {
                    // executa  a luta
                    // alet o golpe do inimigo
                    int enemyGolpe = Resources.getRandomNumber(6) + 1;

                    // simula oq vai acontecer na luta
                    boolean fightStatus = luta.calcRound(Integer.parseInt(golpe), enemyGolpe);

                    // verifica se a luta vai continuar
                    if (fightStatus == true) {
                        // luta termina
                        fightLoop = false;
                    } else {
                        // luta continua
                    }
                } else {
                    System.out.println("\nEscolha uma das opções!\n");
                }
            }
        } while (fightLoop == true);

        // verifica quem ganhou o game
        boolean playerLife = player.searchLife();
        boolean enemyLife = enemy.searchLife();

        if (playerLife == false && enemyLife == true) {
            // player morreu
            System.out.println("\nNarrador: Parece que " + player.getName() + " caiu no ring! e a luta chega ao final!\n\nSeu oponente ganhou a briga!\n" + enemy.getName() + " WINS!\n");
        } else if (enemyLife == false && playerLife == true) {
            // player ganhou
            System.out.println("\nNarrador: Parece que " + enemy.getName() + " caiu no ring! e a luta chega ao final!\n\nVocê ganhou!\n" + player.getName() + " WINS!\n");
        } else if (playerLife == false && enemyLife == false) {
            // empate
            System.out.println("\nNarrador: Parece que tanto " + player.getName() + " e " + enemy.getName() + " caiuram no ring!\nAssim a luta chega ao final com um empate!\n");
        }
    }
}

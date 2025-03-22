// biliotecas
import java.util.Scanner;

// imports
import Fight.Resorces.Resorces;


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
            if (Resorces.isValidString(answerStartMenu) == 1) {
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
            System.out.println("\nEscolha o guerreiro que vai controlar:\n1. Noah\n2. Amelia\n3. Ethan\n\nDigite apenas o numero para saber mais  sobre o guerreiro!");
            String answerCharacterMenuSTR = sc.nextLine();

            // if-else to check
            if (Resorces.isValidString(answerCharacterMenuSTR) == 2) {
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
                if (Resorces.isValidString(confirmeCharacter) == 3) {
                    if (confirmeCharacter.equalsIgnoreCase("y") || confirmeCharacter.equalsIgnoreCase("yes")) {
                        // fializa o processo de seleçao de personagem
                        characterSelect = answerCharacterMenuINT;
                        characterSelectLoop = false;
                        System.out.println("\nPersonagem escolhido!\n");
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
        
        
        // generate fighter
        if (characterSelect == 1) {
            // noah
        } else if (characterSelect == 2) {
            // amelia
        } else if (characterSelect == 3) {
            // ethan
        } else {
            System.out.println("\nErro na geraçao do lutador escolhido!\n");
        }


        // aleatorizar o inimigo
        int oponent = Resorces.getRandomNumber();
        if (oponent == 0) {
            // inimigo 1

        } else if (oponent == 1) {
            // oponente 2

        } else if (oponent == 2) {
            // oponent 3

        } else {
            System.out.println("Erro na randomização do oponente!");
        }


        // iniciando a luta
        boolean fightLoop = true;
        do {

        } while (fightLoop == true);


    }
}

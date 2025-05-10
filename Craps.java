package Cap6;
import java.security.SecureRandom;


public class Craps {

    private static final SecureRandom GeraNum = new SecureRandom();
    private enum Status{CONTINUE, WON, LOSE};
    private static final int SNAKEEYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YOLEVEN = 11;
    private static final int BOXCAR = 12;


    public static void main(String[] args) {

        int pontos = 0;
        Status GameStatus;

        int soma = RolarDados();

        switch (soma) {
            case SEVEN:
            case YOLEVEN:
                GameStatus = Status.WON;
                System.out.println("Oh yes! You won the game!!");
            case SNAKEEYES:
            case TREY:
            case BOXCAR:
                GameStatus = Status.LOSE;
                System.out.println("CRAAPS!! Bad lucky, guy!");
            default:
                GameStatus = Status.CONTINUE;
                System.out.println("Nem eu nem você, vamos continuar!");
                System.out.printf("Sua pontuação é: %s pontos.", soma);
                pontos += soma;

        while (GameStatus == Status.CONTINUE){

            System.out.println("Vamos para mais uma rodada! Cuidado para não tirar um 7\nGirando os dados..");

            soma = RolarDados();
            if (soma == 7){
                System.out.println("Que peninha.. Deu 7!");
                GameStatus = Status.LOSE;
            } else if (soma == pontos) {
                GameStatus = Status.WON;
            } else {
                System.out.printf("A soma dos seus dados foi: %d\n", soma);
            }

        }

        if (GameStatus == Status.WON){
            System.out.println("Você ganhou!! Você alcançou " +soma+ " pontos");
        } else {
            System.out.println("Você perdeu!! Você alcançou " +soma+ " pontos");
        }

        }
    }

    public static int RolarDados(){

        int dado1 = 1 + GeraNum.nextInt(6);
        int dado2 = 1 + GeraNum.nextInt(6);

        return dado1 + dado2;
    }

}

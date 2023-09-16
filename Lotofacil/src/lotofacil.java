import java.util.Scanner;
import java.util.Random;

public class lotofacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int escolha;

        do {
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("escolha um número de 0 a 100\n");
                    int numeroAposta =scanner.nextInt();
                    if (numeroAposta < 0 || numeroAposta > 100){
                        System.out.println("aposta inválida");
                        break;
                    }
                    else {
                        int apostanum = numeroAposta;
                        System.out.println("Sua aposta: " + apostanum);
                        int resultadonum = random.nextInt(101);
                        System.out.println("Resultado da aposta: "+resultadonum);
                        if (apostanum==resultadonum){
                            System.out.println("parabéns você ganhou 1000,00 Reais!!");
                        }
                        else System.out.println("Que pena! o número sorteado foi: "+ resultadonum);
                        break;
                    }
                case 2:
                    System.out.println("escolha uma letra de A a Z\n");
                    char letraAposta = scanner.next().charAt(0);
                    letraAposta = Character.toUpperCase(letraAposta);
                    char letraAleatoria = 'P';
                    if (Character.isLetter(letraAposta)) {
                        if (letraAposta == letraAleatoria) {
                            System.out.println("você ganhou 500,00 Reais!!");
                        }
                        else System.out.println("que pena! a letra sorteada foi: " + letraAleatoria);
                        }
                    else {
                        System.out.println("Aposta inválida!");;
                    }
                    break;
                case 3:
                    System.out.println("escolha número qualquer\n");
                    int numero = scanner.nextInt();
                    if (numero%2==0) {
                        System.out.println("Você ganhou R$100,00 Reais!!");
                    }
                    else System.out.println("Que pena! o número digitado é impar e a premiação foi para números pares.");
                    break;
                case 0:
                    System.out.println("Saindo do jogo LOTOFÁCIL. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}

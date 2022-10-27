import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int numero = 0, resto;
        System.out.println("Digite um número para saber se ele é par ou ímpar.");
        for (int i=1; i<=10; i++){
            System.out.printf("Digite o %dº número: \n",i);
            numero = leitura.nextInt();
            resto = numero % 2;
            if (resto == 0){
                System.out.printf("O número %d é PAR.\n\n",numero);
            } else {
                System.out.printf("O número %d é ÍMPAR.\n\n",numero);
            }
        }
    }
}

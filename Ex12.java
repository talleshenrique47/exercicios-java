import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int numeroPrimo = 0, divisivel = 0;
        System.out.printf("Digite um número para saber se ele é primo: ");
        numeroPrimo = leitura.nextInt();
        for (int i=1;i<=numeroPrimo;i++){
            if (numeroPrimo % i == 0){
                divisivel++;
            } 
        }
        System.out.printf("O número %d foi divisível %d vezes.\n",numeroPrimo,divisivel);
        if (divisivel == 2){
            System.out.println("Por este motivo ele é um número PRIMO.");
        } else {
            System.out.println("Por este motivo ele NÃO é um número PRIMO.");
        }
    }
}
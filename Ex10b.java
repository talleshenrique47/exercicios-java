import java.util.Scanner;

public class Ex10b {
    public static void main(String[] args){
        Scanner leitura = new Scanner (System.in);
        int numero = 0, somaNumeros = 0;
        System.out.println("Digite os números a serem somados.");
        for (int i=1; i<=10; i++){
            System.out.printf("Digite o %dº número: \n",i);
            numero = leitura.nextInt();
            somaNumeros = somaNumeros + numero;
        }
        System.out.printf("A soma total dos valores é de %d.\n",somaNumeros);
    }
}

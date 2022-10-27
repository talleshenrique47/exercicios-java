import java.util.Scanner;

public class Ex06 {
    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);
        int maiorValor = 0, menorValor = 0;
        for (int i=1; i<=10;i++){
            int valor = 0;
            System.out.printf("Digite o %dº numero: \n",i);
            valor = leitura.nextInt();
            if (valor > 0 && maiorValor == 0 && menorValor ==0){
                maiorValor = valor;
                menorValor = valor;
            } else {
                if (valor > maiorValor){
                    maiorValor = valor;
                } else {
                    if (valor < menorValor){
                        menorValor = valor;
                    }
                }
            }
        }
        System.out.printf("O maior número foi o %d e o menor número foi o %d.\n",maiorValor,menorValor);
    }
}

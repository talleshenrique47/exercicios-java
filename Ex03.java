import java.util.Scanner;
public class Ex03{
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        float avaliacao1, avaliacao2, mediaAvaliacao;
        System.out.println("Digite a nota da primeira avaliação: ");
        avaliacao1 = leitura.nextFloat();
        System.out.println("Digite a nota da segunda avaliação: ");
        avaliacao2 = leitura.nextFloat();
        mediaAvaliacao = (avaliacao1 + avaliacao2)/2;
        if (mediaAvaliacao >= 6){
            System.out.printf("Sua média foi de %f e você está APROVADO!\n",mediaAvaliacao);
        } else {
            System.out.printf("Sua média foi de %f e você está REPROVADO!\n",mediaAvaliacao);
        }
        }
    }
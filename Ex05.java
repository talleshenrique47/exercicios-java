import java.util.Scanner;
public class Ex05{
    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);
        String timeCasa, timeVisitante;
        int golCasa, golVisitante;
        System.out.println("Qual o nome do time da casa?");
        timeCasa= leitura.nextLine();
        System.out.println("Qual o nome do time visitante?");
        timeVisitante= leitura.nextLine();
        System.out.printf("Quantos Gols o %s fez?\n", timeCasa);
        golCasa= leitura.nextInt();
        System.out.printf("Quantos Gols o %s fez?\n", timeVisitante);
        golVisitante= leitura.nextInt();
        if (golCasa > golVisitante){
            System.out.printf("O time VENCEDOR foi o %s e o placar foi de %dx%d contra o %s.\n", timeCasa, golCasa, golVisitante, timeVisitante);      
        } else {
            if (golVisitante > golCasa){
                System.out.printf("O time VENCEDOR foi o %s e o placar foi de %dx%d contra o %s.\n", timeVisitante, golVisitante, golCasa, timeCasa);
            } else {
                System.out.printf("O jogo entre os times %s e %s acabou em EMPATE.\n", timeCasa, timeVisitante);
            }
        }
        }
        }
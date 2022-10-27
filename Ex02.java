import java.util.Scanner;
public class Ex02{
    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);
        float nota1, nota2, nota3, mediaFinal;
        System.out.println("Digite a primeira nota: ");
        nota1 = leitura.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = leitura.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = leitura.nextFloat();
        mediaFinal = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        System.out.printf("A sua media final é %f.\n", mediaFinal);
    }
}
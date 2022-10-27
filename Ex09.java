import java.util.Scanner;

public class Ex09 {
    public static void main(String [] args){
        Scanner leitura = new Scanner(System.in);
        int tabuada, resultado = 0;
        System.out.println("Digite qual tabuada você deseja: ");
        tabuada = leitura.nextInt();
        System.out.printf("Essa é a Tabuada do %d.\n",tabuada);
        for (int multiplicador=1; multiplicador<=10;multiplicador++){
            resultado = tabuada * multiplicador;
            System.out.printf("%d  x  %d  =  %d\n", tabuada, multiplicador, resultado);
        }
    }
}

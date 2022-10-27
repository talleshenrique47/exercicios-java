import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int x, y, z;
        System.out.println("Digite o Valor de x: ");
        x = leitura.nextInt();
        System.out.println("Digite o Valor de y: ");
        y = leitura.nextInt();
        z = (x*y)+5;
        System.out.println(z);
        if (z <= 0){
            System.out.println("A");
        } else {
            if (z <= 100){
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}

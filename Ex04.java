import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        String nome;
        int sexo;
        float pesoIdeal, alturacm, alturaM;
        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();
        System.out.println("Digite [0] para Masculino ou [1] para Feminino.");
        sexo = leitura.nextInt();
        System.out.println("Digite sua altura em cm: ");
        alturacm = leitura.nextFloat();
        alturaM = alturacm/100;
        if (sexo == 0){
            pesoIdeal = (float) ((72.7 * alturaM)-58);
            System.out.printf("%s seu peso ideal é %f.\n", nome, pesoIdeal);
        } else {
            if (sexo == 1){
                pesoIdeal = (float) ((62.1 * alturaM)-44.7);
                System.out.printf("%s seu peso ideal é de %f.\n", nome, pesoIdeal);
            } else {
                System.out.println("Erro: Digite [1] para Masculino ou [2] para Feminino.");
                System.out.println("Reiniciar o Programa.");
        }
    }
}
}

public class Ex07 {
    public static void main(String [] args){
        int tabuada;
        tabuada = 8;
        System.out.println("Essa é a tabuada do 8.");
        for(int multiplicador=1;multiplicador<=10;multiplicador++){
            int resultado = tabuada * multiplicador;
            System.out.printf("%d  x  %d  =  %d\n", tabuada, multiplicador, resultado);
        }
    }
}

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("quanros casas você quer em sua Fibonacci");
        int casaFibo=s.nextInt();
        int quantidadeElementos = casaFibo ; // Número de elementos da sequência
        int[] fibonacci = new int[quantidadeElementos];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < quantidadeElementos; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Sequência de Fibonacci com " + quantidadeElementos + " elementos:");
        for (int i = 0; i < quantidadeElementos; i++) {
        
        } 
        System.out.println("qual numero você deseja saber se está na fibonacci:");
        int numeroProcurado=s.nextInt();
        boolean achouNumero= false;
        for (int i=0;i<fibonacci.length;i++){
            if(fibonacci[i]==numeroProcurado){
                achouNumero= true;
                break;
            }

        }
        if (achouNumero==true) {
            System.out.println(numeroProcurado+" pertence ao fibonacci");
        }
        else{
            System.out.println(numeroProcurado+" nao pertence ao fibonacci");
        }
        
        s.close();
    }
}
    


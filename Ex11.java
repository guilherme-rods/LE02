//11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5. 
//Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140

import java.util.Scanner;

public class Ex11 {

    public static void executar() {
        
        System.out.println("Exercício 11:");

        Scanner scanner = new Scanner(System.in);

        int A[] = new int[5], B[] = new int [5];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o elemento A[" + i + "] do vetor: ");
            A[i] = scanner.nextInt();
        }

        for(int i = 0; i < B.length; i++){
            System.out.println("Digite o elemento B[" + i + "] do vetor: ");
            B[i] = scanner.nextInt();
        }

        System.out.println("Vetor A: {"+ A[0] +", "+ A[1] +", "+ A[2] +", "+ A[3] +", "+ A[4] +"}.");
        System.out.println("Vetor B: {"+ B[0] +", "+ B[1] +", "+ B[2] +", "+ B[3] +", "+ B[4] +"}.");

        int produto_escalar = 0;

        for(int i = 0; i < 5; i++){
            produto_escalar += A[i] * B[i];
        }

        System.out.println("O produto escalar dos vetores A e B: " + produto_escalar);

        scanner.close();
    }
}
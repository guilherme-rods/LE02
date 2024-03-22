//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, ou seja, 
//C contém os elementos de A seguidos dos elementos de B.

import java.util.Scanner;

public class Ex08 {

    public static void executar() {
        
        System.out.println("Exercício 08:");

        Scanner leitor = new Scanner(System.in);

        int A[] = new int[5], B[] = new int [5];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o elemento A[" + i + "] do vetor: ");
            A[i] = leitor.nextInt();
        }

        for(int i = 0; i < B.length; i++){
            System.out.println("Digite o elemento B[" + i + "] do vetor: ");
            B[i] = leitor.nextInt();
        }

        System.out.println("Vetor A: {"+ A[0] +", "+ A[1] +", "+ A[2] +", "+ A[3] +", "+ A[4] +"}.");
        System.out.println("Vetor B: {"+ B[0] +", "+ B[1] +", "+ B[2] +", "+ B[3] +", "+ B[4] +"}.");

        int C[] = new int [A.length + B.length];

        for(int i = 0; i < A.length; i++){
            C[i] = A[i];
        }

        for(int i = 0; i < B.length; i++){
            C[A.length + i] = B[i];
        }

        System.out.println("Resultado do Vetor C: ");

        for(int elemento : C){
            System.out.println(elemento + " ");
        }

        System.out.println("Vetor C: {"+ C[0] +", "+ C[1] +", "+ C[2] +", "+ C[3] +", "+ C[4] +", "+ C[5] +", "+ C[6] +", "+ C[7] +", "+ C[8] +", "+ C[9] +"}.");

        leitor.close();
    }
}
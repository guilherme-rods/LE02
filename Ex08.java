//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, ou seja, 
//C contém os elementos de A seguidos dos elementos de B.

import java.util.Scanner;

public class Ex08 {

    public static void executar() {
        
        System.out.println("Exercício 08:");

        Scanner leitor = new Scanner(System.in);

        int A[] = {1, 2, 3, 4, 5}, B[] = {6, 7, 8, 9, 10};

        System.out.println("Vetor A: {1, 2, 3, 4, 5}.");
        System.out.println("Vetor B: {6, 7, 8, 9, 10}.");

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

        leitor.close();

    }
}
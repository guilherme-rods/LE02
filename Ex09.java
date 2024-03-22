//9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras:
//a. Os elementos das posições pares de C são os elementos das posições pares de A;
//b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

import java.util.Scanner;

public class Ex09 {

    public static void executar() {
        
        System.out.println("Exercício 09:");

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

        int C[] = new int[5];

        for(int i = 0; i < 5; i++){
            if(i %2 == 0){
                C[i] = A[i];
            }
        }

        for(int i = 0; i < 5; i++){
            if(i %2 != 0){
                C[i] = B[i];
            }
        }

        System.out.println("Resultado do Vetor C: ");

        for(int elemento : C){
            System.out.println(elemento + " ");
        }

        System.out.println("Vetor C: {"+ C[0] +", "+ C[1] +", "+ C[2] +", "+ C[3] +", "+ C[4] +"}.");

        scanner.close();
    }
}
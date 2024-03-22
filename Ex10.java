//10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B de forma invertida. 
//Ou seja, o primeiro elemento de A é o último elemento de B, o segundo elemento de A é o penúltimo elemento de B, 
//e assim por diante.

import java.util.Scanner;

public class Ex10 {

    public static void executar() {
        
        System.out.println("Exercício 10:");

        Scanner scanner = new Scanner(System.in);

        int A[] = new int[5], B[] = new int [5];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o elemento A[" + i + "] do vetor: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Vetor A: {"+ A[0] +", "+ A[1] +", "+ A[2] +", "+ A[3] +", "+ A[4] +"}.");

        for(int i = 0; i < A.length; i++){
            B[i] = A[A.length - 1 - i] ;
        }

        System.out.println("Resultado do Vetor B: ");

        for(int elemento : B){
            System.out.println(elemento + " ");
        }

        System.out.println("Vetor B: {"+ B[0] +", "+ B[1] +", "+ B[2] +", "+ B[3] +", "+ B[4] +"}.");

        scanner.close();
    }
}
//12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos 
//pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

import java.util.Scanner;

public class Ex12 {

    public static void executar() {
        
        System.out.println("Exercício 12:");

        Scanner scanner = new Scanner(System.in);

        int V[] = new int[12];

        for(int i = 0; i < V.length; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor: ");
            V[i] = scanner.nextInt();
        }

        System.out.println("Vetor V: {"+ V[0] +", "+ V[1] +", "+ V[2] +", "+ V[3] +", "+ V[4] +", "+ V[5] +
        ", "+ V[6] +", "+ V[7] +", "+ V[8] +", "+ V[9] +", "+ V[10] +", "+ V[11] +"}.");

        int produto = 1;

        for(int i = 0; i < V.length; i++){
            if(V[i] %2 == 0 && V[i] > 0){
                produto *= V[i];
            }   
        }

        System.out.println("O produto dos elementos pares positivos é: " + produto);

        scanner.close();
    }
}
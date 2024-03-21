//2. Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, 
//logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero.

import java.util.Scanner;

public class Ex02 {

    public static void executar() {
        
        System.out.println("Exercício 02:");

        Scanner leitor = new Scanner(System.in);

        int i, v[] = new int [4];

        for(i = 0; i < 4; i++){
            System.out.println("Digite o elemento " + i + " do vetor: ");
            v[i] = leitor.nextInt();

            if(v[i] > 0){
                System.out.println("O elemento V[" + i + "] é positivo!");
            }
            else if(v[i] < 0){
                System.out.println("O elemento V[" + i + "] é negativo!");
            } 
            else{
                    System.out.println("O elemento V[" + i + "] é nulo ou igual a 0!");
            }
        }

            leitor.close();

    }

}

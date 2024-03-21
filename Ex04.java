//4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer, 
//depois mostre na tela o índice dos elementos que são inferiores a n.

import java.util.Scanner;

public class Ex04 {

    public static void executar() {
        
        System.out.println("Exercício 04:");

        Scanner leitor = new Scanner(System.in);

        int v[] = new int [5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor: ");
            v[i] = leitor.nextInt();
        }

        System.out.println("Digite um número inteiro qualquer: ");
        int n = leitor.nextInt();

        for(int i = 0; i < 5; i++){
            if(v[i] < n){
                System.out.println("O elemento V[" + i + "] do vetor é menor que o número inteiro escolhido!");
            }
        }

        leitor.close();
    }

}
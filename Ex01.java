//1. Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, 
//calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média.

import java.util.Scanner;

public class Ex01 {

    public static void executar() {
        
        System.out.println("Exercício 01:");

        Scanner leitor = new Scanner(System.in);

        int i, vetor[] = new int[5];
        double soma = 0, media;

        for(i = 0; i < 5; i++){
            System.out.println("Digite o elemento " + i + " do vetor: ");
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }

        media = soma / 5.0;

        System.out.println("Média: " + media);

        System.out.println("Números menores que a média:");
        for(i = 0; i < 5; i++){
            if(vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Números iguais a média:");
        for(i = 0; i < 5; i++){
            if(vetor[i] == media){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Números maiores que a média:");
        for(i = 0; i < 5; i++){
            if(vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }

        leitor.close();

    }

}

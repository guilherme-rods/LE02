//3. Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. 
//Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor.

import java.util.Scanner;

public class Ex03 {

    public static void executar(){
        
        System.out.println("Exercício 03:");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Defina o tamanho dos vetores V1 e V2: ");
        int tam = leitor.nextInt();

        int v1[] = new int [tam]; 

        for(int i = 0; i < tam; i++){
            System.out.println("Digite o elemento v[" + i + "] do vetor: ");
            v1[i] = leitor.nextInt();
        }

        System.out.println("Vetor 2 com valores dobrados: ");

        int v2[] = new int [tam];

        for(int i = 0; i < tam; i++){
            v2[i] = v1[i] * 2;
        }

        for(int i = 0; i < tam; i++){
            System.out.println("Elemento V[" + i + "]: " + v2[i]);
        }

        leitor.close();
    }

}

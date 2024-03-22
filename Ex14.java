//14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última posição do vetor. 
//Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela.

import java.util.Scanner;

public class Ex14 {

    public static void executar() {
        
        System.out.println("Exercício 14:");

        Scanner scanner = new Scanner(System.in);

        int V[] = new int[5];

        for(int i = 0; i < V.length; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor: ");
            V[i] = scanner.nextInt();
        }

        System.out.println("Vetor V: {"+ V[0] +", "+ V[1] +", "+ V[2] +", "+ V[3] +", "+ V[4] +"}.");

        int maior = V[0];
        int posicaoMaior = 0;

        for(int i = 0; i < V.length; i++){
            if(V[i] > maior){
                maior = V[i];
                posicaoMaior = i;
            }
        }

        int ultimaPosicao = V[V.length - 1];
        V[V.length - 1] = maior;
        V[posicaoMaior] = ultimaPosicao;

        System.out.println("Resultado do Vetor alterado: ");

        for(int elemento : V){
            System.out.println(elemento + " ");
        }

        System.out.println("Vetor V atualizado: {"+ V[0] +", "+ V[1] +", "+ V[2] +", "+ V[3] +", "+ V[4] +"}.");

        scanner.close();
    }
}
//5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor. 
//Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor.

import java.util.Scanner;

public class Ex05 {

    public static void executar() {
        
        System.out.println("Exercício 05:");

        Scanner leitor = new Scanner(System.in);

        int v[] = new int [5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor: ");
            v[i] = leitor.nextInt();
        }

        System.out.println("Digite um número inteiro qualquer: ");
        int n = leitor.nextInt();

        int contador = 0;

        for(int i = 0; i < 5; i++){
            if(n == v[i]){
                contador++;
            }
        }

        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");

        leitor.close();
    }

}

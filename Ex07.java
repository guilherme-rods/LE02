//7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não. 
//Para serem iguais, todos os elementos dos dois vetores devem coincidir.

import java.util.Scanner;

public class Ex07 {

    public static void executar() {
        
        System.out.println("Exercício 07:");

        Scanner leitor = new Scanner(System.in);

        int v1[] = new int [5], v2[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor 1: ");
            v1[i] = leitor.nextInt();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o elemento V[" + i + "] do vetor 2: ");
            v2[i] = leitor.nextInt();
        }

        boolean verificador = true;

        for(int i = 0; i < 5; i++){
            if(v1[i] != v2[i]){
                verificador = false;
                break;   
            }
        }

        if(verificador){
            System.out.println("Os dois vetores são exatamente iguais!");
        }else{
            System.out.println("Os dois vetores não são exatamente iguais!");
        }

        leitor.close();
    }
}
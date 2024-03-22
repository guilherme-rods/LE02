//13. Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência de Fibonacci. 
//Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}.

import java.util.Scanner;

public class Ex13 {

    public static void executar() {
        
        System.out.println("Exercício 13:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int n1 = 1;
        int n2 = 1;
        int next;

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

        for(int i = 1; i <= n; i++){
            System.out.println(n1 + " ");
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        } 
        scanner.close();
    }
}
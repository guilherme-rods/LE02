//15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra: 
//com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior. 
//Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5.

import java.util.Scanner;

public class Ex15 {
    public static void executar() {

        System.out.println("Exercício 15:");

        Scanner scanner = new Scanner(System.in);
        
        int v[] = new int[5];

        System.out.print("Digite o 1º número do vetor: ");
        v[0] = scanner.nextInt();

        for (int i = 1; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do vetor: ");
            int numero = scanner.nextInt();
            
            if (numero > v[i - 1]) {
                v[i] = numero;
            } else {
                System.out.println("Número inválido! O número deve ser maior que o anterior.");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");

        for (int elemento : v) {
            System.out.print(elemento + " ");
        }

        scanner.close();
    }
}

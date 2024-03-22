//6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e 
//calcule a média ponderada do aluno.
//Média ponderada =
//nota1 * peso1 + nota2 * peso2 + nota3 * peso3
//peso1 + peso2 + peso3
//Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)

import java.util.Scanner;

public class Ex06 {

    public static void executar(){

        System.out.println("Exercício 06:");

        Scanner leitor = new Scanner(System.in);

        double nota[] = new double [5], peso[] = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite a nota " + (i + 1) + " do aluno:");
            nota[i] = leitor.nextDouble();
        }

        double soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o peso da nota " + (i + 1) + ": ");
            peso[i] = leitor.nextDouble();
            soma += peso[i];
        }

        double mediapond = 0, notaxpeso = 0;

        for(int i = 0; i < 5; i++){
            notaxpeso += nota[i] * peso[i];
        }

        mediapond = notaxpeso / soma;

        System.out.println("A média ponderada do aluno é: " + String.format("%.2f", mediapond));

        leitor.close();
    }
}
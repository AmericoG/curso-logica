package logicadeprogramacao.src.Arrays.multidimensionais;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        double notas[][] = new double[3][4];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as notas dos alunos");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno: " + (i + 1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1));
                notas[i][j] = teclado.nextDouble();
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno: " + (i + 1));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + " = " + notas[i][j]);
            }
        }
    }
}

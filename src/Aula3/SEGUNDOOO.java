package Aula3;

import java.util.Scanner;

public class SEGUNDOOO {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);
        System.out.println("Informe o nome do usuário:");
        String nome = leitorDeDados.next();
        System.out.println("Informe o salário do usuário:");
        double salario = leitorDeDados.nextDouble();


        double porcentagemDeAumento = 10;
        double salarioReajustado = salario + (salario / 100 * porcentagemDeAumento);

        System.out.println(nome+"GANHARA = " + salarioReajustado);

    }
}

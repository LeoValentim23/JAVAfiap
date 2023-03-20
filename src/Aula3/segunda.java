package Aula3;

import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);
        System.out.println("Informe a nota 1 do usuário:");
        int nota1 = leitorDeDados.nextInt();
        System.out.println("Informe a nota 2 do usuário:");
        int nota2 = leitorDeDados.nextInt();
        System.out.println("Informe a nota 3 do usuário:");
        int nota3 = leitorDeDados.nextInt();

        int media = (nota1+nota2+nota3)/3 ;
        int mult = (nota1*nota2*nota3);
        System.out.println(mult);
        System.out.println(media);
    }
}

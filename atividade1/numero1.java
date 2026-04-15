package atividade1;
import java.util.Scanner;

class Numero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int maior = 0;
        int menor = 0;
        int media = 0;
        int totalNumeros = 0;
        while (num != -1) {
            System.out.println("Digite um número(ou -1 para sair): ");
            num = sc.nextInt();
            if (num == -1)
                break;
            if (num > maior)
                maior = num;
            if (num < menor)
                menor = num;
            if (menor == 0)
                menor = num;
            if (maior == 0)
                maior = num;
            media += num;
            totalNumeros++;
        }
        media = media / totalNumeros;
        System.out.println("Você digitou " + totalNumeros + " números.");
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);
    }
}
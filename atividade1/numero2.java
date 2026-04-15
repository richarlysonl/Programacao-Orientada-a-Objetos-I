package atividade1;
import java.util.Scanner;

class Numero2 {
    public static void main(String[] args) {
        System.out.println("digite o numero");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int soma = 0;
        num = num.replace(" ", "");
        if (num.length() <= 1 || !num.matches("\\d+")) {
            System.out.println("numero invalido tem que ser maior do que 1 digito e apenas digitos");
            return;
        }
        int[] digitos = new int[num.length()];
        for (int i = num.length() - 1; i >= 0; i--) {
            digitos[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (i % 2 == 0) {
                digitos[i] = digitos[i] * 2;
                if (digitos[i] > 9)
                    digitos[i] -= 9;
            }
        }
        for (int i = 0; i < num.length(); i++) {
            System.out.println("numero [" + i + "] =" + digitos[i]);
            soma += digitos[i];
        }
        System.out.println(soma);
        if (soma % 10 == 0)
            System.out.println("Este número é válido!");
        else
            System.out.println("o número não é valido");
    }
}

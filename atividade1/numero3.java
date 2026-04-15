package atividade1;
import java.util.Scanner;

class Numero3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diferencas = 0;
        System.out.println("digite a 1 fita de DNA");
        String fita1 = sc.nextLine();
        System.out.println("digite a 2 fita de DNA");
        String fita2 = sc.nextLine();
        if (fita1.length() != fita2.length() || !fita1.matches("[CAGT]+") || !fita2.matches("[CAGT]+")) {
            System.out.println("fitas com tamanho diferentes ou de forma errada");
            return;
        }
        char[] seq1 = fita1.toCharArray();
        char[] seq2 = fita2.toCharArray();
        for (int i = 0; i < fita1.length(); i++) {
            if(seq1[i] != seq2[i])
                diferencas+= 1;
        }
        System.out.println("Eles têm "+diferencas+" diferenças e, portanto, a distância de Hamming é "+diferencas+".");
    }
}

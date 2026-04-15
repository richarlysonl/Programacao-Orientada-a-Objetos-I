package num2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("digite o ISBN (10 numero)");
        String isbn = scanner.nextLine();
        String[] numeros = isbn.split("-");
        String aux = "";
        for(int i = 0; i < numeros.length ; i++){
            aux += numeros[i];
        }
        int verificacao = 0;
        for(int i = 0; i < aux.length() ; i++){
            String caracter = String.valueOf(aux.charAt(i));
            if(caracter.equals("X")){
                num[i] = 10;
            }
            num[i] = Integer.parseInt(caracter);
        }
        for(int i = 0; i < num.length ; i++){
            verificacao += num[i] * i;
        }
        if(verificacao % 2 == 0)
            System.out.println("ISBN-10 valido");
        else
            System.out.println("ISBN-10 Invalido");
    }
}

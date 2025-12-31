import java.util.Scanner;

public class collatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introdueix un número positiu: ");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("Error! Ha de ser positiu. Torna a introduir: ");
            numero = sc.nextInt();
        }

        
        int numeroInicial = numero;


        System.out.println("\nSeqüència de Collatz per al nombre " + numeroInicial + ":");
        System.out.print(numero);
        
        int passos = 0;

        while (numero != 1) {

            // Comprovem si és parell o imparell
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.print(" → " + numero);
            passos++;
        }
        System.out.println();  // Salt de línia
        System.out.println("\nTotal de passos: " + passos);

        sc.close();
    }
}

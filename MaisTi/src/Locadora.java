import java.util.Scanner;

public class Locadora {
        public static double locadora  (int kmCliente){
            int km = 100;
            int contKm = 100;
            double kmRodado = 90;

            if (kmCliente > km){
                do {
                    contKm ++;
                    km = contKm;
                    kmRodado += 12;
                }while (km !=  kmCliente);
            }
            return kmRodado;
        }

        public static void main (String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Dias rodados: ");
            int dias = input.nextInt();
            System.out.println("km rodados: ");
            int kmClienterodado = input.nextInt();

            System.out.println("Você ficou com o carro alugado por "+dias+" dias.");
            System.out.println("Valor gasto:  R$"+locadora(kmClienterodado));

        }
    }


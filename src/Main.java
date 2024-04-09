import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        LinkedList<String> casos = new LinkedList<>();
        LinkedList<String> ejecutables = new LinkedList<>();
        casos.add("caso1");
        casos.add("caso2");
        casos.add("caso3");
        casos.add("caso4");
        casos.add("caso5");
        casos.add("caso6");
        casos.add("caso7");
        ejecutables.add("1");
        ejecutables.add("2");
        ejecutables.add("3");
        ejecutables.add("4");
        ejecutables.add("5");
        ejecutables.add("6");
        ejecutables.add("7");
        ejecutables.add("8");


        Comando prueba = new Comando();


        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un número del 1 al 8 (o 9 para salir): ");

            numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    prueba.crearComando(casos, numero);
                    break;
                case 2:
                    prueba.crearComando(casos, numero);
                    break;
                case 3:
                    prueba.crearComando(casos, numero);
                    break;
                case 4:
                    prueba.crearComando(casos, numero);
                    break;
                case 5:
                    prueba.crearComando(casos, numero);
                    break;
                case 6:
                    prueba.crearComando(casos, numero);
                    break;
                case 7:
                    prueba.crearComando(casos, numero);
                    break;
                case 8:
                    prueba.crearComando(casos, numero);
                    break;
                case 9:
                    prueba.crearComando(casos, numero);
                    break;
            }
        } while (numero != 9);

    }
}
import java.io.*;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        LinkedList<String> casos = new LinkedList<>();
        LinkedList<String> ejecutables = new LinkedList<>();
        casos.add("caso1");
        casos.add("caso2");
        casos.add("caso3");
        ejecutables.add("1");
        ejecutables.add("2");
        ejecutables.add("3");
        ejecutables.add("4");
        ejecutables.add("5");
        ejecutables.add("6");
        ejecutables.add("7");
        ejecutables.add("8");

        Validacion val = new Validacion();
        Comando prueba = new Comando();
        prueba.crearComando(casos, ejecutables);

    }
}
import java.io.*;
import java.util.LinkedList;

public class Comando {

    public void crearComando(LinkedList<String> casosA, LinkedList<String> ejecutables) throws IOException, InterruptedException {
        LinkedList<String> casos = casosA;


        for(String f: ejecutables) {
            for(String e: casos)
            {
                BufferedReader entrada = null;
                BufferedWriter salida = null;
                BufferedWriter salida2 = null;
                BufferedWriter salida3 = null;
                String bat = "C:\\Users\\Emmanuel\\Desktop\\H_Clinicas\\ArchivosBat\\testBat"+f+e+".bat";
                String batCopy = "C:\\Users\\Emmanuel\\Desktop\\H_Clinicas\\ArchivosBat\\testBatCopy" +f+e+".bat";
                try
                {

                    entrada = new BufferedReader(new FileReader("C:\\Users\\Emmanuel\\Desktop\\H_Clinicas\\LotePrueba\\"+e+".txt"));
                    salida = new BufferedWriter(new FileWriter("C:\\Users\\Emmanuel\\Desktop\\H_Clinicas\\h_clinicas.in",false));
                    salida2 = new BufferedWriter(new FileWriter(bat));
                    salida3 = new BufferedWriter(new FileWriter(batCopy));
                    String line;
                    while((line=entrada.readLine())!=null)
                    {
                        salida.write(line+ "\n");
                    }

                    salida2.write("cd C:\\Users\\Emmanuel\\Desktop\\H_Clinicas \n");
                    salida2.write("hClinicas_"+f+".exe h_clinicas");

                    salida3.write("cd C:\\Users\\Emmanuel\\Desktop\\H_Clinicas \n");
                    salida3.write("COPY hc_ordenado.out Resultados\\"+f+e+".txt");

                }
                finally {
                    if(salida != null)
                    {
                        salida.close();
                    }
                    if(entrada != null)
                    {
                        entrada.close();
                    }
                    if (salida2 != null)
                    {
                        salida2.close();
                    }
                    if(salida3 != null)
                    {
                        salida3.close();
                    }

                }
                this.ejecutar(bat, batCopy);
            }
        }


    }
    public void ejecutar(String bat, String batCopy) throws IOException, InterruptedException {
        String comando = bat;
        String comando2 = batCopy;

        Process proceso = Runtime.getRuntime().exec(comando);
        Thread.sleep(100);
        Process proceso2 = Runtime.getRuntime().exec(comando2);

    }


}





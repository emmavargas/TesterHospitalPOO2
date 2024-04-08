import java.io.*;
import java.util.LinkedList;

public class Validacion {

    LinkedList<String> lineasValidadas = new LinkedList<>();

    public Validacion()
    {
        lineasValidadas.add("2 Angel Croce");
        lineasValidadas.add("5 Pedro Picapiedras");
        lineasValidadas.add("6 Nadia Nicomedes");
        lineasValidadas.add("7 Pablo Marmol");
        lineasValidadas.add("9 Abel Avila");
        lineasValidadas.add("10 Nicanor Gonzalez");
        lineasValidadas.add("15 Victor Tazo");
        lineasValidadas.add("16 Zoilo Zenon");
        lineasValidadas.add("23 Toribio Tevez");
        lineasValidadas.add("40 Eduardo Sport");
        lineasValidadas.add("55 Alberto Lopez");


    }
    public void validarResultado() throws IOException
    {

        for(int i=1; i<9;i++)
        {
            for(int j=1;j<3;j++)
            {
                String direccion= "C:\\Users\\Emmanuel\\Desktop\\H_Clinicas\\Resultados\\"+i+"caso"+j+".txt";
                BufferedReader in = null;
                BufferedWriter out = null;
                try
                {
                    in = new BufferedReader(new FileReader(direccion));
                    out = new BufferedWriter(new FileWriter(direccion,true));
                    String line;
                    int numeroValidado=0;
                    while( (line = in.readLine()) != null)
                    {
                        if(!(line.equals(lineasValidadas.get(numeroValidado))))
                        {
                            out.write("false");
                        }
                        numeroValidado++;
                    }
                }
                finally {
                    if(in!=null)
                    {
                        in.close();
                    }
                    if(out!=null)
                    {
                        out.close();
                    }
                }
            }
        }

    }

}

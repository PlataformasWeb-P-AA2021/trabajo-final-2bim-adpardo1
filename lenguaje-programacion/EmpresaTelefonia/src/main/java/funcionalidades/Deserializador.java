package funcionalidades;

import entidades.PlanCelular;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static funcionalidades.Printer.println;

public class Deserializador extends FileHandler {
    public Deserializador(String fileName) {
        super(fileName);
    }

    public ArrayList<PlanCelular> deserializeData() throws IOException, ClassNotFoundException {
        //Para evitar que se esten obteniendo los datos del archivo continuamente, se almacenan en memoria hasta que
        //finalice el programa.
        //Por lo tanto, cada vez que se tratÃ© de deserializar los datos, se comprueba primeramente si ya están cargados,
        //en memoria para así­, evitar el exceso de consumo de recursos.

        if(idDataLoaded == true)  {
            return data;
        }else{
            FileInputStream fileInputStream = new FileInputStream(this.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<PlanCelular> dataResult = (ArrayList<PlanCelular>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            idDataLoaded = true;
            println("Datos obtenidos correctamente.", "done");
            data = dataResult;
            return dataResult;
        }
    }
}

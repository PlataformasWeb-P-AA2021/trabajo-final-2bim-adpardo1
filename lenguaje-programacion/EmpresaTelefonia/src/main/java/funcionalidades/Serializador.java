package funcionalidades;

import entidades.PlanCelular;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static funcionalidades.Printer.println;

public class Serializador extends FileHandler{
    Deserializador deserializer = new Deserializador("");
    public Serializador(String fileName) { super(fileName); }

    public void serializeData(PlanCelular plan) throws IOException, ClassNotFoundException {
        if(idDataLoaded == false){
            idDataLoaded = true;
            data = deserializer.deserializeData();
        }

        //Una vez obtenidos los datos ya sea de memoria o del archivo, se le agrega el nuevo plan que se trata de ingresar,
        //y se los datos de vuelven a serializar
        data.add(plan);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(data);
        objectOutputStream.close();
        fileOutputStream.close();
        println("  Datos correctamente guardados.", "done");
    }
}


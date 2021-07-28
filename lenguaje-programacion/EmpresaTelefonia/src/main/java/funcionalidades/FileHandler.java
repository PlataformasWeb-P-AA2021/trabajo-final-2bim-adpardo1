package funcionalidades;
import java.io.Serializable;
import java.util.ArrayList;
import entidades.PlanCelular;

/*Esta clase ha sido creada para contener algunos metodos y codigo que se 
repetit­a en la clase Serializador y Deserializador
Sirve como intermediario en el proceso de obtener y guardar datos, 
para que la clase Serializador o Deserializador eviten realizar procesos innecesarios.
Ademas, se encarga de obtener la ruta completa del archivo que se desea usar, 
por lo tanto, las 2 subclases pueden usar dicha ruta para hacer input y output*/

public class FileHandler implements Serializable {
    protected ArrayList<PlanCelular> data;
    protected String fileName;
    protected boolean idDataLoaded;

    public FileHandler(String fileName) {
        if (fileName.equals("")) this.fileName = "planes.data";
        else this.fileName = fileName;
        this.fileName = System.getProperty("user.dir") +"/"+ this.fileName;
        data = new ArrayList<>();
    }

    public ArrayList<PlanCelular> getData() {return data; }

    public void setData(ArrayList<PlanCelular> data) {this.data = data; }

    public String getFileName() {return fileName; }

    public void setFileName(String fileName) {
        this.fileName = System.getProperty("user.dir") +"/"+ this.fileName;
    }
}

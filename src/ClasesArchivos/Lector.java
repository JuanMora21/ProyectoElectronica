
package ClasesArchivos;

import java.io.File;
import java.util.ArrayList;

public interface Lector {
    public File seleccionarArchivo();
    public ArrayList<String> leerArchivo(File archivoTexto);
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipal;

import ClasesArchivos.Escritor;
import ClasesArchivos.Lector;
import ClasesArchivos.LectorEscritorTextoPlano;
import G.U.I.VentanaPrincipal;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN MORA
 */
public class ProyectoElectronica {

    /**
     * @param args the command line arguments
     */
    String nombreArchivo;
    public static void main(String[] args) {
            
         ProyectoElectronica proyecto = new ProyectoElectronica();
        Lector lector = new LectorEscritorTextoPlano();
        Escritor escritor = new LectorEscritorTextoPlano();
        VentanaPrincipal interfaz = new VentanaPrincipal(proyecto, lector);
        interfaz.setVisible(true);
        
    }
     public ArrayList<String> cargarArchivo(Lector lector) {
        File archivo = lector.seleccionarArchivo();
        setNombreArchivo(archivo.getName());
        if(archivo.getName().endsWith("txt")){
            ArrayList<String> elementos = lector.leerArchivo(archivo);
            return elementos;    
        }else{
            JOptionPane.showMessageDialog(null, "Este archivo no es aceptado, selecciona un archivo .txt.");
        }
        return null;
    }
    public void setNombreArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
}

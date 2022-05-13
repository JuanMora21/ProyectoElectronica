/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author juani
 */
public class LectorEscritorTextoPlano implements Lector,Escritor{
    @Override
    public File seleccionarArchivo() {
        File archivo;
        JFileChooser seleccionar = new JFileChooser();
        if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo = seleccionar.getSelectedFile();
            return archivo;
        }
        return null;
    }

    @Override
    public ArrayList<String> leerArchivo(File archivoTexto) {
        Charset charset = Charset.forName("UTF-8");
        
        Path inFile = null;
        try {
            inFile = Paths.get(archivoTexto.getCanonicalPath());
        } catch (IOException ex) {
        }

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(inFile, charset);
        } catch (IOException ex) {
        }
        
        
        ArrayList<String> conjunto = new ArrayList();
        String line = null;
        int index = 0;
        
        try {
            while((line = reader.readLine()) != null){
                conjunto.add(line);
                System.out.println(index + ": " + conjunto.get(index));
                index++;
            }
        } catch (IOException ex) {
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(LectorEscritorTextoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conjunto;
    }


    @Override
    public void escribirGuardarArchivo(ArrayList<String> textoConjunto, String nombreArchivo) {
        String result = "";
        for(int i = 0; i < textoConjunto.size(); i++){
            result += textoConjunto.get(i) + "\n";
        }
        
        try {
            Charset charset = Charset.forName("UTF-8");
            Path outFile = Paths.get(nombreArchivo + ".txt");
            BufferedWriter writer = null;
            
            writer = Files.newBufferedWriter(outFile, charset);
             
            writer.write(result, 0, result.length());
            
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(LectorEscritorTextoPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

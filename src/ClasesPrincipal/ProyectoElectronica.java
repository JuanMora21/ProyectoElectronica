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
        ArrayList<Registro> registros = proyecto.cargarRegistros();
        ArrayList<Variable> variables = proyecto.cargarVariables();
        ArrayList<Instruccion> instrucciones = proyecto.cargarInstrucciones();
        Memoria memoria = new Memoria(registros,variables,instrucciones);
        VentanaPrincipal interfaz = new VentanaPrincipal(proyecto, lector,memoria);
        interfaz.setVisible(true);
    }

    public ArrayList<String> cargarArchivo(Lector lector) {
        File archivo = lector.seleccionarArchivo();
        setNombreArchivo(archivo.getName());
        if(archivo.getName().endsWith("txt")){
            ArrayList<String> elementos = lector.leerArchivo(archivo);
            return elementos;    
        }else{
            JOptionPane.showMessageDialog(null, "Archivo no compatible, selecciona otro.");
        }
        return null;
    }
    
    public void setNombreArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
    public ArrayList<Registro> cargarRegistros(){
        ArrayList<Registro> registros = new ArrayList();
        Registro r1 = new Registro("eax","00000000",0);
        registros.add(r1);
        Registro r2 = new Registro("ebx","00000001",0);
        registros.add(r2);
        Registro r3 = new Registro("ecx","00000010",0);
        registros.add(r3);
        Registro r4 = new Registro("edx","00000011",0);
        registros.add(r4);
        Registro r5 = new Registro("esi","00000100",0);
        registros.add(r5);
        Registro r6 = new Registro("edi","00000101",0);
        registros.add(r6);
        Registro r7 = new Registro("esp","00000110",0);
        registros.add(r7);
        Registro r8 = new Registro("ebp","00000111",0);
        registros.add(r8);
        return registros;
    }
    
    public ArrayList<Variable> cargarVariables(){
        ArrayList<Variable> variables = new ArrayList();
        Variable v1 = new Variable("variableA","00001000",0,8);
        variables.add(v1);
        return variables;
    }
    
    public ArrayList<Instruccion> cargarInstrucciones(){
        ArrayList<Instruccion> instrucciones = new ArrayList();
        Instruccion i1 = new Instruccion("mov","00000000",0,"mov eax, variableA");
        instrucciones.add(i1);
        Instruccion i2 = new Instruccion("add","00000001",0,"add eax, variableA");
        instrucciones.add(i2);
        Instruccion i3 = new Instruccion("sub","00000010",0,"sub eax, variableA");
        instrucciones.add(i3);
        Instruccion i4 = new Instruccion("mul","00000011",0,"mul variableA");
        instrucciones.add(i4);
        Instruccion i5 = new Instruccion("div","00000100",0,"div variableA");
        instrucciones.add(i5);
        Instruccion i6 = new Instruccion("and","00000101",0,"and eax, variableA");
        instrucciones.add(i6);
        Instruccion i7 = new Instruccion("or","00000110",0,"or eax, variableA");
        instrucciones.add(i7);
        Instruccion i8 = new Instruccion("xor","00000111",0,"xor eax, variableA");
        instrucciones.add(i8);
        Instruccion i9 = new Instruccion("not","00001000",0,"not variableA");
        instrucciones.add(i9);
        return instrucciones;
    }
    
}

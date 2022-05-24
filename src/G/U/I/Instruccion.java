/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.U.I;

/**
 *
 * @author Alejandro Gomez G
 */
public class Instruccion {
      String formato;

    public Instruccion(String nombre, String valorBinario, float valor, String formato) {
        super(nombre, valorBinario, valor);
        setFormato(formato);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesProcesador;

/**
 *
 * @author Alejandro Gomez G
 */
public interface Dato {
    String nombre;
    String valorBinario;
    float valor;

    public Dato(String nombre, String valorBinario, float valor) {
        setNombre(nombre);
        setValorBinario(valorBinario);
        setValor(valor);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValorBinario() {
        return valorBinario;
    }

    public void setValorBinario(String valorBinario) {
        this.valorBinario = valorBinario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

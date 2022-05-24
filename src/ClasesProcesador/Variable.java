package ClasesProcesador;

public class Variable extends Dato {
    int valorDecimal;
    
    public Variable(String nombre, String valorBinario, float valor, int valorDecimal) {
        super(nombre, valorBinario, valor);
        setValorDecimal(valorDecimal);
    }

    public int getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(int valorDecimal) {
        this.valorDecimal = valorDecimal;
    }
    
}

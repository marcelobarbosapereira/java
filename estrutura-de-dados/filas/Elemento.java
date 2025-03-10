package filas;

import java.util.Objects;

public class Elemento {
    private Elemento filhoEsq;
    private Elemento filhoDir;
    private int valor;
    /*Construtor apenas com o valor do elemento da fila*/
    public Elemento(int valor) {
        this.valor = valor;
    }
    /*
     * Equals gerado apenas com o valor para fim de simples conferencia
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o;
        return valor == elemento.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(Elemento filhoDir) {
        this.filhoDir = filhoDir;
    }

    public Elemento getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(Elemento filhoEsq) {
        this.filhoEsq = filhoEsq;
    }
}

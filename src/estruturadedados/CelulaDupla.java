package estruturadedados;

public class CelulaDupla {

    private CelulaDupla anterior;
    private CelulaDupla proxima;
    private int elemento;

    public CelulaDupla() {

    }

    public CelulaDupla(int elemento) {
        this.elemento = elemento;
    }

    public CelulaDupla(CelulaDupla anterior, CelulaDupla proxima, int elemento) {
        this.anterior = anterior;
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public CelulaDupla getAnterior() {
        return anterior;
    }

    public void setAnterior(CelulaDupla anterior) {
        this.anterior = anterior;
    }

    public CelulaDupla getProxima() {
        return proxima;
    }

    public void setProxima(CelulaDupla proxima) {
        this.proxima = proxima;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
}
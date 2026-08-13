package estruturadedados;

public class ListaDuplamenteEncadeada {

    private CelulaDupla cabeca;
    private CelulaDupla cauda;
    private int tamanho = 0;

    public ListaDuplamenteEncadeada() {

    }

    public ListaDuplamenteEncadeada(CelulaDupla cabeca, CelulaDupla cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public CelulaDupla getCabeca() {
        return cabeca;
    }

    public void setCabeca(CelulaDupla cabeca) {
        this.cabeca = cabeca;
    }

    public CelulaDupla getCauda() {
        return cauda;
    }

    public void setCauda(CelulaDupla cauda) {
        this.cauda = cauda;
    }

    public void inserir(int valor) {

        CelulaDupla novaCelula = new CelulaDupla(valor);

        if (cabeca == null) {

            cabeca = novaCelula;
            cauda = novaCelula;

        } else {

            novaCelula.setAnterior(cauda);
            cauda.setProxima(novaCelula);
            cauda = novaCelula;

        }

        tamanho++;
    }

    public void inserirNoComeco(int valor) {

        CelulaDupla novaCelula = new CelulaDupla(valor);

        if (cabeca == null) {

            cabeca = novaCelula;
            cauda = novaCelula;

        } else {

            novaCelula.setProxima(cabeca);
            cabeca.setAnterior(novaCelula);
            cabeca = novaCelula;

        }

        tamanho++;
    }

    public void inserirPorPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            inserirNoComeco(valor);
            return;
        }

        if (posicao == tamanho) {
            inserir(valor);
            return;
        }

        CelulaDupla atual = cabeca;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        CelulaDupla novaCelula = new CelulaDupla(valor);

        CelulaDupla anterior = atual.getAnterior();

        novaCelula.setAnterior(anterior);
        novaCelula.setProxima(atual);

        anterior.setProxima(novaCelula);
        atual.setAnterior(novaCelula);

        tamanho++;
    }

    public void removerDoInicio(int posicao) {

        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        CelulaDupla removida = cabeca;

        if (tamanho == 1) {

            cabeca = null;
            cauda = null;

        } else {

            cabeca = cabeca.getProxima();
            cabeca.setAnterior(null);

            removida.setProxima(null);
        }

        tamanho--;
    }

    public void removerDoFim(int posicao) {

        if (tamanho == 0) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        CelulaDupla removida = cauda;

        if (tamanho == 1) {

            cabeca = null;
            cauda = null;

        } else {

            cauda = cauda.getAnterior();
            cauda.setProxima(null);

            removida.setAnterior(null);
        }

        tamanho--;
    }

    public void removerPorPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            removerDoInicio(posicao);
            return;
        }

        if (posicao == tamanho - 1) {
            removerDoFim(posicao);
            return;
        }

        CelulaDupla removida = cabeca;

        for (int i = 0; i < posicao; i++) {
            removida = removida.getProxima();
        }

        CelulaDupla anterior = removida.getAnterior();
        CelulaDupla proxima = removida.getProxima();

        anterior.setProxima(proxima);
        proxima.setAnterior(anterior);

        removida.setAnterior(null);
        removida.setProxima(null);

        tamanho--;
    }

    @Override
    public String toString() {

        if (tamanho == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");

        CelulaDupla aux = cabeca;

        while (aux != null) {

            sb.append(aux.getElemento());

            if (aux.getProxima() != null) {
                sb.append(",");
            }

            aux = aux.getProxima();
        }

        sb.append("]");

        return sb.toString();
    }
}
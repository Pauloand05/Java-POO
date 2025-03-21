public class Compra {
    int valorTotal;
    int numeroParcelas;

//    À vista
    public Compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

//    parcelado
    public Compra (int qtdParcelas, int valorParcela) {
        numeroParcelas = qtdParcelas;
        valorTotal = qtdParcelas * valorParcela;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }
}

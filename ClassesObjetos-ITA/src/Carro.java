public class Carro {
    int potencia;
    int velocidade;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade = velocidade / 2;
    }

    void imprimir(){
        System.out.format("O carro %s está na velocidade de %d km/h.\n",nome,velocidade);
    }
}

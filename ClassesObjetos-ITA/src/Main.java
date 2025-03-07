//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.velocidade = 0;
        c1.nome = "Toyota";
        c1.potencia = 10;

        Carro c2 = new Carro();

        c2.velocidade = 0;
        c2.nome = "Hilux";
        c2.potencia = 15;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        c2.acelerar();
        c2.acelerar();

        c1.imprimir();
        c2.imprimir();
    }
}
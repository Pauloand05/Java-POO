//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        Personagem heroi2 = new Personagem();
        Personagem heroi3 = new Personagem();
        Personagem heroi4 = new Personagem();

        heroi.nome = "Liu kang";

        heroi2.nome = "Raiden";

        heroi3.nome = "Goro";

        heroi4.nome = "Jhony Cage";

//        heroi.mostrarStatus();
//        heroi.atacar("Raiden","Fogo Ardente");
        heroi.calcularAtributos("Lutador");
        heroi2.calcularAtributos("Mago");
        heroi3.calcularAtributos("Tanque");
        heroi4.calcularAtributos("Suporte");
    }
}

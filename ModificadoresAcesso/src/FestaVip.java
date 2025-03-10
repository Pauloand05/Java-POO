public class FestaVip {
    private int quantidadeCafe = 30;
    private int QuantidadeSalgado = 50;


    public void entrar () {
        tomarCafe();
        comerSalgado();
        tomarCafe();
    }

//    <modificador-método> <retorno método> <nome-método>
     private void tomarCafe() {
        quantidadeCafe--;
        System.out.println("Tomou uma xícara de café!");
    }

    private void comerSalgado() {
        QuantidadeSalgado--;
        System.out.println("Comeu um salgado!");
    }
}

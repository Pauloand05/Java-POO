import java.util.Random;

public class Personagem {
    String nome;
//    String tipoPersonagem;
    int forca;
    int poder;
    int velocidade;
    int magia;


//    metódo ->
    void mostrarStatus(){
        System.out.format("Personagem '%s'\nAtributos \nforça: %d\npoder: %d \nvelocidade: %d\nmagia: %d\n", nome, forca, poder ,velocidade ,magia);
    }

    void calcularAtributos(String tipoPersonagem) {
//    lutador: forca: 10 x 3 poder: 10 x 1 velocidade: 10 x 3  magia: 10 x 0
//    mago: forca: 10 x 0 poder: 10 x 2 velocidade: 10 x 2 magia: 10 x 3
//    tanque: forca: 10 x 3 poder: 10 x 2 velocidade: 10 x 1 magia: 10 x 0
//    suporte: forca: 10 x 0 poder: 10 x 2 velocidade: 10 x 2 magia: 10 x 3

        if(tipoPersonagem == "Lutador"){
            forca = 10 * 3;
            poder = 10 * 1;
            velocidade = 10 * 3;
            magia = 10 * 0;
        } else if (tipoPersonagem == "Mago") {
            forca = 10 * 0;
            poder = 10 * 2;
            velocidade = 10 * 2;
            magia = 10 * 3;
        } else if (tipoPersonagem == "Tanque") {
            forca = 10 * 3;
            poder = 10 * 2;
            velocidade = 10 * 1;
            magia = 10 * 0;
        } else if (tipoPersonagem == "Suporte") {
            forca = 10 * 0;
            poder = 10 * 2;
            velocidade = 10 * 2;
            magia = 10 * 3;
        }
        mostrarStatus();
    }

    int caucularDano() {
        Random gerador = new Random();
        int dano20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dano20Faces;
        return dano;
    }

//    Metodo que não retorna valor e recebe um parâmetro alvo que é do tipo
    void atacar(String alvo, String habilidade){
        int danoCausado = caucularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano\n",nome , alvo,danoCausado );
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano\n",nome ,habilidade , alvo, danoCausado );
        }
    }
}

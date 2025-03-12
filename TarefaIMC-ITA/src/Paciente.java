public class Paciente {
    private double quilos;
    private double altura;

//    Método construtor
    public Paciente(double quilos, double altura){
        this.quilos = quilos;
        this.altura = altura;
    }

//    Método para cacular o IMC
    private double calcularIMC(){
        return quilos / (altura * altura);
    }

//  Método para exibir o diagnóstico
    public void diagnostico(){
        if (calcularIMC() < 16){
            System.out.format("Seu IMC é de %.2f. Baixo peso muito grave!\n",calcularIMC());
        } else if (calcularIMC() >= 16 && calcularIMC() <= 16.99) {
            System.out.format("Seu IMC é de %.2f. Baixo peso grave!\n",calcularIMC());
        } else if (calcularIMC() >= 17 && calcularIMC() <= 18.49) {
            System.out.format("Seu IMC é de %.2f. Baixo peso!\n",calcularIMC());
        } else if (calcularIMC() >= 18.50 && calcularIMC() <= 24.99) {
            System.out.format("Seu IMC é de %.2f. Peso normal!\n",calcularIMC());
        } else if (calcularIMC() >= 25 && calcularIMC() <= 29.99) {
            System.out.format("Seu IMC é de %.2f. Sobrepeso!\n",calcularIMC());
        } else if (calcularIMC() >= 30 && calcularIMC() <= 34.99) {
            System.out.format("Seu IMC é de %.2f. Obesidade grau I!\n",calcularIMC());
        } else if (calcularIMC() >= 35 && calcularIMC() <= 39.99) {
            System.out.format("Seu IMC é de %.2f. Obesidade garu II!\n",calcularIMC());
        } else {
            System.out.format("Seu IMC é de %.2f. Obesidade grau III (Obesidade Mórbida)!\n",calcularIMC());
        }
    }
}

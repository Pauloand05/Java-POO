//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1. iPhone 14 Tamanho da tela: 6,1 polegadas Armazenamento: 128GB, 256GB, 512GB
//        2. Samsung Galaxy S23 Tamanho da tela: 6,1 polegadas Armazenamento: 128GB, 256GB, 512GB
//        3. Xiaomi Redmi Note 12 Tamanho da tela: 6,67 polegadas Armazenamento: 64GB, 128GB, 256GB
//        4. Motorola Edge 30 Tamanho da tela: 6,5 polegadas Armazenamento: 128GB, 256GB
//        5. Samsung Galaxy A54 Tamanho da tela: 6,4 polegadas Armazenamento: 128GB, 256GB

//        Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularNovo1 = new Celular();
        celularNovo1.nome = "iPhone 14";
        celularNovo1.sistemaOperacional = "IOS";
        celularNovo1.espacoArmazenamento = 128;
        celularNovo1.tamanhoTela = 6.1f;

        System.out.format("Nome: %s\nSistema Operacional: %s\nEspaço Armazenamento: %dGB\nTamanho Tela: %.1f\n\n", celularNovo1.nome, celularNovo1.sistemaOperacional, celularNovo1.espacoArmazenamento, celularNovo1.tamanhoTela);

        Celular celularNovo2 = new Celular();
        celularNovo2.nome = "Samsung Galaxy S23";
        celularNovo2.sistemaOperacional = "Android";
        celularNovo2.espacoArmazenamento = 128;
        celularNovo2.tamanhoTela = 6.1f;

        System.out.format("Nome: %s\nSistema Operacional: %s\nEspaço Armazenamento: %dGB\nTamanho Tela: %.1f", celularNovo2.nome, celularNovo2.sistemaOperacional, celularNovo2.espacoArmazenamento, celularNovo2.tamanhoTela);
    }
}
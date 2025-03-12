//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Criando Intâncias
        Paciente paciente1 = new Paciente(63 , 1.80);
        Paciente paciente2 = new Paciente(100, 1.70);
        Paciente paciente3 = new Paciente(190, 1.90);

        paciente1.diagnostico();
        paciente2.diagnostico();
        paciente3.diagnostico();
    }
}

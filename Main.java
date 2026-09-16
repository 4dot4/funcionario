public class Main {
    public static void main(String[] args) {

        Testes testes = new Testes();

        testes.criarFuncionarios();

        System.out.println("=== CÁLCULO DO SALÁRIO ===");
        testes.testarCalcularSalario();

        System.out.println("\n=== CÁLCULO COM FALTAS ===");
        testes.testarCalcularSalarioComFaltas();

        System.out.println("\n=== FALTAS INVÁLIDAS ===");
        testes.numeroDeFaltasInvalido();

        System.out.println("\n=== FUNCIONÁRIOS ===");
        testes.apresentarFuncionarios();
    }
}

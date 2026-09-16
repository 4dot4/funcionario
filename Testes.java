public class Testes {
    Funcionario funcionario1;
    Funcionario funcionario2;
    Funcionario funcionario3;
    Funcionario funcionario4;
    Funcionario funcionario5;
    Funcionario funcionario6;
    Funcionario funcionario7;
    Funcionario funcionario8;
    Funcionario funcionario9;

    public void criarFuncionarios(){
        funcionario1 = new Funcionario("João", "123.456.789-00", 3000, 3);
        funcionario2 = new Funcionario("Maria", "987.654.321-00");
        funcionario3 = new Funcionario("Pedro", "456.789.123-00", 2500);
        funcionario4 = new Funcionario("Ana", "321.654.987-00", 4000, 6);
        funcionario5 = new Funcionario("Lucas", "654.321.987-00", 2000, 1);
        funcionario6 = new Funcionario("Carla", "789.123.456-00", 3500, 4);
        funcionario7 = new Funcionario("Rafael", "111.222.333-44", 2800, 2);
        funcionario8 = new Funcionario("Fernanda", "555.666.777-88", 3200, 5);
        funcionario9 = new Funcionario("Bruno", "999.888.777-66", 1500, 0);
    }
    public void testarCalcularSalario(){
        funcionario1.calcularSalario(funcionario1.getAnosServico(), funcionario1.getSalario());
        System.out.println("Salário do funcionário 1: " + funcionario1.getSalario());
        funcionario2.calcularSalario(funcionario2.getAnosServico(), funcionario2.getSalario());
        System.out.println("Salário do funcionário 2: " + funcionario2.getSalario());
        funcionario3.calcularSalario(funcionario3.getAnosServico(), funcionario3.getSalario());
        System.out.println("Salário do funcionário 3: " + funcionario3.getSalario());
    }
    public void testarCalcularSalarioComFaltas(){
        funcionario4.calcularSalario(5);
        funcionario5.calcularSalario(10);
        funcionario6.calcularSalario(15);
    }
    public void numeroDeFaltasInvalido(){
        funcionario7.calcularSalario(-1);
        funcionario8.calcularSalario(0);
        funcionario9.calcularSalario(30);
    }
    public void atualizarFuncionario(){
        funcionario1.atualizar("123.456.789-00", 3500);
        funcionario2.atualizar("987.654.321-00", 4000, 2);
        funcionario3.atualizar("456.789.123-00", 3000, 4);
        funcionario7.atualizar("111.222.333-44", 3000);
        funcionario8.atualizar("555.666.777-88", 3500, 6);
        funcionario9.atualizar("999.888.777-66", 2000);
    }
    public void apresentarFuncionarios(){
        funcionario1.apresentar();
        funcionario2.apresentar();
        funcionario3.apresentar();
        funcionario4.apresentar();
        funcionario5.apresentar();
        funcionario6.apresentar();
        funcionario7.apresentar();
        funcionario8.apresentar();
        funcionario9.apresentar();
        
        atualizarFuncionario();
        System.out.println("\nApós atualização:\n");
        funcionario1.apresentar();
        funcionario2.apresentar();  
        funcionario3.apresentar();
        funcionario7.apresentar();
        funcionario8.apresentar();
        funcionario9.apresentar();
    }
}

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int anosServico;
    public Funcionario(String nome, String cpf, double salario, int anosServico) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.anosServico = anosServico;
    }
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = 0;
        this.anosServico = 0;
    }
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.anosServico = 0;
    }
    public void calcularSalario(int anosServico, double salario){
        double fatorSenioridade = 1000;
        double taxaCrescimento = 0.04f;
        if (anosServico > 5){
            this.salario = salario + (fatorSenioridade *anosServico);
        }else if (anosServico > 2 && anosServico < 6){
            this.salario = salario * Math.pow(1 + taxaCrescimento, anosServico);
        }else{
            this.salario = salario;
        }
    }
    public void calcularSalario(int faltas){

        if (faltas <=  0 || faltas >= 30){
            System.out.println("Número de faltas inválido");
            return;
        }
        calcularSalario(this.anosServico, this.salario);
        for (int i = 0; i < faltas; i++){
            this.salario -= this.salario * 0.005;
        }
    }

    public void atualizar(String cpf, double salario){
        if (this.cpf.equals(cpf)){
            this.salario = salario;
        }
    }
    public void atualizar(String cpf, double salario, int anosServico){
        if (this.cpf.equals(cpf)){
            this.salario = salario;
            this.anosServico = anosServico;
        }
    }
    public void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
        System.out.println("Anos de serviço: " + this.anosServico);
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public int getAnosServico() {
        return anosServico;
    }
    

}

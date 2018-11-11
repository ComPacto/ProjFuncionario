package projestagio;

public class Funcionario {

    private String nome;
    private double salario;
    private byte dia;
    private byte mes;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double calcularInss() {
        return this.salario * 0.1;
    }

    public double calcularSeguroDeVida() {
        return this.salario * 0.15;
    }

    public double calcularValeRefeicao() {
        return this.salario * 0.11;
    }

    public double calcularValeTransporte() {
        return this.salario * 0.05;
    }

    public double impostos() { //Soma de todos os impostos para serem usados no cálculo total de quanto custa em impostos todos os funcionários
        return this.calcularInss() + this.calcularSeguroDeVida() + this.calcularValeRefeicao() + this.calcularValeTransporte() + this.salario;
    }

    public double custoTotal() { //O custo total de um funcionário, somando seu salário e seus descontos;
        return this.salario + this.calcularInss() + this.calcularSeguroDeVida() + this.calcularValeRefeicao() + this.calcularValeTransporte();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "; INSS: " + this.calcularInss() + "; SegVida: " + this.calcularSeguroDeVida() + "; VR: " + this.calcularValeRefeicao() + "; VT: " + this.calcularValeTransporte() + "; Custo Total: " + this.custoTotal() + "; Data de admissão: " + dia + "/" + mes + "/" + ano;
    }

}

package projestagio;

import java.util.ArrayList;

public class Cadastro {

    ArrayList<Funcionario> listaDeFuncionarios;

    public Cadastro() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    public ArrayList<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(ArrayList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public double calcularImpostos() { //Calcular o total de descontos de todos os funcionários.
        double acumuloImpostos = 0;
        for (int i = 0; i < this.listaDeFuncionarios.size(); i++) {
            acumuloImpostos = acumuloImpostos + this.listaDeFuncionarios.get(i).calcularInss() + this.listaDeFuncionarios.get(i).calcularSeguroDeVida() + this.listaDeFuncionarios.get(i).calcularValeRefeicao() + this.listaDeFuncionarios.get(i).calcularValeTransporte();
        }
        return acumuloImpostos;
    }

    public double calcularSalarios() { //Soma o salário de todos os funcionários.
        double acumuloSalario = 0;
        for (int i = 0; i < this.listaDeFuncionarios.size(); i++) {
            acumuloSalario = acumuloSalario + this.listaDeFuncionarios.get(i).getSalario();
        }
        return acumuloSalario;
    }

    public double calcularTotalGeral() { //Um "for" para calcular quanto valem todos os funcionários para a empresa, que percorre todo o ArrayList, acumulando os valores na váriavel criada no método.
        double acumuloTotal = 0;
        for (int i = 0; i < this.listaDeFuncionarios.size(); i++) {
            acumuloTotal = acumuloTotal + this.listaDeFuncionarios.get(i).impostos();
        }
        return acumuloTotal;
    }

    @Override
    public String toString() {
        String resposta = "";
        for (int i = 0; i < this.listaDeFuncionarios.size(); i++) {
            resposta += "\n::::::::::::::: FUNCIONÁRIO " + (i + 1) + " ::::::::::::::\n"
                    + this.listaDeFuncionarios.get(i) + "\n";
        }
        return resposta + "\n"
                + "Total Impostos: " + this.calcularImpostos() + "\n"
                + "Total Salários: " + this.calcularSalarios() + "\n"
                + "Total Geral: " + this.calcularTotalGeral();
    }
}

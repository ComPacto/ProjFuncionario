package projestagio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Cadastro objCadastro = new Cadastro();
        ArrayList<Funcionario> lista = objCadastro.getListaDeFuncionarios(); //Apenas um atalho para não digitar tanto na hora de adicionar ao ArrayList
        byte op;

        do {
            System.out.println("Informe um número conforme a legenda abaixo: \n"
                    + "1 - Cadastre o Funcionário\n"
                    + "2 - Mostrar Dados\n"
                    + "0 - Encerrar o Sistema");
            op = leia.nextByte();
            switch (op) {
                case 1:
                    System.out.println("Cadastro de Funcionários, preencha os dados abaixo: ");
                    Funcionario objFuncionario = new Funcionario();
                    System.out.println("Nome do funcionário: ");
                    objFuncionario.setNome(leia.next());
                    System.out.println("Salário do funcionário: ");
                    objFuncionario.setSalario(leia.nextDouble());
                    System.out.println("Dia da admissão: ");
                    objFuncionario.setDia(leia.nextByte());
                    System.out.println("Mês da admissão: ");
                    objFuncionario.setMes(leia.nextByte());
                    System.out.println("Ano da admissão: ");
                    objFuncionario.setAno(leia.nextInt());
                    lista.add(objFuncionario);
                    break;
                case 2:
                    System.out.println(objCadastro.toString());
                    break;
                case 0:
                    System.out.println("Sistema encerrado, até mais tarde!");
                    break;
                default:
                    System.out.println("Opção digitada inválida\n"
                            + "Digite novamente");
            }
        } while (op != 0);

    }

}

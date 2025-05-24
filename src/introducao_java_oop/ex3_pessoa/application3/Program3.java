package introducao_java_oop.ex3_pessoa.application3;

import introducao_java_oop.ex3_pessoa.entities3.Pessoa;

public class Program3 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Lucas";
        pessoa1.idade = 25;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Marta";
        pessoa2.idade = 50;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

    }
}

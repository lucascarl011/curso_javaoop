package introducao_java_oop.ex3_pessoa.entities3;

public class Pessoa {

    public String nome;
    public int idade;

    public void exibirDados (){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("-----------------------------");
    }
}

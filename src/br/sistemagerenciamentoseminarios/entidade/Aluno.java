package br.sistemagerenciamentoseminarios.entidade;

public class Aluno {
    private String nome;
    private int idade;

    {
        System.out.println("Aluno Cadastrado com sucesso");
    }
    static{
        System.out.println();
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimirInfosAlunos(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

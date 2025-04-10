package br.sistemagerenciamentoseminarios.entidade;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario seminario;

    {
        System.out.println("Professor cadastrado com sucesso");
    }
    static{
        System.out.println();
    }
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimeInfosProf(){
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade:" + this.especialidade);
        seminario.imprimirInfosSeminario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}

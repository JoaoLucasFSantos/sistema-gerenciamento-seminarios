package br.sistemagerenciamentoseminarios.entidade;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    {
        System.out.println("Seminario cadastrado com sucesso.");
    }
    static{
        System.out.println();
    }
    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }
    public void imprimirInfosSeminario(){
        System.out.println("Seminarios Cadastrados: ");
        System.out.println("Titulo: " + this.titulo);
        local.imprimirInfoLocal();
        for (Aluno aluno : alunos) {
            aluno.imprimirInfosAlunos();
        }
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

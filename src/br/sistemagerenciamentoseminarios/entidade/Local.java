package br.sistemagerenciamentoseminarios.entidade;

public class Local {
    public String endereco;

    {
        System.out.println("Local cadastrado com sucesso");
    }
    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprimirInfoLocal(){
        System.out.println("Local: " + this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

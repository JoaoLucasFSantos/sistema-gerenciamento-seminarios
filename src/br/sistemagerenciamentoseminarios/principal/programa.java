package br.sistemagerenciamentoseminarios.principal;

import br.sistemagerenciamentoseminarios.entidade.Aluno;
import br.sistemagerenciamentoseminarios.entidade.Local;
import br.sistemagerenciamentoseminarios.entidade.Professor;
import br.sistemagerenciamentoseminarios.entidade.Seminario;

public class programa {
    public static void main(String[] args) {
        Local local = new Local();

        Seminario seminario1 = new Seminario();
        Seminario seminario2 = new Seminario();


        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno[] arrayAlunos1 = {aluno1, aluno2};
        Aluno[] arrayAlunos2 = {aluno3, aluno4};

        seminario1.setAlunos(arrayAlunos1);
        seminario2.setAlunos(arrayAlunos2);

        professor1.setSeminario(seminario1);
        professor2.setSeminario(seminario2);

        professor1.imprimeInfosProf();
        professor2.imprimeInfosProf();
    }
}

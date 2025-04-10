package br.sistemagerenciamentoseminarios.principal;

import br.sistemagerenciamentoseminarios.entidade.Aluno;
import br.sistemagerenciamentoseminarios.entidade.Local;
import br.sistemagerenciamentoseminarios.entidade.Professor;
import br.sistemagerenciamentoseminarios.entidade.Seminario;

public class programa {
    public static void main(String[] args) {
        Local local = new Local("Rua Laranjeiras,No.321, Jardim Primavera");

        Seminario seminario1 = new Seminario("Java: Back-End Development", local);
        Seminario seminario2 = new Seminario("JavaScript: Front-End Development", local);


        Professor professor1 = new Professor("Carlos Alberto", "Desenvolvimento Full-Stack");
        Professor professor2 = new Professor("Geraldo Nogueira", "Desenvolvimento Full-Stack");

        Aluno aluno1 = new Aluno("Jorge", 32);
        Aluno aluno2 = new Aluno("Pedro", 25);
        Aluno aluno3 = new Aluno("Larissa", 19);
        Aluno aluno4 = new Aluno("Julia", 29);
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

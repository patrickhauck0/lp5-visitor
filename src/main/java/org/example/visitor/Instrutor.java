package org.example.visitor;

public class Instrutor implements Pessoa {
    private int matricula;
    private String nome;
    private String titulacao;

    public Instrutor(int matricula, String nome, String titulacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirInstrutor(this);
    }
}

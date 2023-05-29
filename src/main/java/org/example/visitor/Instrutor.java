package org.example.visitor;

public class Instrutor implements Pessoa {
    private int matricula;
    private String nome;
    private String patente;

    public Instrutor(int matricula, String nome, String patente) {
        this.matricula = matricula;
        this.nome = nome;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return patente;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirInstrutor(this);
    }
}

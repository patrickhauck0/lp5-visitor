package org.example.visitor;

public class Discente implements Pessoa {
    private int matricula;
    private String nome;
    private ForcaArmada forcaArmada;

    public Discente(int matricula, String nome, ForcaArmada forcaArmada) {
        this.matricula = matricula;
        this.nome = nome;
        this.forcaArmada = forcaArmada;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeForcaArmada() {
        return this.forcaArmada.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDiscente(this);
    }
}

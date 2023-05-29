package org.example.visitor;

public interface Visitor {
    String exibirDiscente(Discente discente);
    String exibirInstrutor(Instrutor instrutor);
    String exibirMilitar(Militar militar);
}

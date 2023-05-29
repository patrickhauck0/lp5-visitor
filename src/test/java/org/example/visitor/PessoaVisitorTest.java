package org.example.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirDiscente() {
        Discente discente = new Discente(1, "Ana", new ForcaArmada("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Discente{matricula=1, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(discente));
    }

    @Test
    void deveExibirProfessor() {
        Instrutor instrutor = new Instrutor(1, "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Instrutor{matricula=1, nome='Maria', titulacao='Doutorado'}", visitor.exibir(instrutor));
    }

    @Test
    void deveExibirMilitar() {
        Militar militar = new Militar(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Militar{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(militar));
    }
}
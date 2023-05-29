package org.example.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {
    @Test
    void deveExibirDiscente() {
        Discente discente = new Discente(1, "Mauricio", new ForcaArmada("Marinha"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Discente{matricula=1, nome='Mauricio', força armada=Marinha}", visitor.exibir(discente));
    }

    @Test
    void deveExibirInstrutor() {
        Instrutor instrutor = new Instrutor(1, "Gabriel", "Coronel");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Instrutor{matricula=1, nome='Gabriel', patente='Coronel'}", visitor.exibir(instrutor));
    }

    @Test
    void deveExibirMilitar() {
        Militar militar = new Militar(1, "Thales", 20000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Militar{codigo=1, nome='Thales', salario=20000.0}", visitor.exibir(militar));
    }
}
package org.example.visitor;

public class PessoaVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirDiscente(Discente discente) {
        return "Discente{" +
                "matricula=" + discente.getMatricula() +
                ", nome='" + discente.getNome() + '\'' +
                ", força armada=" + discente.getNomeForcaArmada() +
                '}';
    }

    @Override
    public String exibirInstrutor(Instrutor instrutor) {
        return "Instrutor{" +
                "matricula=" + instrutor.getMatricula() +
                ", nome='" + instrutor.getNome() + '\'' +
                ", titulacao='" + instrutor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirMilitar(Militar militar) {
        return "Militar{" +
                "codigo=" + militar.getCodigo() +
                ", nome='" + militar.getNome() + '\'' +
                ", salario=" + militar.getSalario() +
                '}';
    }
}

package br.com.institutoafro.exemplos.interfaces;

public class AuxiliarLimpeza implements Funcionario{

    private String nome = "";
    @Override
    public String getNome() {
    
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
       this.nome = nome;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("Auxiliar de LImpeza mantem a escola limpa.");;
    }

}

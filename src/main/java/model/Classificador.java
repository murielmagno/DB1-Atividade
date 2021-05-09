package model;

public abstract class Classificador {
    protected String senha;

    public Classificador(String senha) {
        this.senha = senha;
    }

    abstract int obterBonus();

    abstract int obterContagem();

    abstract Status obterStatus();

    abstract Operador obterOperador();
}

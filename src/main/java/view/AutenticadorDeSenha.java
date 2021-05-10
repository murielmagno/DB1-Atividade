package view;

import model.*;

public class AutenticadorDeSenha {
    int forcaDaSenha;
    String senha;

    public AutenticadorDeSenha(String senha) {
        this.senha = senha;
    }

    public void verificar() {
        var especiais = new ClassificarCaracteresEspeciais(senha);
        var qtCaracteres = new ClassificarQuantidadeCaracteres(senha);
        var maiusculas = new ClassificarLetrasMaiusculas(senha);
        var minusculas = new ClassificarLetrasMinusculas(senha);
        var numeros = new ClassificarNumeros(senha);
        var numerosOuSimbolos = new ClassificarNumerosOuSimbolosMeio(senha);

        forcaDaSenha = especiais.obterBonus() + qtCaracteres.obterBonus() + maiusculas.obterBonus()
        +minusculas.obterBonus() + numeros.obterBonus() + numerosOuSimbolos.obterBonus();

    }

    public String obterComplexidade() {
        if (forcaDaSenha < 20) {
            return "Very Weak";
        } else if (forcaDaSenha < 40) {
            return "Weak";
        } else if (forcaDaSenha < 60) {
            return "Good";
        } else if (forcaDaSenha < 80) {
            return "Strong";
        } else {
            return "Very Strong";
        }
    }
}

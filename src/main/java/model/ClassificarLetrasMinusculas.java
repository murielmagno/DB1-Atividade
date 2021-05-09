package model;

public class ClassificarLetrasMinusculas extends Classificador{
    private int contagem;
    private int bonus;
    private Status status;
    private int letraMinusculas;


    public ClassificarLetrasMinusculas(String senha) {
        super(senha);
        calcularBonus(senha);
    }

    private void calcularBonus(String senha) {
        contagem = senha.length();
        String[] vetorSenha = senha.replaceAll("\\s+", "").split("\\s*");
        for (int i = 0; i < contagem; i++) {
            if (vetorSenha[i].matches("[a-z]")){
                letraMinusculas++;
            }
        }
        bonus = letraMinusculas;
    }

    private void verificarStatus(){
        if (contagem < 8){
            status = Status.FALHA;
        }
        else if (contagem == 8) {
            status = Status.SUFICIENTE;
        }
        else status = Status.EXCEPCIONAL;
    }

    @Override
    public int obterBonus() {
        return bonus;
    }

    @Override
    public int obterContagem() {
        return contagem;
    }

    @Override
    public Status obterStatus() {
        return status;
    }

    @Override
    public Operador obterOperador() {
        return Operador.ADICAO;
    }
}

package model;

public class ClassificarNumeroCaracteres extends Classificador{
    private int contagem;
    private int bonus;
    private Status status;

    public ClassificarNumeroCaracteres(String senha) {
        super(senha);
        calcularBonus(senha);
        verificarStatus();
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

    private void calcularBonus(String senha) {
        contagem = senha.length();
        bonus = contagem * 4;
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

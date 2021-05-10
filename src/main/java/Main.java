import view.AutenticadorDeSenha;

public class Main {

    public static void main(String[] args) {

        var autenticar = new AutenticadorDeSenha("ÇOXC~^][");

        autenticar.verificar();

        System.out.println(autenticar.obterComplexidade());

    }
}

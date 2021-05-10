package view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutenticadorDeSenhaTest {

    @Test
    void verificar() {

        var autenticador = new AutenticadorDeSenha("Aasd^@x");
        autenticador.verificar();
        assertEquals("Good",autenticador.obterComplexidade());
    }
}
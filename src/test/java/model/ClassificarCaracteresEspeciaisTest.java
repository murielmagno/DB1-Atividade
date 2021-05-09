package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassificarCaracteresEspeciaisTest {

    @Test
    void classificarCaracteresEspeciais(){
        var autenticador = new ClassificarCaracteresEspeciais("Aasd^@x");
        assertEquals(12,autenticador.obterBonus());
    }

}
package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassificarNumeroCaracteresTest {


    @Test
    void classificarNumeroCaracteresComOitoCaracteres(){
        var autenticador = new ClassificarNumeroCaracteres("12345678");
        Assertions.assertEquals(32,autenticador.obterBonus());
        Assertions.assertEquals("SUFICIENTE",autenticador.obterStatus());
    }

    @Test
    void classificarNumeroCaracteresVazio(){
        var autenticador = new ClassificarNumeroCaracteres("");
        Assertions.assertEquals(0,autenticador.obterBonus());
        Assertions.assertEquals("FALHA",autenticador.obterStatus());
        Assertions.assertEquals(0,autenticador.obterContagem());
    }

    @Test
    void classificarNumeroCaracteresComMaisDeOitoCaracteres(){
        var autenticador = new ClassificarNumeroCaracteres("asd231safsdfa");
        Assertions.assertEquals(52,autenticador.obterBonus());
        Assertions.assertEquals("EXCEPCIONAL",autenticador.obterStatus());
    }
}

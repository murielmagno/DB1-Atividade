package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassificarQuantidadeCaracteresTest {


    @Test
    void classificarNumeroCaracteresComOitoCaracteres(){
        var autenticador = new ClassificarQuantidadeCaracteres("12345678");
        Assertions.assertEquals(32,autenticador.obterBonus());
        Assertions.assertEquals("SUFICIENTE",autenticador.obterStatus());
    }

    @Test
    void classificarNumeroCaracteresVazio(){
        var autenticador = new ClassificarQuantidadeCaracteres("");
        Assertions.assertEquals(0,autenticador.obterBonus());
        Assertions.assertEquals("FALHA",autenticador.obterStatus());
        Assertions.assertEquals(0,autenticador.obterContagem());
    }

    @Test
    void classificarNumeroCaracteresComMaisDeOitoCaracteres(){
        var autenticador = new ClassificarQuantidadeCaracteres("asd231safsdfa");
        Assertions.assertEquals(52,autenticador.obterBonus());
        Assertions.assertEquals("EXCEPCIONAL",autenticador.obterStatus());
    }
}

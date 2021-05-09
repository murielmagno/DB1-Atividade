package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassificarLetrasMaiusculasTest {

    @Test
    void classificarLetrasMaiusculasSemLetras(){
        var autenticador = new ClassificarLetrasMaiusculas("1234568");
        Assertions.assertEquals(0,autenticador.obterBonus());
    }

    @Test
    void classificarLetrasMaiusculasComLetrasMinusculas(){
        var autenticador = new ClassificarLetrasMaiusculas("123a4568c");
        Assertions.assertEquals(0,autenticador.obterBonus());
    }

    @Test
    void classificarLetrasMaiusculasComDuasLetras(){
        var autenticador = new ClassificarLetrasMaiusculas("1A23456C8");
        Assertions.assertEquals(2,autenticador.obterBonus());
    }
}

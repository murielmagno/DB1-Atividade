package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void dadoDoisNumerosResultarSoma(){

        var calculadora=new Calculadora();

        int resultado = calculadora.soma(4,5);

        assertEquals(resultado,9);
    }
}
package model;

public class Calculadora {

    public int soma(int a, int b){
        return a+b;
    }

    public int multiplicar(int a, int b){
        return Math.multiplyExact(a,b);
    }
}

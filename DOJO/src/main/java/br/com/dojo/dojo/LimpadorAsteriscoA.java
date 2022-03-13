package br.com.dojo.dojo;


public class LimpadorAsteriscoA extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '*'){
            AnalizadorLexico.limpador = EnumLimpador.ASTERISCOF.getEstado();
        }
    }
    
}

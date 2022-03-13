package br.com.dojo.dojo;

public class LimpadorAsteriscoF extends Limpador{
    
    @Override
    public void executa(char c) {
        if (c == '/'){
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
        }
        else{
            AnalizadorLexico.limpador = EnumLimpador.ASTERISCOA.getEstado();
        }
    }
    
}

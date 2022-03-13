package br.com.dojo.dojo;


public class LimpadorBarraI extends Limpador{
    
    @Override
    public void executa(char c){
        AnalizadorLexico.inputLimpo.append(c);
        AnalizadorLexico.limpador = EnumLimpador.ASPAS.getEstado();
    }
    
}

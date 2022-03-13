package br.com.dojo.dojo;


public class LimpadorAspas extends Limpador{  
    @Override
    public void executa(char c) {
        if (c == '\\'){
            AnalizadorLexico.inputLimpo.append(c);
            AnalizadorLexico.limpador = EnumLimpador.BARRAI.getEstado();
        }
        else if (c == '"'){
            AnalizadorLexico.inputLimpo.append(c);
            Classificador("Literal");
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
        }
        else{
            AnalizadorLexico.inputLimpo.append(c);
        }
    }
}

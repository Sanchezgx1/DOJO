
package br.com.dojo.dojo;

public class LimpadorN extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '"'){
            Classificador("Resto");
            AnalizadorLexico.inputLimpo.append(c);            
            AnalizadorLexico.limpador = EnumLimpador.ASPAS.getEstado();
        }
        else if (c == '/'){
            AnalizadorLexico.limpador = EnumLimpador.BARRA.getEstado();
        }
        else if (c == '╚'){
            Classificador("Resto");
        }
        else if (AnalizadorLexico.separador.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexico.inputLimpo.append(c);
            Classificador("Separador");
        }
        else if (c == ' '){
            Classificador("Resto");
        }
        else if (AnalizadorLexico.operador.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexico.inputLimpo.append(c);
            AnalizadorLexico.limpador = EnumLimpador.OPERADOR.getEstado();
        }
        else if (AnalizadorLexico.numero.indexOf(c) != -1){
            Classificador("Resto");
            AnalizadorLexico.inputLimpo.append(c);
            AnalizadorLexico.limpador = EnumLimpador.NUMERO.getEstado();
        }
        else{
            AnalizadorLexico.inputLimpo.append(c);
        }
    }
    
}

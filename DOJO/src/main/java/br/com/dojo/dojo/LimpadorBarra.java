/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dojo.dojo;

public class LimpadorBarra extends Limpador{
    
    @Override
    public void executa(char c){
        if (c == '/'){
            AnalizadorLexico.limpador = EnumLimpador.BARRAS.getEstado();
        }
        else if (c == '*'){
            AnalizadorLexico.limpador = EnumLimpador.ASTERISCOA.getEstado();
        }
        else{
            AnalizadorLexico.inputLimpo.append("/" + c);
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
        }
    }
    
}

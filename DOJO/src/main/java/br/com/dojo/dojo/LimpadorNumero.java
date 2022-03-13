/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dojo.dojo;

/**
 *
 * @author sanch
 */
public class LimpadorNumero extends Limpador{
    
    @Override
    public void executa(char c) {
        if (AnalizadorLexico.numero.indexOf(c) != -1 || c == '.'){
            AnalizadorLexico.inputLimpo.append(c);
        }        
        else{
            Classificador("Numero");
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
            AnalizadorLexico.limpador.executa(c);
        }
    }
    
}

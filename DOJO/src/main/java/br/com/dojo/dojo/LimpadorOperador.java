/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dojo.dojo;

/**
 *
 * @author sanch
 */
public class LimpadorOperador extends Limpador{
    
    @Override
    public void executa(char c) {
        if (AnalizadorLexico.operador.indexOf(c) != -1){
            AnalizadorLexico.inputLimpo.append(c);
        }
        else{
            Classificador("Operador");
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
            AnalizadorLexico.limpador.executa(c);
        }
    }
    
}

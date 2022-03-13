/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dojo.dojo;

/**
 *
 * @author sanch
 */
public class LimpadorBarraBarra extends Limpador{
    @Override
    public void executa(char c) {
        if (c == '╚'){
            AnalizadorLexico.limpador = EnumLimpador.NORMAL.getEstado();
            AnalizadorLexico.inputLimpo.append(' ');
        }
    }
    
}

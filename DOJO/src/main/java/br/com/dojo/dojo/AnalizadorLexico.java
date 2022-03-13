package br.com.dojo.dojo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.*;
import java.util.Scanner;

public class AnalizadorLexico {
    
    public static StringBuilder inputLimpo = new StringBuilder();
    public static Limpador limpador;
    public static ArrayList<Simbolo> tabelaSimbolo = new ArrayList<Simbolo>();
    public static String separador = ";,(){}[]";
    public static String operador = "+-*/%&|<>=!?~^:";
    public static String numero = "0123456789";
    public static ArrayList<String> reservadas = new ArrayList<String>(Arrays.asList("abstract", "arguments", "await", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "debugger", "default", "delete", "do", "double", "else", "enum", "eval", "export", "extends", "false", "final", "finally", "float", "for", "function", "goto", "if", "implements", "import", "in", "instanceof", "int", "interface", "let", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "typeof", "var", "void", "volatile", "while", "with", "yield"));

    public static void main(String[] args) throws Exception {
        File file = new File("H:\\Area de Trabalho\\Java_Aula\\DOJO\\dados.txt");
        Scanner sc = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        String auxstr;
        while (sc.hasNextLine()) {
            auxstr = sc.nextLine().trim();
            if (auxstr.length() < 1) {
                continue;
            } else if (auxstr.length() > 2 && auxstr.startsWith("//")) {
                continue;
            }

            sb.append(auxstr + "╚");
        }
        String midstr = sb.toString();
        limpador = EnumLimpador.NORMAL.getEstado();
        for (char c : midstr.toCharArray()) {
            limpador.executa(c);
        }
        if (inputLimpo.length() > 0) {
            limpador.Classificador("");
        }
        File faiou = new File("TabelaFinal.lex");
        if (!faiou.createNewFile()){
            faiou.delete();
            faiou.createNewFile();
        }
        FileWriter escriba = new FileWriter("TabelaFinal.lex");
        sb.setLength(0);
        for(Simbolo s : tabelaSimbolo){
            sb.append(s.getNumero() + " -||- " + s.getNome() + " -||- " + s.getTipo() + System.lineSeparator());
        }
        escriba.write(sb.toString());
        
    }
    
}

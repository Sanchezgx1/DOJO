package br.com.dojo.dojo;

public abstract class Limpador {
    
    public abstract void executa(char c);

    public void Classificador(String tipo) {
        if (AnalizadorLexico.inputLimpo.length() > 0) {
            String nome = AnalizadorLexico.inputLimpo.toString();
            if (tipo == "Resto"){
                if (AnalizadorLexico.reservadas.contains(nome))
                    tipo = "Palava Reservada";
                else if (nome.indexOf(".") != -1)
                    tipo = "Método";
                else
                    tipo = "Variável";
            }
            Simbolo s = new Simbolo(nome, tipo);
            AnalizadorLexico.tabelaSimbolo.add(s);
            AnalizadorLexico.inputLimpo.setLength(0);
        }
    }
    
}

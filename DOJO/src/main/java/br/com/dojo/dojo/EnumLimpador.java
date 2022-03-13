package br.com.dojo.dojo;


public enum EnumLimpador {
    NORMAL (new LimpadorN()),
    ASPAS(new LimpadorAspas()),
    BARRAI(new LimpadorBarraI()),
    BARRA(new LimpadorBarra()),
    BARRAS(new LimpadorBarraBarra()),
    ASTERISCOA(new LimpadorAsteriscoA()),
    ASTERISCOF(new LimpadorAsteriscoF()),
    OPERADOR(new LimpadorOperador()),
    NUMERO(new LimpadorNumero()); 
    private final Limpador estadoAtual;
    EnumLimpador(Limpador l){
        estadoAtual = l;
    }
    public Limpador getEstado(){
        return estadoAtual;
    }
}

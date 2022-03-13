package br.com.dojo.dojo;


public class Simbolo {
    private int numero;
    private String nome;
    private String tipo;
    static int contador = 1;
    public int getNumero(){return numero;}
    public String getNome(){return nome;}
    public String getTipo(){return tipo;}
    public Simbolo (String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.numero = contador;
        contador++;
    }
}

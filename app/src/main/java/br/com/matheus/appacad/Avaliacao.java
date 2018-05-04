package br.com.matheus.appacad;

import java.io.Serializable;


public class Avaliacao implements Serializable {

    //Campos a serem preenchidos no RecylcerView
    public String Tipo;
    public String Anterior;
    public String Separador;
    public String Atual;


    public Avaliacao(String tipo, String anterior, String separador, String atual) {
        Tipo = tipo;
        Anterior = anterior;
        Separador = separador;
        Atual = atual;
    }

}

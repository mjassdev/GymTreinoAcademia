package br.com.matheus.appacad;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;


public class Avaliacao implements Serializable {

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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getAnterior() {
        return Anterior;
    }

    public void setAnterior(String anterior) {
        Anterior = anterior;
    }

    public String getSeparador() {
        return Separador;
    }

    public void setSeparador(String separador) {
        Separador = separador;
    }

    public String getAtual() {
        return Atual;
    }

    public void setAtual(String atual) {
        Atual = atual;
    }
}

package br.com.matheus.appacad;

import java.io.Serializable;

public class Exercicio implements Serializable {

    public String Nome;
    public String Maquina;
    public String Series;
    public String Repeticoes;
    public String Carga;
    public String Assento;
    public int Img;

    public Exercicio(String nome, String maquina, String series, String repeticoes, String carga, String assento, int img) {
        Nome = nome;
        Maquina = maquina;
        Series = series;
        Repeticoes = repeticoes;
        Carga = carga;
        Assento = assento;
        Img = img;
    }
}

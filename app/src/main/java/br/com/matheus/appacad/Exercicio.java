package br.com.matheus.appacad;

import java.io.Serializable;

public class Exercicio implements Serializable {

    //Campos a serem preenchidos no Lista
    public String Nome;
    public String Maquina;
    public String Series;
    public String Repeticoes;
    public String Carga;
    public String Assento;
    public int Img; //Imagem que será visualizada ao clicar em uma das variáveis acima

    public Exercicio(String nome, String maquina, String series, String repeticoes, String carga, String assento, int img) {
        //Setando cada atributo
        Nome = nome;
        Maquina = maquina;
        Series = series;
        Repeticoes = repeticoes;
        Carga = carga;
        Assento = assento;
        Img = img;
    }
}

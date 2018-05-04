package br.com.matheus.appacad;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ListaAvaliacaoActivity extends AppCompatActivity {

    public ArrayList<Avaliacao> ListaAvaliacao; //declarando arraylist para receber lista de informacoes de avaliacao
    ListView lv; //declarando lista

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_avaliacao);

        lv = (ListView) findViewById(R.id.listaavaliacao); //instanciando lista e defindo view que será usada

        ListaAvaliacao = new ArrayList<>(); //Instanciando ArrayList
        Intent it = getIntent();
        ListaAvaliacao = (ArrayList<Avaliacao>) it.getSerializableExtra("Avaliação");



        ListAdapterAvaliacoes adapterA = new ListAdapterAvaliacoes(
                getApplicationContext(), R.layout.custom_list_layout_avaliacao, ListaAvaliacao //defindo as view a serem utilizadas na lista
        );

        lv.setAdapter((android.widget.ListAdapter) adapterA); //Defindo o uso do adpater que fará a acomodacao dos dados na lista
    }
}

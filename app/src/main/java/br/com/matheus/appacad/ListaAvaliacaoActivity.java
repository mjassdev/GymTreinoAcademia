package br.com.matheus.appacad;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class ListaAvaliacaoActivity extends AppCompatActivity {

    public ArrayList<Avaliacao> ListaAvaliacao;
    RecyclerView rv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avaliacao);

        rv = findViewById(R.id.listaRecyclerAvaliacao);


        ListaAvaliacao = new ArrayList<>();
        Intent it = getIntent();
        ListaAvaliacao = (ArrayList<Avaliacao>) it.getSerializableExtra("Resultados");



        ListaAdapterAvaliacao adapter = new ListaAdapterAvaliacao(
                getApplicationContext(), R.layout.custom_list_layout_avaliacao, ListaAvaliacao);

        rv.setAdapter(adapter);


    }
}

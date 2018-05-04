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


//Classe que será utilizada para Tela de exercicios
public class ListaExerciciosActivity extends AppCompatActivity {

    public ArrayList<Exercicio> ListaExercicios;
    ListView lv;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_exercicios);

        lv = (ListView) findViewById(R.id.exerciciosLV); //Instnciando lista para exercicios
        iv = (ImageView) findViewById(R.id.ivExecicio); //Instanciando imagem para uso em cada exercicio

        ListaExercicios = new ArrayList<>();
        Intent it = getIntent();
        ListaExercicios = (ArrayList<Exercicio>) it.getSerializableExtra("Treino");



        ListAdapter adapter = new ListAdapter(
                getApplicationContext(), R.layout.custom_list_layout, ListaExercicios //Defindo a tela que será atribuida à lista e o ArrayList que será usado
        );

        lv.setAdapter(adapter); //Atribuindo apadtar à lista

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Associando a imagem a cada elemento da linha do exercicio, fazendo isso pelo id de posiçao de cada linha
                Exercicio exercicio = (Exercicio) parent.getItemAtPosition(position);
                Picasso.with(getApplicationContext()).load(exercicio.Img).into(iv); //utilizando biblioteca picasso para armazenar a imagem definida
            }
        });
    }
}

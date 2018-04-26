package br.com.matheus.appacad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Exercicio> ListaExercicios = new ArrayList<Exercicio>();
    //public ArrayList<Avaliacao> ListaAvaliacoes = new ArrayList<~>();
    public ArrayList<Avaliacao> ListaAvaliacao = new ArrayList<Avaliacao>();
    //private RecyclerView recyclerView;
    //private ListaAdapterAvaliacao aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void TreinoA(View v){

        Exercicio titulo = new Exercicio("Exercicio", "Maquina", "Series", "Repetições", "Carga", "Assento", R.drawable.esteira);
        Exercicio e1 = new Exercicio("Corrida", "Esteira", "15 min", "-", "6 / 9", "-", R.drawable.esteira);
        Exercicio e2 = new Exercicio("Supino", "20", "3", "10", "30Kg", "6", R.drawable.supinomaquina);
        Exercicio e3 = new Exercicio("Fly/Peck", "25", "3", "10", "20Kg", "6", R.drawable.flypeckdeck);
        Exercicio e4 = new Exercicio("M. Flexora", "10", "3", "10", "25Kg", "1/3", R.drawable.mesaflexora);
        Exercicio e5 = new Exercicio("Tríceps Polia", "62", "3", "10", "10Kg", "-", R.drawable.tricepspolia);
        Exercicio e6 = new Exercicio("Cad. Abdutora", "4", "3", "10", "40Kg", "2", R.drawable.cadeiraabdutora);
        Exercicio e7 = new Exercicio("Desenv. Maq.", "50", "3", "10", "10Kg", "7", R.drawable.desenvolvimentomaquina);
        Exercicio e8 = new Exercicio("Abd. Ponte (DV)", "-", "3", "-", "15 seg", "-", R.drawable.abdponte);
        ListaExercicios.add(titulo);
        ListaExercicios.add(e1);
        ListaExercicios.add(e2);
        ListaExercicios.add(e3);
        ListaExercicios.add(e4);
        ListaExercicios.add(e5);
        ListaExercicios.add(e6);
        ListaExercicios.add(e7);
        ListaExercicios.add(e8);

        Intent i = new Intent(MainActivity.this, ListaExerciciosActivity.class);
        i.putExtra("Treino", ListaExercicios);
        startActivity(i);

    }

    public void Avaliacao(View v){

        Avaliacao titulo = new Avaliacao("TIPO", "ANTERIOR", "INDICADOR", "ATUAL");
        ListaAvaliacao.add(titulo);
        Avaliacao a1 = new Avaliacao( "Bíceps", "242mm","-->", "250mm");
        ListaAvaliacao.add(a1);
        Avaliacao a2 = new Avaliacao( "Tríceps", "223mm","-->", "246mm");
        ListaAvaliacao.add(a2);
        Avaliacao a3 = new Avaliacao( "Cintura", "820mm","<--", "717mm");
        ListaAvaliacao.add(a3);
        Avaliacao a4 = new Avaliacao( "Flexões", "25/min","-->", "27/min");
        ListaAvaliacao.add(a4);
        Avaliacao a5 = new Avaliacao( "Abdominal", "28/min","-->", "29/min");
        ListaAvaliacao.add(a5);
        Avaliacao a6 = new Avaliacao( "Coxa", "421mm","<--", "400mm");
        ListaAvaliacao.add(a6);
        Avaliacao a7 = new Avaliacao( "Esteira", "8min","<-->", "8min");
        ListaAvaliacao.add(a7);

        Intent i = new Intent(MainActivity.this, ListaAvaliacaoActivity.class);
        i.putExtra("Avaliações", ListaAvaliacao);
        startActivity(i);

    }
}


package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


//Adaptador para lista de Exercícios

public class ListAdapter extends ArrayAdapter<Exercicio> {



    ArrayList<Exercicio> exercicios; //Declarando ArrayList de Exercícios
    Context context;
    int resource;


    public ListAdapter(Context context, int resource, ArrayList<Exercicio> exercicios) {
        //Contruindo Adaptador
        super(context, resource, exercicios);
        this.exercicios = exercicios;
        this.context = context;
        this. resource = resource;

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        if(convertView == null){
            //Inflando dados na view definida
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            //Definindo a View que será utlizada para apresentaçao da lista
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);
        }


        Exercicio exercicio = getItem(position); //Instanciando a linha de cada item de exercício por sua posiçao

        TextView txtNome = (TextView) convertView.findViewById(R.id.tvNome); //Atribuindo o dados de um exercicio ao nome desse
        txtNome.setText(exercicio.Nome.toString());

        TextView txtMaquina = (TextView) convertView.findViewById(R.id.tvMaquina); //Atribuindo o dados de um exercicio à Máquina
        txtMaquina.setText(exercicio.Maquina.toString());

        TextView txtSeries = (TextView) convertView.findViewById(R.id.tvSeries); //Atribuindo o dados de um exercicio à Serie desse
        txtSeries.setText(exercicio.Series.toString());

        TextView txtRepeticoes = (TextView) convertView.findViewById(R.id.tvRepeticoes); //Atribuindo o dados de um exercicio ao numero de repeticoes
        txtRepeticoes.setText(exercicio.Repeticoes.toString());

        TextView txtCarga = (TextView) convertView.findViewById(R.id.tvCarga); //Atribuindo o dados de um exercicio à carga de cada serie e maquina
        txtCarga.setText(exercicio.Carga.toString());

        TextView txtAssento = (TextView) convertView.findViewById(R.id.tvAssento); //Atribuindo o dados de um exercicio ao número do assento/máquina
        txtAssento.setText(exercicio.Assento.toString());

        return convertView;
    }


}
package br.com.matheus.appacad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<Exercicio> {


    ArrayList<Exercicio> exercicios;
    Context context;
    int resource;


    public ListAdapter(Context context, int resource, ArrayList<Exercicio> exercicios) {
        super(context, resource, exercicios);
        this.exercicios = exercicios;
        this.context = context;
        this. resource = resource;

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);
        }


        Exercicio exercicio = getItem(position);

        TextView txtNome = (TextView) convertView.findViewById(R.id.tvNome);
        txtNome.setText(exercicio.Nome.toString());

        TextView txtMaquina = (TextView) convertView.findViewById(R.id.tvMaquina);
        txtMaquina.setText(exercicio.Maquina.toString());

        TextView txtSeries = (TextView) convertView.findViewById(R.id.tvSeries);
        txtSeries.setText(exercicio.Series.toString());

        TextView txtRepeticoes = (TextView) convertView.findViewById(R.id.tvRepeticoes);
        txtRepeticoes.setText(exercicio.Repeticoes.toString());

        TextView txtCarga = (TextView) convertView.findViewById(R.id.tvCarga);
        txtCarga.setText(exercicio.Carga.toString());

        TextView txtAssento = (TextView) convertView.findViewById(R.id.tvAssento);
        txtAssento.setText(exercicio.Assento.toString());

        return convertView;
    }


}